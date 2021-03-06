package TFC;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import TFC.API.Constant.Global;
import TFC.API.Constant.TFCBlockID;
import TFC.Blocks.BlockBloom;
import TFC.Blocks.BlockCharcoal;
import TFC.Blocks.BlockCrop;
import TFC.Blocks.BlockDetailed;
import TFC.Blocks.BlockFireBrick;
import TFC.Blocks.BlockFoodPrep;
import TFC.Blocks.BlockIngotPile;
import TFC.Blocks.BlockLogPile;
import TFC.Blocks.BlockMetalSheet;
import TFC.Blocks.BlockMolten;
import TFC.Blocks.BlockPipeBasic;
import TFC.Blocks.BlockPipeValve;
import TFC.Blocks.BlockSlab;
import TFC.Blocks.BlockStair;
import TFC.Blocks.BlockStalactite;
import TFC.Blocks.BlockSulfur;
import TFC.Blocks.BlockThatch;
import TFC.Blocks.BlockTuyere;
import TFC.Blocks.BlockWoodSupport;
import TFC.Blocks.BlockWoodSupport2;
import TFC.Blocks.BlockWorldItem;
import TFC.Blocks.Devices.BlockBarrel;
import TFC.Blocks.Devices.BlockBarrel2;
import TFC.Blocks.Devices.BlockBellows;
import TFC.Blocks.Devices.BlockBlastFurnace;
import TFC.Blocks.Devices.BlockChestTFC;
import TFC.Blocks.Devices.BlockCrucible;
import TFC.Blocks.Devices.BlockEarlyBloomery;
import TFC.Blocks.Devices.BlockFirepit;
import TFC.Blocks.Devices.BlockForge;
import TFC.Blocks.Devices.BlockNestBox;
import TFC.Blocks.Devices.BlockPottery;
import TFC.Blocks.Devices.BlockQuern;
import TFC.Blocks.Devices.BlockSluice;
import TFC.Blocks.Devices.BlockSpawnMeter;
import TFC.Blocks.Devices.BlockStand;
import TFC.Blocks.Devices.BlockStand2;
import TFC.Blocks.Devices.BlockToolRack;
import TFC.Blocks.Devices.BlockToolRack2;
import TFC.Blocks.Flora.BlockBerryBush;
import TFC.Blocks.Flora.BlockFlora;
import TFC.Blocks.Flora.BlockFrozenSeaGrass;
import TFC.Blocks.Flora.BlockFruitLeaves;
import TFC.Blocks.Flora.BlockFruitWood;
import TFC.Blocks.Flora.BlockLogHoriz;
import TFC.Blocks.Flora.BlockLogHoriz2;
import TFC.Blocks.Flora.BlockLogVert;
import TFC.Blocks.Flora.BlockLogVert2;
import TFC.Blocks.Flora.BlockTallSeaGrassFlowing;
import TFC.Blocks.Flora.BlockTallSeaGrassStill;
import TFC.Blocks.Terrain.BlockDryGrass;
import TFC.Blocks.Terrain.BlockFreshWaterFlowing;
import TFC.Blocks.Terrain.BlockFreshWaterStill;
import TFC.Blocks.Terrain.BlockHotWaterFlowing;
import TFC.Blocks.Terrain.BlockHotWaterStill;
import TFC.Blocks.Terrain.BlockIgEx;
import TFC.Blocks.Terrain.BlockIgExBrick;
import TFC.Blocks.Terrain.BlockIgExCobble;
import TFC.Blocks.Terrain.BlockIgExSmooth;
import TFC.Blocks.Terrain.BlockIgIn;
import TFC.Blocks.Terrain.BlockIgInBrick;
import TFC.Blocks.Terrain.BlockIgInCobble;
import TFC.Blocks.Terrain.BlockIgInSmooth;
import TFC.Blocks.Terrain.BlockMM;
import TFC.Blocks.Terrain.BlockMMBrick;
import TFC.Blocks.Terrain.BlockMMCobble;
import TFC.Blocks.Terrain.BlockMMSmooth;
import TFC.Blocks.Terrain.BlockMoss;
import TFC.Blocks.Terrain.BlockOre;
import TFC.Blocks.Terrain.BlockOre2;
import TFC.Blocks.Terrain.BlockOre3;
import TFC.Blocks.Terrain.BlockSand2;
import TFC.Blocks.Terrain.BlockSed;
import TFC.Blocks.Terrain.BlockSedBrick;
import TFC.Blocks.Terrain.BlockSedCobble;
import TFC.Blocks.Terrain.BlockSedSmooth;
import TFC.Blocks.Vanilla.BlockCustomBed;
import TFC.Blocks.Vanilla.BlockCustomBookshelf;
import TFC.Blocks.Vanilla.BlockCustomButtonWood;
import TFC.Blocks.Vanilla.BlockCustomCactus;
import TFC.Blocks.Vanilla.BlockCustomDoor;
import TFC.Blocks.Vanilla.BlockCustomFence;
import TFC.Blocks.Vanilla.BlockCustomFence2;
import TFC.Blocks.Vanilla.BlockCustomFenceGate;
import TFC.Blocks.Vanilla.BlockCustomFenceGate2;
import TFC.Blocks.Vanilla.BlockCustomFlower;
import TFC.Blocks.Vanilla.BlockCustomFlowing;
import TFC.Blocks.Vanilla.BlockCustomIce;
import TFC.Blocks.Vanilla.BlockCustomLeaves;
import TFC.Blocks.Vanilla.BlockCustomLeaves2;
import TFC.Blocks.Vanilla.BlockCustomLilyPad;
import TFC.Blocks.Vanilla.BlockCustomMushroom;
import TFC.Blocks.Vanilla.BlockCustomPumpkin;
import TFC.Blocks.Vanilla.BlockCustomReed;
import TFC.Blocks.Vanilla.BlockCustomSapling;
import TFC.Blocks.Vanilla.BlockCustomSapling2;
import TFC.Blocks.Vanilla.BlockCustomSnow;
import TFC.Blocks.Vanilla.BlockCustomStationary;
import TFC.Blocks.Vanilla.BlockCustomTallGrass;
import TFC.Blocks.Vanilla.BlockCustomVine;
import TFC.Blocks.Vanilla.BlockCustomWall;
import TFC.Items.ItemBarrels;
import TFC.Items.ItemBarrels2;
import TFC.Items.ItemBlocks.ItemCustomWood2;
import TFC.Items.ItemBlocks.ItemToolRack;
import TFC.Items.ItemBlocks.ItemToolRack2;
import cpw.mods.fml.common.registry.GameRegistry;

public class TFCBlocks 
{
	public static int clayGrassRenderId;
	public static int peatGrassRenderId;
	//////////////////////////////////////////////
	public static int sulfurRenderId;
	public static int woodFruitRenderId;
	public static int leavesFruitRenderId;
	public static int woodThickRenderId;
	public static int woodSupportRenderIdH;
	public static int woodSupportRenderIdV;
	public static int grassRenderId;
	public static int oreRenderId;
	public static int moltenRenderId;
	public static int looseRockRenderId;
	public static int snowRenderId;
	public static int FirepitRenderId;
	public static int AnvilRenderId;
	public static int barrelRenderId;
	public static int standRenderId;
	public static int FenceRenderId;
	public static int FenceGateRenderId;
	public static int NestBoxRenderId;
	public static int BellowsRenderId;
	public static int ForgeRenderId;
	public static int sluiceRenderId;
	public static int toolRackRenderId;
	public static int finiteWaterRenderId;
	public static int partialRenderId;
	public static int stairRenderId;
	public static int slabRenderId;
	public static int cropRenderId;
	public static int cookingPitRenderId;
	public static int leavesRenderId;
	public static int detailedRenderId;
	public static int foodPrepRenderId;
	public static int quernRenderId;
	public static int fluidRenderId;
	public static int woodConstructRenderId;	
	public static int potteryRenderId;
	public static int tuyereRenderId;
	public static int crucibleRenderId;
	public static int berryRenderId;
	public static int pipeRenderId;
	public static int pipeValveRenderId;
	public static int seaWeedRenderId;
	public static int bloomeryRenderId;
	public static int metalsheetRenderId;

