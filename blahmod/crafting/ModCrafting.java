package blahmod.crafting;

import blahmod.blocks.ModBlocks;
import blahmod.items.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModCrafting
{
	public static void initCrafting()
	{
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.acidBucket), new ItemStack(Items.redstone), new ItemStack(Items.slime_ball), new ItemStack(Items.water_bucket));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.leatherBlock), "###","###", "###", '#', Items.leather);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.limestoneBlock), "###","###", "###", '#', ModItems.limestone);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.sulphurBlock), "###","###", "###", '#', ModItems.sulphur2);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.uraniumBlock), "###","###", "###", '#', ModItems.uraniumIngot);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.gemBlocks[0]), "###","###", "###", '#', ModItems.gems[0]);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.gemBlocks[1]), "###","###", "###", '#', ModItems.gems[1]);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.gemBlocks[2]), "###","###", "###", '#', ModItems.gems[2]);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.gemBlocks[3]), "###","###", "###", '#', ModItems.gems[3]);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.gemBlocks[4]), "###","###", "###", '#', ModItems.gems[4]);
		GameRegistry.addRecipe(new ItemStack(Blocks.obsidian), "##","##", '#', ModItems.obsidianIngot);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.endStoneBricks), "##","##", '#', Blocks.end_stone);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cement, 8), "#x#","xxx", "yzy", '#', Blocks.clay, 'x', ModItems.limestone, 'y', Blocks.gravel, 'z', Items.water_bucket);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.tadanite), "xxx", "x x", "xxx", 'x', new ItemStack(ModItems.tadaniteShard));
		// new vanilla item recipes
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.ice, 4), new ItemStack(Blocks.packed_ice));
		GameRegistry.addRecipe(new ItemStack(Blocks.mossy_cobblestone, 8), "xyx", "yxy", "xyx", 'x', new ItemStack(Blocks.cobblestone), 'y', new ItemStack(Items.wheat_seeds));
		GameRegistry.addRecipe(new ItemStack(Blocks.packed_ice), "##","##", '#', Blocks.ice);
		GameRegistry.addRecipe(new ItemStack(Items.saddle), "xxx", "xyx", "z z", 'x', new ItemStack(Items.leather), 'y', new ItemStack(Items.string), 'z', new ItemStack(Items.stick));
		// vanilla reverse crafting start
		// random stuff
		GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot, 3), new ItemStack(Items.bucket));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot, 2), new ItemStack(Items.iron_door));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot, 5), new ItemStack(Items.minecart));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot, 7), new ItemStack(Items.cauldron));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.brick, 3), new ItemStack(Items.flower_pot));
		GameRegistry.addRecipe(new ItemStack(Blocks.planks, 2), "##","##", '#', Items.stick);
		GameRegistry.addRecipe(new ItemStack(Items.quartz, 4), "##","##", '#', Blocks.quartz_block);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.string, 4), new ItemStack(Blocks.wool));
		GameRegistry.addRecipe(new ItemStack(Blocks.log), "# #", "   ", "# #", '#', new ItemStack(Blocks.planks));
		GameRegistry.addRecipe(new ItemStack(Blocks.log, 1, 1), "# #", "   ", "# #", '#', new ItemStack(Blocks.planks, 1, 1));
		GameRegistry.addRecipe(new ItemStack(Blocks.log, 1, 2), "# #", "   ", "# #", '#', new ItemStack(Blocks.planks, 1, 2));
		GameRegistry.addRecipe(new ItemStack(Blocks.log, 1, 3), "# #", "   ", "# #", '#', new ItemStack(Blocks.planks, 1, 3));
		GameRegistry.addRecipe(new ItemStack(Blocks.log2, 1), "# #", "   ", "# #", '#', new ItemStack(Blocks.planks, 1, 4));
		GameRegistry.addRecipe(new ItemStack(Blocks.log2, 1, 1), "# #", "   ", "# #", '#', new ItemStack(Blocks.planks, 1, 5));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 2, 0), new ItemStack(Items.oak_door));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 2, 1), new ItemStack(Items.spruce_door));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 2, 2), new ItemStack(Items.birch_door));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 2, 3), new ItemStack(Items.jungle_door));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 2, 4), new ItemStack(Items.acacia_door));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 2, 5), new ItemStack(Items.dark_oak_door));
		// end random stuff
		// slabs start
		GameRegistry.addRecipe(new ItemStack(Blocks.red_sandstone, 3, 0), "xxx", "xxx", 'x', new ItemStack(Blocks.stone_slab2));
		GameRegistry.addRecipe(new ItemStack(Blocks.planks, 3, 0), "xxx", "xxx", 'x', new ItemStack(Blocks.wooden_slab));
		GameRegistry.addRecipe(new ItemStack(Blocks.planks, 3, 1), "xxx", "xxx", 'x', new ItemStack(Blocks.wooden_slab, 1, 1));
		GameRegistry.addRecipe(new ItemStack(Blocks.planks, 3, 2), "xxx", "xxx", 'x', new ItemStack(Blocks.wooden_slab, 1, 2));
		GameRegistry.addRecipe(new ItemStack(Blocks.planks, 3, 3), "xxx", "xxx", 'x', new ItemStack(Blocks.wooden_slab, 1, 3));
		GameRegistry.addRecipe(new ItemStack(Blocks.planks, 3, 4), "xxx", "xxx", 'x', new ItemStack(Blocks.wooden_slab, 1, 4));
		GameRegistry.addRecipe(new ItemStack(Blocks.planks, 3, 5), "xxx", "xxx", 'x', new ItemStack(Blocks.wooden_slab, 1, 5));
		GameRegistry.addRecipe(new ItemStack(Blocks.stone, 3, 0), "xxx", "xxx", 'x', new ItemStack(Blocks.stone_slab));
		GameRegistry.addRecipe(new ItemStack(Blocks.sandstone, 3, 0), "xxx", "xxx", 'x', new ItemStack(Blocks.stone_slab, 1, 1));
		GameRegistry.addRecipe(new ItemStack(Blocks.cobblestone, 3, 0), "xxx", "xxx", 'x', new ItemStack(Blocks.stone_slab, 1, 3));
		GameRegistry.addRecipe(new ItemStack(Blocks.brick_block, 3, 0), "xxx", "xxx", 'x', new ItemStack(Blocks.stone_slab, 1, 4));
		GameRegistry.addRecipe(new ItemStack(Blocks.stonebrick, 3, 0), "xxx", "xxx", 'x', new ItemStack(Blocks.stone_slab, 1, 5));
		GameRegistry.addRecipe(new ItemStack(Blocks.nether_brick, 3, 0), "xxx", "xxx", 'x', new ItemStack(Blocks.stone_slab, 1, 6));
		GameRegistry.addRecipe(new ItemStack(Blocks.quartz_block, 3, 0), "xxx", "xxx", 'x', new ItemStack(Blocks.stone_slab, 1, 7));		
		// slabs end
		// stairs start
		GameRegistry.addRecipe(new ItemStack(Blocks.stonebrick, 6), "##","##", '#', Blocks.stone_brick_stairs);
		GameRegistry.addRecipe(new ItemStack(Blocks.nether_brick, 6), "##","##", '#', Blocks.nether_brick_stairs);
		GameRegistry.addRecipe(new ItemStack(Blocks.brick_block, 6), "##","##", '#', Blocks.brick_stairs);
		GameRegistry.addRecipe(new ItemStack(Blocks.red_sandstone, 6), "##","##", '#', Blocks.red_sandstone_stairs);
		GameRegistry.addRecipe(new ItemStack(Blocks.sandstone, 6), "##","##", '#', Blocks.sandstone_stairs);
		GameRegistry.addRecipe(new ItemStack(Blocks.cobblestone, 6), "##","##", '#', Blocks.stone_stairs);
		GameRegistry.addRecipe(new ItemStack(Blocks.stonebrick, 6), "##","##", '#', Blocks.stone_brick_stairs);
		GameRegistry.addRecipe(new ItemStack(Blocks.planks, 6, 0), "xx", "xx", 'x', new ItemStack(Blocks.oak_stairs));
		GameRegistry.addRecipe(new ItemStack(Blocks.planks, 6, 1), "xx", "xx", 'x', new ItemStack(Blocks.spruce_stairs));
		GameRegistry.addRecipe(new ItemStack(Blocks.planks, 6, 2), "xx", "xx", 'x', new ItemStack(Blocks.birch_stairs));
		GameRegistry.addRecipe(new ItemStack(Blocks.planks, 6, 3), "xx", "xx", 'x', new ItemStack(Blocks.jungle_stairs));
		GameRegistry.addRecipe(new ItemStack(Blocks.planks, 6, 4), "xx", "xx", 'x', new ItemStack(Blocks.acacia_stairs));
		GameRegistry.addRecipe(new ItemStack(Blocks.planks, 6, 5), "xx", "xx", 'x', new ItemStack(Blocks.dark_oak_stairs));
		GameRegistry.addRecipe(new ItemStack(Blocks.quartz_block, 6), "##","##", '#', Blocks.quartz_stairs);
		// stairs end
		// reverse crafting end
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.obsidianIngot, 4), new ItemStack(Blocks.obsidian));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.leather, 9), new ItemStack(ModBlocks.leatherBlock));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.gems[0], 9), new ItemStack(ModBlocks.gemBlocks[0]));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.gems[1], 9), new ItemStack(ModBlocks.gemBlocks[1]));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.gems[2], 9), new ItemStack(ModBlocks.gemBlocks[2]));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.gems[3], 9), new ItemStack(ModBlocks.gemBlocks[3]));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.gems[4], 9), new ItemStack(ModBlocks.gemBlocks[4]));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.tadaniteShard, 8), new ItemStack(ModBlocks.tadanite));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.limestone, 9), new ItemStack(ModBlocks.limestoneBlock));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.sulphur2, 9), new ItemStack(ModBlocks.sulphurBlock));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.uraniumIngot, 9), new ItemStack(ModBlocks.uraniumBlock));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.blaze_rod, 5), new ItemStack(ModBlocks.blazeBrick));
		GameRegistry.addRecipe(new ItemStack(ModItems.tadaniteDiamond), " x ", "xyx", " x ", 'x', new ItemStack(ModItems.tadaniteShard), 'y', new ItemStack(Items.diamond));
		GameRegistry.addRecipe(new ItemStack(ModItems.obsidianPickaxe), "xxx", " y ", " y ", 'x', new ItemStack(ModItems.obsidianIngot), 'y', new ItemStack(Items.stick));
		GameRegistry.addRecipe(new ItemStack(ModItems.obsidianSword), " x ", " x ", " y ", 'x', new ItemStack(ModItems.obsidianIngot), 'y', new ItemStack(Items.stick));
		GameRegistry.addRecipe(new ItemStack(ModItems.obsidianAxe), "xx ", "xy ", " y ", 'x', new ItemStack(ModItems.obsidianIngot), 'y', new ItemStack(Items.stick));
		GameRegistry.addRecipe(new ItemStack(ModItems.obsidianAxe), " xx", " yx", " y ", 'x', new ItemStack(ModItems.obsidianIngot), 'y', new ItemStack(Items.stick));
		GameRegistry.addRecipe(new ItemStack(ModItems.obsidianShovel), " x ", " y ", " y ", 'x', new ItemStack(ModItems.obsidianIngot), 'y', new ItemStack(Items.stick));
		GameRegistry.addRecipe(new ItemStack(ModItems.obsidianHoe), "xx ", " y ", " y ", 'x', new ItemStack(ModItems.obsidianIngot), 'y', new ItemStack(Items.stick));
		GameRegistry.addRecipe(new ItemStack(ModItems.obsidianHoe), " xx", " y ", " y ", 'x', new ItemStack(ModItems.obsidianIngot), 'y', new ItemStack(Items.stick));
		GameRegistry.addRecipe(new ItemStack(ModItems.tadanitePickaxe), "xxx", " y ", " y ", 'x', new ItemStack(ModItems.tadaniteDiamond), 'y', new ItemStack(Items.blaze_rod));
		GameRegistry.addRecipe(new ItemStack(ModItems.tadaniteSword), " x ", " x ", " y ", 'x', new ItemStack(ModItems.tadaniteDiamond), 'y', new ItemStack(Items.blaze_rod));
		GameRegistry.addRecipe(new ItemStack(ModItems.tadaniteAxe), "xx ", "xy ", " y ", 'x', new ItemStack(ModItems.tadaniteDiamond), 'y', new ItemStack(Items.blaze_rod));
		GameRegistry.addRecipe(new ItemStack(ModItems.tadaniteAxe), " xx", " yx", " y ", 'x', new ItemStack(ModItems.tadaniteDiamond), 'y', new ItemStack(Items.blaze_rod));
		GameRegistry.addRecipe(new ItemStack(ModItems.tadaniteShovel), " x ", " y ", " y ", 'x', new ItemStack(ModItems.tadaniteDiamond), 'y', new ItemStack(Items.blaze_rod));
		GameRegistry.addRecipe(new ItemStack(ModItems.tadaniteHoe), "xx ", " y ", " y ", 'x', new ItemStack(ModItems.tadaniteDiamond), 'y', new ItemStack(Items.blaze_rod));
		GameRegistry.addRecipe(new ItemStack(ModItems.tadaniteHoe), " xx", " y ", " y ", 'x', new ItemStack(ModItems.tadaniteDiamond), 'y', new ItemStack(Items.blaze_rod));
		GameRegistry.addRecipe(new ItemStack(ModItems.tadaniteHelmet), "xxx", "x x", 'x', new ItemStack(ModItems.tadaniteDiamond));
		GameRegistry.addRecipe(new ItemStack(ModItems.tadaniteBoots), "x x", "x x", 'x', new ItemStack(ModItems.tadaniteDiamond));
		GameRegistry.addRecipe(new ItemStack(ModItems.tadaniteChestplate), "x x", "xxx", "xxx", 'x', new ItemStack(ModItems.tadaniteDiamond));
		GameRegistry.addRecipe(new ItemStack(ModItems.tadaniteLeggings), "xxx", "x x", "x x", 'x', new ItemStack(ModItems.tadaniteDiamond));
		//GameRegistry.addRecipe(new ItemStack(ModBlocks.uraniumTorch, 4), "x", "y", 'x', new ItemStack(ModItems.uraniumRod), 'y', new ItemStack(Items.stick));
		GameRegistry.addRecipe(new ItemStack(ModItems.bedrockPickaxe), "xxx", " y ", " y ", 'x', new ItemStack(Blocks.bedrock), 'y', new ItemStack(Items.blaze_rod));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.blazeBrick), "xxx", "xyx", "xxx", 'x', new ItemStack(Items.blaze_powder), 'y', new ItemStack(Items.blaze_rod));
		GameRegistry.addRecipe(new ItemStack(ModItems.obsidianHelmet), "xxx", "x x", 'x', new ItemStack(ModItems.obsidianIngot));
		GameRegistry.addRecipe(new ItemStack(ModItems.obsidianBoots), "x x", "x x", 'x', new ItemStack(ModItems.obsidianIngot));
		GameRegistry.addRecipe(new ItemStack(ModItems.obsidianChestplate), "x x", "xxx", "xxx", 'x', new ItemStack(ModItems.obsidianIngot));
		GameRegistry.addRecipe(new ItemStack(ModItems.obsidianLeggings), "xxx", "x x", "x x", 'x', new ItemStack(ModItems.obsidianIngot));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.catalyzer), "xxx", "uuu", "yzy", 'x', new ItemStack(Blocks.planks), 'y', new ItemStack(ModBlocks.sulphurBlock), 'z', new ItemStack(Blocks.crafting_table), 'u', new ItemStack(Items.iron_ingot));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.catalyzer), "xxx", "uuu", "yzy", 'x', new ItemStack(Blocks.planks, 1, 1), 'y', new ItemStack(ModBlocks.sulphurBlock), 'z', new ItemStack(Blocks.crafting_table), 'u', new ItemStack(Items.iron_ingot));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.catalyzer), "xxx", "uuu", "yzy", 'x', new ItemStack(Blocks.planks, 1, 2), 'y', new ItemStack(ModBlocks.sulphurBlock), 'z', new ItemStack(Blocks.crafting_table), 'u', new ItemStack(Items.iron_ingot));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.catalyzer), "xxx", "uuu", "yzy", 'x', new ItemStack(Blocks.planks, 1, 3), 'y', new ItemStack(ModBlocks.sulphurBlock), 'z', new ItemStack(Blocks.crafting_table), 'u', new ItemStack(Items.iron_ingot));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.catalyzer), "xxx", "uuu", "yzy", 'x', new ItemStack(Blocks.planks, 1, 4), 'y', new ItemStack(ModBlocks.sulphurBlock), 'z', new ItemStack(Blocks.crafting_table), 'u', new ItemStack(Items.iron_ingot));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.catalyzer), "xxx", "uuu", "yzy", 'x', new ItemStack(Blocks.planks, 1, 5), 'y', new ItemStack(ModBlocks.sulphurBlock), 'z', new ItemStack(Blocks.crafting_table), 'u', new ItemStack(Items.iron_ingot));
		// custom slab crafting
		GameRegistry.addRecipe(new ItemStack(ModBlocks.slabs[0], 6), "xxx", 'x', new ItemStack(Blocks.wool, 1, 0));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.slabs[1], 6), "xxx", 'x', new ItemStack(Blocks.iron_block));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.slabs[2], 6), "xxx", 'x', new ItemStack(Blocks.gold_block));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.slabs[3], 6), "xxx", 'x', new ItemStack(Blocks.diamond_block));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.slabs[4], 6), "xxx", 'x', new ItemStack(Blocks.emerald_block));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.slabs[5], 6), "xxx", 'x', new ItemStack(ModBlocks.sulphurBlock));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.slabs[6], 6), "xxx", 'x', new ItemStack(ModBlocks.limestoneBlock));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.slabs[7], 6), "xxx", 'x', new ItemStack(ModBlocks.uraniumBlock));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.slabs2[0], 6), "xxx", 'x', new ItemStack(Blocks.dirt, 1, 0));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.slabs2[1], 6), "xxx", 'x', new ItemStack(Blocks.grass));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.slabs2[2], 6), "xxx", 'x', new ItemStack(ModBlocks.leatherBlock));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.slabs2[3], 6), "xxx", 'x', new ItemStack(Blocks.lapis_block));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.slabs2[4], 6), "xxx", 'x', new ItemStack(Blocks.obsidian));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.slabs2[5], 6), "xxx", 'x', new ItemStack(Blocks.mossy_cobblestone));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.slabs2[6], 6), "xxx", 'x', new ItemStack(ModBlocks.endStoneBricks));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.slabs2[7], 6), "xxx", 'x', new ItemStack(ModBlocks.tadanite));
		// custom slab decrafting
		GameRegistry.addRecipe(new ItemStack(Blocks.dirt, 3, 0), "xxx", "xxx", 'x', new ItemStack(ModBlocks.slabs2[0]));
		GameRegistry.addRecipe(new ItemStack(Blocks.grass, 3, 0), "xxx", "xxx", 'x', new ItemStack(ModBlocks.slabs2[1]));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.leatherBlock, 3, 0), "xxx", "xxx", 'x', new ItemStack(ModBlocks.slabs2[2]));
		GameRegistry.addRecipe(new ItemStack(Blocks.lapis_block, 3, 0), "xxx", "xxx", 'x', new ItemStack(ModBlocks.slabs2[3]));
		GameRegistry.addRecipe(new ItemStack(Blocks.obsidian, 3, 0), "xxx", "xxx", 'x', new ItemStack(ModBlocks.slabs2[4]));
		GameRegistry.addRecipe(new ItemStack(Blocks.mossy_cobblestone, 3, 0), "xxx", "xxx", 'x', new ItemStack(ModBlocks.slabs2[5]));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.endStoneBricks, 3, 0), "xxx", "xxx", 'x', new ItemStack(ModBlocks.slabs2[6]));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.tadanite, 3, 0), "xxx", "xxx", 'x', new ItemStack(ModBlocks.slabs2[7]));
		GameRegistry.addRecipe(new ItemStack(Blocks.wool, 3, 0), "xxx", "xxx", 'x', new ItemStack(ModBlocks.slabs[0]));
		GameRegistry.addRecipe(new ItemStack(Blocks.iron_block, 3, 0), "xxx", "xxx", 'x', new ItemStack(ModBlocks.slabs[1]));
		GameRegistry.addRecipe(new ItemStack(Blocks.gold_block, 3, 0), "xxx", "xxx", 'x', new ItemStack(ModBlocks.slabs[2]));
		GameRegistry.addRecipe(new ItemStack(Blocks.diamond_block, 3, 0), "xxx", "xxx", 'x', new ItemStack(ModBlocks.slabs[3]));
		GameRegistry.addRecipe(new ItemStack(Blocks.emerald_block, 3, 0), "xxx", "xxx", 'x', new ItemStack(ModBlocks.slabs[4]));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.sulphurBlock, 3, 0), "xxx", "xxx", 'x', new ItemStack(ModBlocks.slabs[5]));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.limestoneBlock, 3, 0), "xxx", "xxx", 'x', new ItemStack(ModBlocks.slabs[6]));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.uraniumBlock, 3, 0), "xxx", "xxx", 'x', new ItemStack(ModBlocks.slabs[7]));
		// end custom slab crafting/decrafting		
		// gem staves
		GameRegistry.addRecipe(new ItemStack(ModItems.gemStaves[0]), "y", "y", "z", 'y', new ItemStack(ModBlocks.gemBlocks[0]), 'z', new ItemStack(ModBlocks.petrifiedWood));
		GameRegistry.addRecipe(new ItemStack(ModItems.gemStaves[1]), "y", "y", "z", 'y', new ItemStack(ModBlocks.gemBlocks[1]), 'z', new ItemStack(ModBlocks.petrifiedWood));
		GameRegistry.addRecipe(new ItemStack(ModItems.gemStaves[2]), "y", "y", "z", 'y', new ItemStack(ModBlocks.gemBlocks[2]), 'z', new ItemStack(ModBlocks.petrifiedWood));
		GameRegistry.addRecipe(new ItemStack(ModItems.gemStaves[3]), "y", "y", "z", 'y', new ItemStack(Blocks.emerald_block), 'z', new ItemStack(ModBlocks.petrifiedWood));
		GameRegistry.addRecipe(new ItemStack(ModItems.gemStaves[4]), "y", "y", "z", 'y', new ItemStack(ModBlocks.gemBlocks[3]), 'z', new ItemStack(ModBlocks.petrifiedWood));
		GameRegistry.addRecipe(new ItemStack(ModItems.gemStaves[5]), "y", "y", "z", 'y', new ItemStack(ModBlocks.gemBlocks[4]), 'z', new ItemStack(ModBlocks.petrifiedWood));
		GameRegistry.addRecipe(new ItemStack(ModItems.gemStaves[6]), "y", "y", "z", 'y', new ItemStack(Blocks.diamond_block), 'z', new ItemStack(ModBlocks.petrifiedWood));
		// end gem staves
		// smelting recipes
		GameRegistry.addSmelting(ModBlocks.uraniumOre, new ItemStack(ModItems.uraniumIngot), 5F);
		GameRegistry.addSmelting(ModBlocks.limestoneOre, new ItemStack(ModItems.limestone), 4F);
		GameRegistry.addSmelting(ModBlocks.sulphurOre, new ItemStack(ModItems.sulphur2), 2F);
		GameRegistry.addSmelting(ModBlocks.tadaniteOre, new ItemStack(ModItems.tadaniteShard), 6F);
		GameRegistry.addSmelting(ModBlocks.clayOre, new ItemStack(Items.clay_ball, 2), .5F);
	}
}