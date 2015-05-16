package javabuckets.mods.ihm.utility;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;

public class ItemRegistry 
{
	public static void registerItem(Item item, String name)
	{
		String mod_name = name.toLowerCase().replace(' ', '_');
		GameRegistry.registerItem(item, mod_name, Reference.MOD_ID);
		LanguageRegistry.addName(item, name);
		item.setUnlocalizedName(mod_name);
	}
}