	public static Block StoneIgIn;
	public static Block StoneIgEx;
	public static Block StoneSed;
	public static Block StoneMM;
	public static Block StoneIgInCobble;
	public static Block StoneIgExCobble;
	public static Block StoneSedCobble;
	public static Block StoneMMCobble;
	public static Block StoneIgInBrick;
	public static Block StoneIgExBrick;
	public static Block StoneSedBrick;
	public static Block StoneMMBrick;
	public static Block StoneIgInSmooth;
	public static Block StoneIgExSmooth;
	public static Block StoneSedSmooth;
	public static Block StoneMMSmooth;
	public static Block Ore;
	public static Block Ore2;
	public static Block Ore3;
	public static Block Sulfur;
	public static Block Wood;
	public static Block Planks;
	public static Block Planks2;
	public static Block Leaves;
	public static Block Sapling;
	public static Block Leaves2;
	public static Block Sapling2;
	public static Block WoodSupportV;
	public static Block WoodSupportH;
	public static Block WoodSupportV2;
	public static Block WoodSupportH2;
	public static Block Grass;
	public static Block Grass2;
	public static Block Dirt;
	public static Block Dirt2;
	public static Block Clay;
	public static Block Clay2;
	public static Block ClayGrass;
	public static Block ClayGrass2;
	public static Block Peat;
	public static Block PeatGrass;
	public static Block worldItem;
	public static Block LogPile;
	public static Block tilledSoil;
	public static Block tilledSoil2;
	public static Block Firepit;
	public static Block Bellows;
	public static Block Anvil;
	public static Block Anvil2;
	public static Block Forge;
	public static Block BlastFurnace;
	public static Block Molten;
	public static Block Sluice;
	public static Block fruitTreeWood;
	public static Block fruitTreeLeaves;
	public static Block fruitTreeLeaves2;
	public static Block stoneStairs;
	public static Block stoneSlabs;
	public static Block stoneStalac;
	public static Block Sand;
	public static Block Sand2;
	public static Block DryGrass;
	public static Block DryGrass2;
	public static Block Charcoal;
	public static Block Detailed;

	public static Block WoodConstruct;
	public static Block WoodVert;
	public static Block WoodHoriz;
	public static Block WoodHoriz2;
	public static Block ToolRack;
	public static Block ToolRack2;
	public static Block SpawnMeter;
	public static Block FoodPrep;
	public static Block Quern;
	public static Block WallCobbleIgIn;
	public static Block WallCobbleIgEx;
	public static Block WallCobbleSed;
	public static Block WallCobbleMM;
	public static Block WallRawIgIn;
	public static Block WallRawIgEx;
	public static Block WallRawSed;
	public static Block WallRawMM;
	public static Block WallBrickIgIn;
	public static Block WallBrickIgEx;
	public static Block WallBrickSed;
	public static Block WallBrickMM;
	public static Block WallSmoothIgIn;
	public static Block WallSmoothIgEx;
	public static Block WallSmoothSed;
	public static Block WallSmoothMM;

	public static Block[] Doors = new Block[Global.WOOD_ALL.length];

	public static Block IngotPile;
	public static Block Barrel;
	public static Block Barrel2;
	public static Block Pottery;
	public static Block Thatch;
	public static Block Moss;
	public static Block BerryBush;
	public static Block Flora;
	public static Block Tuyere;
	public static Block EarlyBloomery;
	public static Block Bloom;
	public static Block Crucible;
	public static Block FireBrick;
	public static Block MetalSheet;

	public static Block NestBox;

	public static Block Fence;
	public static Block FenceGate;
	public static Block Fence2;
	public static Block FenceGate2;

	public static Block StrawHideBed;

	public static Block ArmourStand;
	public static Block ArmourStand2;

	public static Block LogNatural2;
	public static Block WoodHoriz3;
	public static Block WoodHoriz4;
	public static Block WoodVert2;

	public static Block SteamPipe;
	public static Block SteamPipeValve;

	public static Block FreshWaterStill;
	public static Block FreshWaterFlowing;
	public static Block HotWaterStill;
	public static Block HotWaterFlowing;

	public static Block SeaGrassStill;
	public static Block SeaGrassFrozen;
	public static Block SeaGrassFlowing;

