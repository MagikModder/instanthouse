package javabuckets.mods.ihm.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModRecipes 
{
	public static void init()
	{
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.instantCoreTier1), new Object[] 	{ "CIC", "IBI", "CIC", 'C', Items.coal, 'I', Items.iron_ingot, 'B', Blocks.iron_block }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.instantCoreTier2), new Object[] 	{ "CIC", "IBI", "CIC", 'C', Blocks.iron_block, 'I', Items.gold_ingot, 'B', Items.emerald }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.instantCoreTier3), new Object[] 	{ "CIC", "IBI", "CIC", 'C', Items.emerald, 'I', Items.diamond, 'B', Blocks.obsidian }));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.defaultHouse), new Object[] 		{ "SSS", "WCW", "PPP", 'S', Blocks.stonebrick, 'W', "logWood", 'P', "plankWood", 'C', ModItems.instantCoreTier1 }));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.jediTemple), new Object[]         { "QGQ", "QTQ", "SDS", 'Q', Blocks.quartz_block, 'G', Blocks.glowstone, 'T', ModItems.instantCoreTier3, 'S', Blocks.quartz_stairs, 'D', Items.diamond_sword }));
	}
}