package TFC.Items.Tools;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.Icon;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import TFC.Reference;
import TFC.TFCBlocks;
import TFC.API.ICausesDamage;
import TFC.API.ISize;
import TFC.API.TFCOptions;
import TFC.API.Enums.EnumDamageType;
import TFC.API.Enums.EnumItemReach;
import TFC.API.Enums.EnumSize;
import TFC.API.Enums.EnumWeight;
import TFC.API.Util.Helper;
import TFC.Core.TFCTabs;
import TFC.Core.TFC_Textures;
import TFC.Core.Util.StringUtil;
import TFC.Items.ItemTerra;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

public class ItemWeapon extends ItemSword implements ISize, ICausesDamage
{
	public float weaponDamage;
	public EnumDamageType damageType = EnumDamageType.SLASHING;

	public ItemWeapon(int par1, EnumToolMaterial par2EnumToolMaterial, float damage)
	{
		super(par1, par2EnumToolMaterial);
		this.setMaxDamage(par2EnumToolMaterial.getMaxUses());
		this.weaponDamage = damage;
		setCreativeTab(TFCTabs.TFCWeapons);
		setNoRepair();
	}

	@Override
	public float getDamageVsEntity(Entity par1Entity, ItemStack itemStack)
	{
		return weaponDamage;
	}

	@Override
	public Icon getIcon(ItemStack stack, int pass)
	{
		NBTTagCompound nbt = stack.getTagCompound();
		if(pass == 1 && nbt != null && nbt.hasKey("broken"))
			return TFC_Textures.BrokenItem;
		else
			return getIconFromDamageForRenderPass(stack.getItemDamage(), pass);
	}

	@Override
	public void addInformation(ItemStack is, EntityPlayer player, List arraylist, boolean flag) 
	{
		//Minecraft.getMinecraft().gameSettings.advancedItemTooltips = false;

		ItemTerra.addSizeInformation(is, arraylist);

		ItemTerra.addHeatInformation(is, arraylist);
		

		if(is.getItem() instanceof ICausesDamage)
			arraylist.add(EnumChatFormatting.AQUA + StringUtil.localize(((ICausesDamage)this).GetDamageType().toString()));

		addItemInformation(is, player, arraylist);

		addExtraInformation(is, player, arraylist);

		if(TFCOptions.enableDebugMode)
		{
			NBTTagCompound nbt = is.getTagCompound();
			if(nbt != null && nbt.hasKey("craftingTag") && nbt.getCompoundTag("craftingTag").hasKey("durabuff"))
				arraylist.add("durabuff=" + is.getMaxDamage()+ "/" + is.getItem().getMaxDamage());
		}
	}

	public void addItemInformation(ItemStack is, EntityPlayer player, List arraylist)
	{

	}

	public void addExtraInformation(ItemStack is, EntityPlayer player, List arraylist)
	{

	}

	@Override
	public void registerIcons(IconRegister registerer)
	{
		this.itemIcon = registerer.registerIcon(Reference.ModID + ":" + "tools/"+this.getUnlocalizedName().replace("item.", ""));
	}

	@Override
	public int getItemStackLimit()
	{
		if(canStack())
			return this.getSize(null).stackSize * getWeight(null).multiplier;
		else
			return 1;
	}

	/**
	 * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
	 */
	@Override
	public ItemStack onItemRightClick(ItemStack is, World world, EntityPlayer player)
	{
		MovingObjectPosition objectMouseOver = Helper.getMouseOverObject(player, player.worldObj);

		if(objectMouseOver != null && world.getBlockId(objectMouseOver.blockX, objectMouseOver.blockY, objectMouseOver.blockZ) == TFCBlocks.ToolRack.blockID)
			return is;

		player.setItemInUse(is, this.getMaxItemUseDuration(is));
		return is;
	}

	@Override
	public EnumSize getSize(ItemStack is) {
		// TODO Auto-generated method stub
		return EnumSize.LARGE;
	}

	@Override
	public boolean canStack() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public EnumWeight getWeight(ItemStack is) {
		// TODO Auto-generated method stub
		return EnumWeight.MEDIUM;
	}

	@Override
	public EnumDamageType GetDamageType() 
	{
		return damageType;
	}

	@Override
	public String getItemDisplayName(ItemStack itemstack) 
	{
		return StringUtil.localize(getUnlocalizedName(itemstack).replace(" ", ""));
	}

	@Override
	public Multimap getItemAttributeModifiers()
	{
		Multimap multimap = HashMultimap.create();
		multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(field_111210_e, "Weapon modifier", this.weaponDamage, 0));
		return multimap;
	}

	@Override
	public int getMaxDamage(ItemStack stack)
	{
		NBTTagCompound nbt = stack.getTagCompound();
		if(nbt != null)
		{
			float buff = 0;
			if(nbt.hasKey("craftingTag") && nbt.getCompoundTag("craftingTag").hasKey("durabuff"))
				buff = nbt.getCompoundTag("craftingTag").getFloat("durabuff");
			return (int) (getMaxDamage()+(getMaxDamage()*(buff/100f)));
		}
		else return super.getMaxDamage(stack);
	}

	@Override
	public EnumItemReach getReach(ItemStack is) {
		return EnumItemReach.MEDIUM;
	}
}