	public static void RegisterBlocks()
	{
		GameRegistry.registerBlock(Ore, TFC.Items.ItemOre1.class, "Ore1");
		GameRegistry.registerBlock(Ore2, TFC.Items.ItemOre2.class, "Ore2");
		GameRegistry.registerBlock(Ore3, TFC.Items.ItemOre3.class, "Ore3");
		GameRegistry.registerBlock(StoneIgIn, TFC.Items.ItemBlocks.ItemIgIn.class, "StoneIgIn");
		GameRegistry.registerBlock(StoneIgEx, TFC.Items.ItemBlocks.ItemIgEx.class, "StoneIgEx");
		GameRegistry.registerBlock(StoneSed, TFC.Items.ItemBlocks.ItemSed.class, "StoneSed");
		GameRegistry.registerBlock(StoneMM, TFC.Items.ItemBlocks.ItemMM.class, "StoneMM");

		GameRegistry.registerBlock(StoneIgInCobble, TFC.Items.ItemBlocks.ItemIgIn.class, "StoneIgInCobble");
		GameRegistry.registerBlock(StoneIgExCobble, TFC.Items.ItemBlocks.ItemIgEx.class, "StoneIgExCobble");
		GameRegistry.registerBlock(StoneSedCobble, TFC.Items.ItemBlocks.ItemSed.class, "StoneSedCobble");
		GameRegistry.registerBlock(StoneMMCobble, TFC.Items.ItemBlocks.ItemMM.class, "StoneMMCobble");
		GameRegistry.registerBlock(StoneIgInSmooth, TFC.Items.ItemBlocks.ItemIgIn.class, "StoneIgInSmooth");
		GameRegistry.registerBlock(StoneIgExSmooth, TFC.Items.ItemBlocks.ItemIgEx.class, "StoneIgExSmooth");
		GameRegistry.registerBlock(StoneSedSmooth, TFC.Items.ItemBlocks.ItemSed.class, "StoneSedSmooth");
		GameRegistry.registerBlock(StoneMMSmooth, TFC.Items.ItemBlocks.ItemMM.class, "StoneMMSmooth");
		GameRegistry.registerBlock(StoneIgInBrick, TFC.Items.ItemBlocks.ItemIgIn.class, "StoneIgInBrick");
		GameRegistry.registerBlock(StoneIgExBrick, TFC.Items.ItemBlocks.ItemIgEx.class, "StoneIgExBrick");
		GameRegistry.registerBlock(StoneSedBrick, TFC.Items.ItemBlocks.ItemSed.class, "StoneSedBrick");
		GameRegistry.registerBlock(StoneMMBrick, TFC.Items.ItemBlocks.ItemMM.class, "StoneMMBrick");

		GameRegistry.registerBlock(Dirt, TFC.Items.ItemBlocks.ItemDirt.class, "Dirt");
		GameRegistry.registerBlock(Dirt2, TFC.Items.ItemBlocks.ItemDirt.class, "Dirt2");
		GameRegistry.registerBlock(Sand, TFC.Items.ItemBlocks.ItemSand.class, "Sand");
		GameRegistry.registerBlock(Sand2, TFC.Items.ItemBlocks.ItemSand.class, "Sand2");
		GameRegistry.registerBlock(Clay, "Clay");
		GameRegistry.registerBlock(Clay2, "Clay2");
		GameRegistry.registerBlock(Grass, TFC.Items.ItemBlocks.ItemTerraBlock.class, "Grass");
		GameRegistry.registerBlock(Grass2, TFC.Items.ItemBlocks.ItemTerraBlock.class, "Grass2");
		GameRegistry.registerBlock(ClayGrass, TFC.Items.ItemBlocks.ItemTerraBlock.class, "ClayGrass");
		GameRegistry.registerBlock(ClayGrass2, TFC.Items.ItemBlocks.ItemTerraBlock.class, "ClayGrass2");
		GameRegistry.registerBlock(PeatGrass, TFC.Items.ItemBlocks.ItemTerraBlock.class, "PeatGrass");
		GameRegistry.registerBlock(Peat, TFC.Items.ItemBlocks.ItemTerraBlock.class, "Peat");
		GameRegistry.registerBlock(DryGrass, TFC.Items.ItemBlocks.ItemTerraBlock.class, "DryGrass");
		GameRegistry.registerBlock(DryGrass2, TFC.Items.ItemBlocks.ItemTerraBlock.class, "DryGrass2");
		GameRegistry.registerBlock(worldItem, "LooseRock");
		GameRegistry.registerBlock(LogPile, "LogPile");
		GameRegistry.registerBlock(Charcoal, "Charcoal");
		GameRegistry.registerBlock(Detailed, "Detailed");

		GameRegistry.registerBlock(tilledSoil, "tilledSoil");
		GameRegistry.registerBlock(tilledSoil2, "tilledSoil2");

		GameRegistry.registerBlock(WoodSupportV, TFC.Items.ItemBlocks.ItemWoodSupport.class,"WoodSupportV");
		GameRegistry.registerBlock(WoodSupportH, TFC.Items.ItemBlocks.ItemWoodSupport.class, "WoodSupportH");
		GameRegistry.registerBlock(WoodSupportV2, TFC.Items.ItemBlocks.ItemWoodSupport2.class,"WoodSupportV2");
		GameRegistry.registerBlock(WoodSupportH2, TFC.Items.ItemBlocks.ItemWoodSupport2.class, "WoodSupportH2");
		GameRegistry.registerBlock(Sulfur, "Sulfur");
		GameRegistry.registerBlock(Block.wood, TFC.Items.ItemBlocks.ItemCustomWood.class, "wood");
		GameRegistry.registerBlock(Block.leaves, TFC.Items.ItemBlocks.ItemCustomLeaves.class, "leaves");
		GameRegistry.registerBlock(Block.sapling, TFC.Items.ItemBlocks.ItemSapling.class, "sapling");
		GameRegistry.registerBlock(TFCBlocks.Leaves2, TFC.Items.ItemBlocks.ItemCustomLeaves2.class, "leaves2");
		GameRegistry.registerBlock(TFCBlocks.Sapling2, TFC.Items.ItemBlocks.ItemSapling2.class, "sapling2");
		GameRegistry.registerBlock(Block.planks, TFC.Items.ItemBlocks.ItemPlankBlock.class, "planks");
		GameRegistry.registerBlock(TFCBlocks.Planks2, TFC.Items.ItemBlocks.ItemPlankBlock2.class, "planks2");
		/*GameRegistry.registerBlock(Block.mushroomBrown, TFC.Items.ItemBlocks.ItemFoodBlock.class, "mushroom");
		GameRegistry.registerBlock(Block.pumpkin, TFC.Items.ItemBlocks.ItemFoodBlock.class, "pumpkin");
		GameRegistry.registerBlock(Block.melon, TFC.Items.ItemBlocks.ItemFoodBlock.class, "melon");*/

		GameRegistry.registerBlock(Firepit, "Firepit");
		GameRegistry.registerBlock(Bellows, TFC.Items.ItemBlocks.ItemBellows.class, "Bellows");
		GameRegistry.registerBlock(Anvil, TFC.Items.ItemBlocks.ItemAnvil1.class, "Anvil");
		GameRegistry.registerBlock(Anvil2, TFC.Items.ItemBlocks.ItemAnvil2.class, "Anvil2");
		GameRegistry.registerBlock(Forge, "Forge");

		GameRegistry.registerBlock(Molten, "Molten");
		GameRegistry.registerBlock(BlastFurnace, TFC.Items.ItemBlocks.ItemTerraBlock.class, "Bloomery");
		GameRegistry.registerBlock(EarlyBloomery, TFC.Items.ItemBlocks.ItemTerraBlock.class, "EarlyBloomery");
		GameRegistry.registerBlock(Sluice, "Sluice");

		GameRegistry.registerBlock(fruitTreeWood, "fruitTreeWood");
		GameRegistry.registerBlock(fruitTreeLeaves, "fruitTreeLeaves");
		GameRegistry.registerBlock(fruitTreeLeaves2, "fruitTreeLeaves2");

		GameRegistry.registerBlock(stoneStairs, "stoneStairs");
		GameRegistry.registerBlock(stoneSlabs, "stoneSlabs");
		GameRegistry.registerBlock(stoneStalac, "stoneStalac");

		GameRegistry.registerBlock(WoodConstruct, "WoodConstruct");
		GameRegistry.registerBlock(WoodVert, "WoodVert");
		GameRegistry.registerBlock(WoodHoriz, "WoodHoriz");
		GameRegistry.registerBlock(WoodHoriz2, "WoodHoriz2");


		GameRegistry.registerBlock(LogNatural2,ItemCustomWood2.class,"LogNatural2");
		GameRegistry.registerBlock(WoodVert2, "WoodVert2");
		GameRegistry.registerBlock(WoodHoriz3, "WoodHoriz3");
		GameRegistry.registerBlock(WoodHoriz4, "WoodHoriz4");

		GameRegistry.registerBlock(ToolRack, ItemToolRack.class,"ToolRack");
		GameRegistry.registerBlock(ToolRack2, ItemToolRack2.class,"ToolRack2");
		GameRegistry.registerBlock(SpawnMeter, TFC.Items.ItemBlocks.ItemTerraBlock.class, "SpawnMeter");
		GameRegistry.registerBlock(FoodPrep, "FoodPrep");
		GameRegistry.registerBlock(Quern, TFC.Items.ItemBlocks.ItemTerraBlock.class, "Quern");
		GameRegistry.registerBlock(WallCobbleIgIn, TFC.Items.ItemBlocks.ItemIgIn.class, "WallCobbleIgIn");
		GameRegistry.registerBlock(WallCobbleIgEx, TFC.Items.ItemBlocks.ItemIgEx.class, "WallCobbleIgEx");
		GameRegistry.registerBlock(WallCobbleSed, TFC.Items.ItemBlocks.ItemSed.class, "WallCobbleSed");
		GameRegistry.registerBlock(WallCobbleMM, TFC.Items.ItemBlocks.ItemMM.class, "WallCobbleMM");
		GameRegistry.registerBlock(WallRawIgIn, TFC.Items.ItemBlocks.ItemIgIn.class, "WallRawIgIn");
		GameRegistry.registerBlock(WallRawIgEx, TFC.Items.ItemBlocks.ItemIgEx.class, "WallRawIgEx");
		GameRegistry.registerBlock(WallRawSed, TFC.Items.ItemBlocks.ItemSed.class, "WallRawSed");
		GameRegistry.registerBlock(WallRawMM, TFC.Items.ItemBlocks.ItemMM.class, "WallRawMM");
		GameRegistry.registerBlock(WallBrickIgIn, TFC.Items.ItemBlocks.ItemIgIn.class, "WallBrickIgIn");
		GameRegistry.registerBlock(WallBrickIgEx, TFC.Items.ItemBlocks.ItemIgEx.class, "WallBrickIgEx");
		GameRegistry.registerBlock(WallBrickSed, TFC.Items.ItemBlocks.ItemSed.class, "WallBrickSed");
		GameRegistry.registerBlock(WallBrickMM, TFC.Items.ItemBlocks.ItemMM.class, "WallBrickMM");
		GameRegistry.registerBlock(WallSmoothIgIn, TFC.Items.ItemBlocks.ItemIgIn.class, "WallSmoothIgIn");
		GameRegistry.registerBlock(WallSmoothIgEx, TFC.Items.ItemBlocks.ItemIgEx.class, "WallSmoothIgEx");
		GameRegistry.registerBlock(WallSmoothSed, TFC.Items.ItemBlocks.ItemSed.class, "WallSmoothSed");
		GameRegistry.registerBlock(WallSmoothMM, TFC.Items.ItemBlocks.ItemMM.class, "WallSmoothMM");
		GameRegistry.registerBlock(SteamPipe, TFC.Items.ItemBlocks.ItemPipe.class, "BasicPipe");
		GameRegistry.registerBlock(SteamPipeValve, TFC.Items.ItemBlocks.ItemPipeValve.class, "ValvePipe");

		GameRegistry.registerBlock(FreshWaterStill,"FreshWaterStill");
		GameRegistry.registerBlock(FreshWaterFlowing,"FreshWaterFlowing");
		GameRegistry.registerBlock(HotWaterStill,"HotWaterStill");
		GameRegistry.registerBlock(HotWaterFlowing,"HotWaterFlowing");

		GameRegistry.registerBlock(SeaGrassStill,"SeaGrassStill");
		GameRegistry.registerBlock(SeaGrassFrozen,"SeaGrassFrozen");
		GameRegistry.registerBlock(SeaGrassFlowing,"SeaGrassFlowing");

		GameRegistry.registerBlock(FireBrick, "FireBrick");
		GameRegistry.registerBlock(MetalSheet, "MetalSheet");

		// Wooden Doors
		for (int i=0; i < Global.WOOD_ALL.length; i++)
			GameRegistry.registerBlock(Doors[i], "Door"+Global.WOOD_ALL[i].replaceAll(" ", ""));

		GameRegistry.registerBlock(IngotPile, "IngotPile");
		GameRegistry.registerBlock(Barrel, ItemBarrels.class,"Barrel");
		GameRegistry.registerBlock(Barrel2, ItemBarrels2.class,"Barrel2");
		GameRegistry.registerBlock(Moss, "Moss");

		GameRegistry.registerBlock(Flora, TFC.Items.ItemBlocks.ItemFlora.class,"Flora");
		GameRegistry.registerBlock(Pottery, "ClayPottery");
		GameRegistry.registerBlock(Thatch, TFC.Items.ItemBlocks.ItemTerraBlock.class, "Thatch");
		GameRegistry.registerBlock(Tuyere, "Tuyere");
		GameRegistry.registerBlock(Crucible, TFC.Items.ItemBlocks.ItemCrucible.class, "Crucible");
		GameRegistry.registerBlock(NestBox, TFC.Items.ItemBlocks.ItemTerraBlock.class, "NestBox");
		GameRegistry.registerBlock(Fence,TFC.Items.ItemBlocks.ItemFence.class,"Fence");
		GameRegistry.registerBlock(Fence2,TFC.Items.ItemBlocks.ItemFence2.class,"Fence2");
		GameRegistry.registerBlock(Block.fenceGate,TFC.Items.ItemBlocks.ItemFenceGate.class,"FenceGate");	
		GameRegistry.registerBlock(FenceGate2,TFC.Items.ItemBlocks.ItemFenceGate2.class,"FenceGate2");
		GameRegistry.registerBlock(StrawHideBed,"StrawHideBed");
		GameRegistry.registerBlock(ArmourStand,TFC.Items.ItemBlocks.ItemArmourStand.class,"ArmourStand");
		GameRegistry.registerBlock(ArmourStand2,TFC.Items.ItemBlocks.ItemArmourStand2.class,"ArmourStand2");
		GameRegistry.registerBlock(BerryBush,TFC.Items.ItemBlocks.ItemBerryBush.class,"BerryBush");
		//FluidRegistry.registerFluid(new Fluid("freshWater").setBlockID(TFCBlocks.FreshWaterStill.blockID).setUnlocalizedName(TFCBlocks.FreshWaterStill.getUnlocalizedName()));
		//FluidRegistry.registerFluid(new Fluid("hotWater").setBlockID(TFCBlocks.HotWaterStill.blockID).setUnlocalizedName(TFCBlocks.HotWaterStill.getUnlocalizedName()));
	}

