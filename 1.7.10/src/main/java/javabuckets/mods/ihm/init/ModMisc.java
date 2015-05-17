package javabuckets.mods.ihm.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModMisc
{	
	public static CreativeTabs ihmTab = new CreativeTabs("tabInstant")
	{
		@Override
		public Item getTabIconItem() 
		{
			return ModItems.defaultHouse;
		}
		
		
	};
	
	public static void init() 
	{
		
	}
}