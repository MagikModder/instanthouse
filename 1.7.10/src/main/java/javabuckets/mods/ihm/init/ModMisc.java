package javabuckets.mods.ihm.init;

import cpw.mods.fml.common.registry.GameRegistry;
import javabuckets.mods.ihm.blocks.BlockPortableInstant;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModMisc
{	
	/**
	 * Creative Tab
	 */
	
	public static CreativeTabs ihmTab = new CreativeTabs("tabInstant")
	{
		@Override
		public Item getTabIconItem() 
		{
			return ModItems.defaultHouse;
		}
		
		
	};
	
	/**
	 * Blockz
	 */
	
	public static Block portableInstantTent;
	
	
	
	public static void init() 
	{
		portableInstantTent = new BlockPortableInstant("").setBlockName("Ptent").setBlockTextureName("tent");
		GameRegistry.registerBlock(portableInstantTent, "Ptent");
	}
}