	public static void LoadBlocks()
	{
		System.out.println(new StringBuilder().append("[TFC] Loading Blocks").toString());

		Block.blocksList[5] = null;
		Block.blocksList[6] = null;
		Block.blocksList[8] = null;
		Block.blocksList[9] = null;
		Block.blocksList[10] = null;
		Block.blocksList[17] = null;
		Block.blocksList[18] = null;
		Block.blocksList[31] = null;
		Block.blocksList[37] = null;
		Block.blocksList[38] = null;
		Block.blocksList[39] = null;
		Block.blocksList[40] = null;
		Block.blocksList[47] = null;
		Block.blocksList[50] = null;
		Block.blocksList[53] = null;
		Block.blocksList[54] = null;
		Block.blocksList[58] = null;
		Block.blocksList[59] = null;
		Block.blocksList[78] = null;
		Block.blocksList[79] = null;
		Block.blocksList[81] = null;
		Block.blocksList[83] = null;
		Block.blocksList[86] = null;
		Block.blocksList[106] = null;
		Block.blocksList[107] = null;
		Block.blocksList[111] = null;
		Block.blocksList[125].setCreativeTab(null);
		Block.blocksList[126].setCreativeTab(null);
		Block.blocksList[134].setCreativeTab(null);
		Block.blocksList[135].setCreativeTab(null);
		Block.blocksList[136].setCreativeTab(null);
		Block.blocksList[143] = null;

		Block.blocksList[5] = (new TFC.Blocks.BlockPlanks(5, Material.wood)).setHardness(4.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("wood").setTextureName("planks");
		Block.blocksList[6] = (new BlockCustomSapling(6)).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("sapling");
		Block.blocksList[8] = (new BlockCustomFlowing(8, Material.water)).setHardness(100.0F).setLightOpacity(3).setUnlocalizedName("water");
		Block.blocksList[9] = (new BlockCustomStationary(9, Material.water)).setHardness(100.0F).setLightOpacity(3).setUnlocalizedName("water");
		Block.blocksList[10] = (new BlockCustomFlowing(10, Material.lava)).setHardness(0.0F).setLightValue(1.0F).setLightOpacity(255).setUnlocalizedName("lava");
		Block.blocksList[17] = (new TFC.Blocks.Flora.BlockLogNatural(17)).setHardness(50.0F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("log");
		Block.blocksList[18] = (new BlockCustomLeaves(18)).setHardness(0.2F).setLightOpacity(1).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("leaves");
		Block.blocksList[31] = (new BlockCustomTallGrass(31)).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("tallgrass");
		Block.blocksList[37] = (new BlockCustomFlower(37)).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("flower").setTextureName("flower_dandelion");
		Block.blocksList[38] = (new BlockCustomFlower(38)).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("rose").setTextureName("flower_rose");
		Block.blocksList[39] = (new BlockCustomMushroom(39, "mushroom_brown")).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setLightValue(0.125F).setUnlocalizedName("mushroom").setTextureName("mushroom_brown");
		Block.blocksList[40] = (new BlockCustomMushroom(40, "mushroom_red")).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("mushroom").setTextureName("mushroom_red");
		Block.blocksList[47] = (new BlockCustomBookshelf(47)).setHardness(1.5F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("bookshelf").setTextureName("bookshelf");
		Block.blocksList[53] = (new BlockStair(53, Material.wood)).setUnlocalizedName("stairsWood");
		Block.blocksList[50] = (new TFC.Blocks.Vanilla.BlockTorch(50)).setHardness(0.0F).setLightValue(0.9375F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("torch").setTextureName("torch_on");
		Block.blocksList[54] = (new BlockChestTFC(54, 0)).setHardness(2.5F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("chest");
		Block.blocksList[58] = (new TFC.Blocks.Devices.BlockWorkbench(58)).setHardness(2.5F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("workbench");
		Block.blocksList[59] = (new BlockCrop(59, 88)).setHardness(0.3F).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("crops");
		Block.blocksList[78] = (new BlockCustomSnow(78)).setHardness(0.1F).setStepSound(Block.soundClothFootstep).setUnlocalizedName("snow").setLightOpacity(1);
		Block.blocksList[79] = (new BlockCustomIce(79)).setHardness(0.5F).setLightOpacity(3).setStepSound(Block.soundGlassFootstep).setUnlocalizedName("ice");
		Block.blocksList[81] = (new BlockCustomCactus(81)).setHardness(0.4F).setStepSound(Block.soundClothFootstep).setUnlocalizedName("cactus");
		Block.blocksList[83] = (new BlockCustomReed(83)).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("reeds").setTextureName("reeds");;
		Block.blocksList[86] = (new BlockCustomPumpkin(86, false)).setHardness(1.0F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("pumpkin").setTextureName("pumpkin");
		Block.blocksList[106] = (new BlockCustomVine(106)).setHardness(0.2F).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("vine").setTextureName("vine");
		Block.blocksList[107] = (new BlockCustomFenceGate(107).setUnlocalizedName("FenceGateTFC").setHardness(2));
		Block.blocksList[111] = (new BlockCustomLilyPad(111)).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("waterlily").setTextureName("waterlily");
		Block.blocksList[143] = (new BlockCustomButtonWood(143)).setHardness(0.5F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("button");

		TFCBlocks.Planks = Block.blocksList[5];
		TFCBlocks.Planks2  = (new TFC.Blocks.BlockPlanks2(TFCBlockID.Wood2, Material.wood)).setHardness(4.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("wood2").setTextureName("planks");
		TFCBlocks.Wood = Block.blocksList[17];
		TFCBlocks.Leaves = Block.blocksList[18];
		TFCBlocks.Leaves2 = (new BlockCustomLeaves2(TFCBlockID.Leaves2)).setHardness(0.2F).setLightOpacity(1).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("leaves2");
		TFCBlocks.Sapling = Block.blocksList[6];
		TFCBlocks.Sapling2 = (new BlockCustomSapling2(TFCBlockID.Sapling2)).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("sapling2");

		TFCBlocks.StoneIgInCobble = new BlockIgInCobble(TFCBlockID.StoneIgInCobble, Material.rock).setHardness(13F).setResistance(10F).setUnlocalizedName("IgInRockCobble");
		TFCBlocks.StoneIgIn = new BlockIgIn(TFCBlockID.StoneIgIn, Material.rock, TFCBlocks.StoneIgInCobble.blockID).setHardness(13F).setResistance(10F).setUnlocalizedName("IgInRock");	
		TFCBlocks.StoneIgInSmooth = new BlockIgInSmooth(TFCBlockID.StoneIgInSmooth).setHardness(13F).setResistance(20F).setUnlocalizedName("IgInRockSmooth");
		TFCBlocks.StoneIgInBrick = new BlockIgInBrick(TFCBlockID.StoneIgInBrick).setHardness(13F).setResistance(15F).setUnlocalizedName("IgInRockBrick");

		TFCBlocks.StoneSedCobble = new BlockSedCobble(TFCBlockID.StoneSedCobble, Material.rock).setHardness(10F).setResistance(10F).setUnlocalizedName("SedRockCobble");
		TFCBlocks.StoneSed = new BlockSed(TFCBlockID.StoneSed, Material.rock, TFCBlocks.StoneSedCobble.blockID).setHardness(10F).setResistance(7F).setUnlocalizedName("SedRock");
		TFCBlocks.StoneSedSmooth = new BlockSedSmooth(TFCBlockID.StoneSedSmooth).setHardness(10F).setResistance(20F).setUnlocalizedName("SedRockSmooth");
		TFCBlocks.StoneSedBrick = new BlockSedBrick(TFCBlockID.StoneSedBrick).setHardness(10F).setResistance(15F).setUnlocalizedName("SedRockBrick");

		TFCBlocks.StoneIgExCobble = new BlockIgExCobble(TFCBlockID.StoneIgExCobble, Material.rock).setHardness(13F).setResistance(10F).setUnlocalizedName("IgExRockCobble");
		TFCBlocks.StoneIgEx = new BlockIgEx(TFCBlockID.StoneIgEx, Material.rock, TFCBlocks.StoneIgExCobble.blockID).setHardness(13F).setResistance(10F).setUnlocalizedName("IgExRock");
		TFCBlocks.StoneIgExSmooth = new BlockIgExSmooth(TFCBlockID.StoneIgExSmooth).setHardness(13F).setResistance(20F).setUnlocalizedName("IgExRockSmooth");
		TFCBlocks.StoneIgExBrick = new BlockIgExBrick(TFCBlockID.StoneIgExBrick).setHardness(13F).setResistance(15F).setUnlocalizedName("IgExRockBrick");

		TFCBlocks.StoneMMCobble = new BlockMMCobble(TFCBlockID.StoneMMCobble, Material.rock).setHardness(10F).setResistance(10F).setUnlocalizedName("MMRockCobble");
		TFCBlocks.StoneMM = new BlockMM(TFCBlockID.StoneMM, Material.rock, TFCBlocks.StoneMMCobble.blockID).setHardness(10F).setResistance(8F).setUnlocalizedName("MMRock");
		TFCBlocks.StoneMMSmooth = new BlockMMSmooth(TFCBlockID.StoneMMSmooth).setHardness(10F).setResistance(20F).setUnlocalizedName("MMRockSmooth");
		TFCBlocks.StoneMMBrick = new BlockMMBrick(TFCBlockID.StoneMMBrick).setHardness(10F).setResistance(15F).setUnlocalizedName("MMRockBrick");

		TFCBlocks.Dirt = (new TFC.Blocks.Terrain.BlockDirt(TFCBlockID.Dirt, 0, TFCBlocks.tilledSoil)).setHardness(2F).setStepSound(Block.soundGravelFootstep).setUnlocalizedName("dirt");
		TFCBlocks.Dirt2 = (new TFC.Blocks.Terrain.BlockDirt2(TFCBlockID.Dirt2, 16, TFCBlocks.tilledSoil2)).setHardness(2F).setStepSound(Block.soundGravelFootstep).setUnlocalizedName("dirt");
		TFCBlocks.Clay = (new TFC.Blocks.Terrain.BlockClay(TFCBlockID.Clay)).setHardness(3F).setStepSound(Block.soundGravelFootstep).setUnlocalizedName("clay");
		TFCBlocks.Clay2 = (new TFC.Blocks.Terrain.BlockClay2(TFCBlockID.Clay2)).setHardness(3F).setStepSound(Block.soundGravelFootstep).setUnlocalizedName("clay");
		TFCBlocks.ClayGrass = new TFC.Blocks.Terrain.BlockClayGrass(TFCBlockID.ClayGrass, 0).setHardness(3F).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("ClayGrass"); 
		TFCBlocks.ClayGrass2 = new TFC.Blocks.Terrain.BlockClayGrass(TFCBlockID.ClayGrass2, 16).setHardness(3F).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("ClayGrass"); 
		TFCBlocks.Grass = (new TFC.Blocks.Terrain.BlockGrass(TFCBlockID.Grass)).setHardness(3F).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("Grass");
		TFCBlocks.Grass2 = new TFC.Blocks.Terrain.BlockGrass(TFCBlockID.Grass2, 16).setHardness(3F).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("Grass");
		TFCBlocks.Peat = new TFC.Blocks.Terrain.BlockPeat(TFCBlockID.Peat).setHardness(3F).setStepSound(Block.soundGravelFootstep).setUnlocalizedName("Peat");
		TFCBlocks.PeatGrass = new TFC.Blocks.Terrain.BlockPeatGrass(TFCBlockID.PeatGrass).setHardness(3F).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("PeatGrass");
		TFCBlocks.DryGrass = new BlockDryGrass(TFCBlockID.DryGrass, 0).setHardness(3F).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("DryGrass");
		TFCBlocks.DryGrass2 =new BlockDryGrass(TFCBlockID.DryGrass2, 16).setHardness(3F).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("DryGrass");

		TFCBlocks.Ore = new BlockOre(TFCBlockID.Ore, Material.rock).setHardness(10F).setResistance(10F).setUnlocalizedName("Ore");
		TFCBlocks.Ore2 = new BlockOre2(TFCBlockID.Ore2, Material.rock).setHardness(10F).setResistance(10F).setUnlocalizedName("Ore");
		TFCBlocks.Ore3 = new BlockOre3(TFCBlockID.Ore3, Material.rock).setHardness(10F).setResistance(10F).setUnlocalizedName("Ore");
		TFCBlocks.worldItem = new BlockWorldItem(TFCBlockID.LooseRock).setHardness(0.05F).setResistance(1F).setUnlocalizedName("LooseRock");
		TFCBlocks.LogPile = new BlockLogPile(TFCBlockID.LogPile).setHardness(10F).setResistance(1F).setUnlocalizedName("LogPile");

		TFCBlocks.Sulfur = new BlockSulfur(TFCBlockID.Sulfur, Material.rock).setUnlocalizedName("Sulfur").setHardness(0.5F).setResistance(1F);
		TFCBlocks.WoodSupportV = new BlockWoodSupport(TFCBlockID.WoodSupportV, Material.wood).setUnlocalizedName("WoodSupportV").setHardness(0.5F).setResistance(1F);
		TFCBlocks.WoodSupportH = new BlockWoodSupport(TFCBlockID.WoodSupportH, Material.wood).setUnlocalizedName("WoodSupportH").setHardness(0.5F).setResistance(1F);
		TFCBlocks.WoodSupportV2 = new BlockWoodSupport2(TFCBlockID.WoodSupportV2, Material.wood).setUnlocalizedName("WoodSupportV2").setHardness(0.5F).setResistance(1F);
		TFCBlocks.WoodSupportH2 = new BlockWoodSupport2(TFCBlockID.WoodSupportH2, Material.wood).setUnlocalizedName("WoodSupportH2").setHardness(0.5F).setResistance(1F);

		TFCBlocks.tilledSoil = new TFC.Blocks.BlockFarmland(TFCBlockID.tilledSoil, TFCBlocks.Dirt.blockID, 0).setHardness(2F).setStepSound(Block.soundGravelFootstep).setUnlocalizedName("tilledSoil");
		TFCBlocks.tilledSoil2 = new TFC.Blocks.BlockFarmland(TFCBlockID.tilledSoil2, TFCBlocks.Dirt2.blockID, 16).setHardness(2F).setStepSound(Block.soundGravelFootstep).setUnlocalizedName("tilledSoil2");

		TFCBlocks.fruitTreeWood = new BlockFruitWood(TFCBlockID.fruitTreeWood).setUnlocalizedName("fruitTreeWood").setHardness(5.5F).setResistance(2F);
		TFCBlocks.fruitTreeLeaves = new BlockFruitLeaves(TFCBlockID.fruitTreeLeaves, 0).setUnlocalizedName("fruitTreeLeaves").setHardness(0.5F).setResistance(1F).setStepSound(Block.soundGrassFootstep);
		TFCBlocks.fruitTreeLeaves2 = new BlockFruitLeaves(TFCBlockID.fruitTreeLeaves2, 8).setUnlocalizedName("fruitTreeLeaves2").setHardness(0.5F).setResistance(1F).setStepSound(Block.soundGrassFootstep);

		TFCBlocks.Sand = new TFC.Blocks.Terrain.BlockSand(TFCBlockID.Sand, 0).setHardness(0.5F).setStepSound(Block.soundSandFootstep).setUnlocalizedName("sand");
		TFCBlocks.Sand2 = new BlockSand2(TFCBlockID.Sand2, 16).setHardness(0.5F).setStepSound(Block.soundSandFootstep).setUnlocalizedName("sand");

		TFCBlocks.WoodConstruct = (new TFC.Blocks.BlockWoodConstruct(TFCBlockID.WoodConstruct)).setHardness(4F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("WoodConstruct");

		TFCBlocks.Firepit = new BlockFirepit(TFCBlockID.Firepit).setUnlocalizedName("Firepit").setHardness(1).setLightValue(0F);
		TFCBlocks.Bellows = new BlockBellows(TFCBlockID.Bellows,Material.wood).setUnlocalizedName("Bellows").setHardness(2);
		TFCBlocks.Forge= new BlockForge(TFCBlockID.Forge).setUnlocalizedName("Forge").setHardness(20).setLightValue(0F);
		TFCBlocks.Anvil = new TFC.Blocks.Devices.BlockAnvil(TFCBlockID.Anvil).setUnlocalizedName("Anvil").setHardness(3).setResistance(100F);
		TFCBlocks.Anvil2 = new TFC.Blocks.Devices.BlockAnvil(TFCBlockID.Anvil2, 8).setUnlocalizedName("Anvil2").setHardness(3).setResistance(100F);

		TFCBlocks.Molten = new BlockMolten(TFCBlockID.Molten).setUnlocalizedName("Molten").setHardness(20);
		TFCBlocks.BlastFurnace = new BlockBlastFurnace(TFCBlockID.BlastFurnace).setUnlocalizedName("BlastFurnace").setHardness(20).setLightValue(0F);
		TFCBlocks.EarlyBloomery = new BlockEarlyBloomery(TFCBlockID.EarlyBloomery).setUnlocalizedName("EarlyBloomery").setHardness(20).setLightValue(0F);
		TFCBlocks.Bloom = new BlockBloom(TFCBlockID.Bloom).setUnlocalizedName("Bloom").setHardness(20).setLightValue(0F);
		TFCBlocks.Sluice = new BlockSluice(TFCBlockID.Sluice).setUnlocalizedName("Sluice").setHardness(2F).setResistance(20F);

		TFCBlocks.stoneStairs = new BlockStair(TFCBlockID.stoneStairs, Material.rock).setUnlocalizedName("stoneStairs").setHardness(10).setResistance(15F);
		TFCBlocks.stoneSlabs = new BlockSlab(TFCBlockID.stoneSlabs).setUnlocalizedName("stoneSlabs").setHardness(10).setResistance(15F);
		TFCBlocks.stoneStalac = new BlockStalactite(TFCBlockID.stoneStalac).setUnlocalizedName("stoneStalac").setHardness(5);

		TFCBlocks.Charcoal = new BlockCharcoal(TFCBlockID.Charcoal).setHardness(3F).setResistance(10F).setUnlocalizedName("Charcoal");

		TFCBlocks.Detailed = new BlockDetailed(TFCBlockID.StoneDetailed).setUnlocalizedName("StoneDetailed").setHardness(10).setResistance(15F);

		TFCBlocks.WoodVert = new BlockLogVert(TFCBlockID.WoodVert).setUnlocalizedName("WoodVert").setHardness(40).setResistance(15F);
		TFCBlocks.WoodHoriz = new BlockLogHoriz(TFCBlockID.WoodHoriz, 0).setUnlocalizedName("WoodHoriz").setHardness(40).setResistance(15F);
		TFCBlocks.WoodHoriz2 = new BlockLogHoriz(TFCBlockID.WoodHoriz2, 8).setUnlocalizedName("WoodHoriz2").setHardness(40).setResistance(15F);

		TFCBlocks.LogNatural2 = new TFC.Blocks.Flora.BlockLogNatural2(TFCBlockID.LogNatural2).setHardness(50.0F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("log2");
		TFCBlocks.WoodVert2 = new BlockLogVert2(TFCBlockID.WoodVert2).setUnlocalizedName("WoodVert2").setHardness(40).setResistance(15F);
		TFCBlocks.WoodHoriz3 = new BlockLogHoriz2(TFCBlockID.WoodHoriz3, 0).setUnlocalizedName("WoodHoriz3").setHardness(40).setResistance(15F);
		TFCBlocks.WoodHoriz4 = new BlockLogHoriz2(TFCBlockID.WoodHoriz4, 8).setUnlocalizedName("WoodHoriz4").setHardness(40).setResistance(15F);

		TFCBlocks.ToolRack = new BlockToolRack(TFCBlockID.ToolRack).setHardness(3F).setUnlocalizedName("Toolrack");
		TFCBlocks.ToolRack2 = new BlockToolRack2(TFCBlockID.ToolRack2).setHardness(3F).setUnlocalizedName("Toolrack");
		TFCBlocks.SpawnMeter = new BlockSpawnMeter(TFCBlockID.SpawnMeter).setHardness(3F).setUnlocalizedName("SpawnMeter");
		TFCBlocks.FoodPrep = new BlockFoodPrep(TFCBlockID.FoodPrep).setHardness(1F).setUnlocalizedName("FoodPrep");
		TFCBlocks.Quern = new BlockQuern(TFCBlockID.Quern).setHardness(3F).setUnlocalizedName("Quern");

		TFCBlocks.WallCobbleIgIn = new BlockCustomWall(TFCBlockID.WallCobbleIgIn, StoneIgInCobble, 3).setUnlocalizedName("WallCobble");
		TFCBlocks.WallCobbleIgEx = new BlockCustomWall(TFCBlockID.WallCobbleIgEx, StoneIgExCobble, 4).setUnlocalizedName("WallCobble");
		TFCBlocks.WallCobbleSed = new BlockCustomWall(TFCBlockID.WallCobbleSed, StoneSedCobble, 8).setUnlocalizedName("WallCobble");
		TFCBlocks.WallCobbleMM = new BlockCustomWall(TFCBlockID.WallCobbleMM, StoneMMCobble, 6).setUnlocalizedName("WallCobble");
		TFCBlocks.WallRawIgIn = new BlockCustomWall(TFCBlockID.WallRawIgIn, StoneIgIn, 3).setUnlocalizedName("WallRaw");
		TFCBlocks.WallRawIgEx = new BlockCustomWall(TFCBlockID.WallRawIgEx, StoneIgEx, 4).setUnlocalizedName("WallRaw");
		TFCBlocks.WallRawSed = new BlockCustomWall(TFCBlockID.WallRawSed, StoneSed, 8).setUnlocalizedName("WallRaw");
		TFCBlocks.WallRawMM = new BlockCustomWall(TFCBlockID.WallRawMM, StoneMM, 6).setUnlocalizedName("WallRaw");
		TFCBlocks.WallBrickIgIn = new BlockCustomWall(TFCBlockID.WallBrickIgIn, StoneIgInBrick, 3).setUnlocalizedName("WallBrick");
		TFCBlocks.WallBrickIgEx = new BlockCustomWall(TFCBlockID.WallBrickIgEx, StoneIgExBrick, 4).setUnlocalizedName("WallBrick");
		TFCBlocks.WallBrickSed = new BlockCustomWall(TFCBlockID.WallBrickSed, StoneSedBrick, 8).setUnlocalizedName("WallBrick");
		TFCBlocks.WallBrickMM = new BlockCustomWall(TFCBlockID.WallBrickMM, StoneMMBrick, 6).setUnlocalizedName("WallBrick");
		TFCBlocks.WallSmoothIgIn = new BlockCustomWall(TFCBlockID.WallSmoothIgIn, StoneIgInSmooth, 3).setUnlocalizedName("WallSmooth");
		TFCBlocks.WallSmoothIgEx = new BlockCustomWall(TFCBlockID.WallSmoothIgEx, StoneIgExSmooth, 4).setUnlocalizedName("WallSmooth");
		TFCBlocks.WallSmoothSed = new BlockCustomWall(TFCBlockID.WallSmoothSed, StoneSedSmooth, 8).setUnlocalizedName("WallSmooth");
		TFCBlocks.WallSmoothMM = new BlockCustomWall(TFCBlockID.WallSmoothMM, StoneMMSmooth, 6).setUnlocalizedName("WallSmooth");

		// Wooden Doors
		for (int i=0; i < Global.WOOD_ALL.length; i++)
			TFCBlocks.Doors[i] = new BlockCustomDoor(TFCBlockID.Doors[i], i*2).setUnlocalizedName("Door "+Global.WOOD_ALL[i]);

		TFCBlocks.IngotPile =  new BlockIngotPile(TFCBlockID.IngotPile).setUnlocalizedName("ingotpile").setHardness(3);


		TFCBlocks.Barrel = new BlockBarrel(TFCBlockID.Barrel).setUnlocalizedName("Barrel").setHardness(2);
		TFCBlocks.Barrel2 = new BlockBarrel2(TFCBlockID.Barrel2).setUnlocalizedName("Barrel").setHardness(2);
		TFCBlocks.Thatch =  new BlockThatch(TFCBlockID.Thatch).setUnlocalizedName("Thatch").setHardness(1).setStepSound(Block.soundGrassFootstep).setCreativeTab(CreativeTabs.tabBlock);
		TFCBlocks.Moss =  new BlockMoss(TFCBlockID.Moss).setUnlocalizedName("Moss").setHardness(1).setStepSound(Block.soundGrassFootstep);


		TFCBlocks.Flora = new BlockFlora(TFCBlockID.Flora).setUnlocalizedName("Flora").setHardness(0.1f).setStepSound(Block.soundGrassFootstep);
		TFCBlocks.Pottery = new BlockPottery(TFCBlockID.Pottery).setUnlocalizedName("Pottery").setHardness(1.0f);

		TFCBlocks.Tuyere = new BlockTuyere(TFCBlockID.Tuyere).setUnlocalizedName("Tuyere");
		TFCBlocks.Crucible = new BlockCrucible(TFCBlockID.Crucible).setUnlocalizedName("Crucible").setHardness(4.0f);

		TFCBlocks.NestBox = new BlockNestBox(TFCBlockID.NestBox).setUnlocalizedName("NestBox").setHardness(1);

		TFCBlocks.Fence = new BlockCustomFence(TFCBlockID.Fence,"Fence",Material.wood).setUnlocalizedName("FenceTFC").setHardness(2);
		TFCBlocks.FenceGate = Block.blocksList[107];//new BlockCustomFenceGate(TFCBlockID.FenceGate).setUnlocalizedName("FenceGateTFC").setHardness(2);
		TFCBlocks.Fence2 = new BlockCustomFence2(TFCBlockID.Fence2,"Fence2",Material.wood).setUnlocalizedName("FenceTFC").setHardness(2);
		TFCBlocks.FenceGate2 = new BlockCustomFenceGate2(TFCBlockID.FenceGate2).setUnlocalizedName("FenceGateTFC").setHardness(2);
		TFCBlocks.StrawHideBed = new BlockCustomBed(TFCBlockID.StrawHideBed).setUnlocalizedName("StrawHideBed").setHardness(1);
		TFCBlocks.ArmourStand = new BlockStand(TFCBlockID.ArmourStand).setUnlocalizedName("ArmourStand").setHardness(2);
		TFCBlocks.ArmourStand2 = new BlockStand2(TFCBlockID.ArmourStand2).setUnlocalizedName("ArmourStand").setHardness(2);

		TFCBlocks.SteamPipe = new BlockPipeBasic(TFCBlockID.BasicPipe,Material.iron).setUnlocalizedName("BasicPipe").setHardness(2);
		TFCBlocks.SteamPipeValve = new BlockPipeValve(TFCBlockID.ValvePipe,Material.iron).setUnlocalizedName("ValvePipe").setHardness(2);

		TFCBlocks.BerryBush = new BlockBerryBush(TFCBlockID.BerryBush).setUnlocalizedName("BerryBush").setHardness(0.3f).setStepSound(Block.soundGrassFootstep);

		TFCBlocks.FreshWaterFlowing = (new BlockFreshWaterFlowing(TFCBlockID.FreshWaterFlowing)).setHardness(100.0F).setLightOpacity(3).setUnlocalizedName("water").setCreativeTab(CreativeTabs.tabDecorations);;
		TFCBlocks.FreshWaterStill  = (new BlockFreshWaterStill(TFCBlockID.FreshWaterStill)).setHardness(100.0F).setLightOpacity(3).setUnlocalizedName("water").setCreativeTab(CreativeTabs.tabDecorations);;
		TFCBlocks.HotWaterFlowing = (new BlockHotWaterFlowing(TFCBlockID.HotWaterFlowing)).setHardness(100.0F).setLightOpacity(3).setUnlocalizedName("water");
		TFCBlocks.HotWaterStill  = (new BlockHotWaterStill(TFCBlockID.HotWaterStill)).setHardness(100.0F).setLightOpacity(3).setUnlocalizedName("water");

		TFCBlocks.SeaGrassStill = new BlockTallSeaGrassStill(TFCBlockID.SeaGrassStill).setUnlocalizedName("SeaGrassStill").setHardness(0.3f).setCreativeTab(CreativeTabs.tabDecorations);
		TFCBlocks.SeaGrassFrozen = (new BlockFrozenSeaGrass(TFCBlockID.SeaGrassFrozen)).setHardness(0.5F).setLightOpacity(3).setStepSound(Block.soundGlassFootstep).setUnlocalizedName("seagrassice");
		TFCBlocks.SeaGrassFlowing = new BlockTallSeaGrassFlowing(TFCBlockID.SeaGrassFlowing).setUnlocalizedName("SeaGrassFlowing").setHardness(0.3f).setCreativeTab(CreativeTabs.tabDecorations);

		TFCBlocks.FireBrick = new BlockFireBrick(TFCBlockID.FireBrick).setUnlocalizedName("FireBrick").setHardness(8);
		TFCBlocks.MetalSheet = new BlockMetalSheet(TFCBlockID.MetalSheet).setUnlocalizedName("MetalSheet").setHardness(8).setResistance(20f);

		MinecraftForge.setBlockHarvestLevel(TFCBlocks.StoneIgIn, "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(TFCBlocks.StoneIgEx, "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(TFCBlocks.StoneSed, "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(TFCBlocks.StoneMM, "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(TFCBlocks.stoneStalac, "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(TFCBlocks.Ore, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(TFCBlocks.Ore2, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(TFCBlocks.Ore3, "pickaxe", 1);
		MinecraftForge.setBlockHarvestLevel(TFCBlocks.Dirt, "shovel", 0);
		MinecraftForge.setBlockHarvestLevel(TFCBlocks.Dirt2, "shovel", 0);
		MinecraftForge.setBlockHarvestLevel(TFCBlocks.Grass, "shovel", 0);
		MinecraftForge.setBlockHarvestLevel(TFCBlocks.Grass2, "shovel", 0);
		MinecraftForge.setBlockHarvestLevel(TFCBlocks.DryGrass, "shovel", 0);
		MinecraftForge.setBlockHarvestLevel(TFCBlocks.DryGrass2, "shovel", 0);
		MinecraftForge.setBlockHarvestLevel(TFCBlocks.Clay, "shovel", 0);
		MinecraftForge.setBlockHarvestLevel(TFCBlocks.Clay2, "shovel", 0);
		MinecraftForge.setBlockHarvestLevel(TFCBlocks.ClayGrass, "shovel", 0);
		MinecraftForge.setBlockHarvestLevel(TFCBlocks.ClayGrass2, "shovel", 0);
		MinecraftForge.setBlockHarvestLevel(TFCBlocks.Wood, "axe", 1);
		MinecraftForge.setBlockHarvestLevel(TFCBlocks.WoodHoriz, "axe", 1);
		MinecraftForge.setBlockHarvestLevel(TFCBlocks.WoodVert, "axe", 1);
		MinecraftForge.setBlockHarvestLevel(TFCBlocks.Wood, "hammer", 1);
		MinecraftForge.setBlockHarvestLevel(TFCBlocks.WoodHoriz, "hammer", 1);
		MinecraftForge.setBlockHarvestLevel(TFCBlocks.WoodVert, "hammer", 1);
		MinecraftForge.setBlockHarvestLevel(TFCBlocks.Peat, "shovel", 0);
		MinecraftForge.setBlockHarvestLevel(TFCBlocks.PeatGrass, "shovel", 0);
		MinecraftForge.setBlockHarvestLevel(TFCBlocks.Sand, "shovel", 0);
		MinecraftForge.setBlockHarvestLevel(TFCBlocks.Sand2, "shovel", 0);
		MinecraftForge.setBlockHarvestLevel(TFCBlocks.Charcoal, "shovel", 0);
		MinecraftForge.setBlockHarvestLevel(TFCBlocks.WoodConstruct, "axe", 0);
		MinecraftForge.setBlockHarvestLevel(TFCBlocks.Detailed, "pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(TFCBlocks.Detailed, "axe", 0);
		MinecraftForge.setBlockHarvestLevel(Block.blocksList[53], "axe", 0);

	}

	public static boolean isIdVSupport(int id){	
		return id == WoodSupportV.blockID || id == WoodSupportV2.blockID;
	}

	public static boolean isIdHSupport(int id){	
		return id == WoodSupportH.blockID || id == WoodSupportH2.blockID;
	}

	public static boolean isIdAFence(int par0)
	{
		return par0 == TFCBlocks.Fence.blockID||par0 == TFCBlocks.Fence2.blockID || BlockFence.isIdAFence(par0);
	}

	public static boolean canFenceConnectTo(int l){
		return isIdAFence(l) || l == TFCBlocks.FenceGate.blockID || l == TFCBlocks.FenceGate2.blockID;
	}

	public static boolean isArmourStand(int l){
		return l == TFCBlocks.ArmourStand.blockID || l == TFCBlocks.ArmourStand2.blockID;
	}
}