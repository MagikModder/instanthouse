package javabuckets.mods.ihm.init;

import javabuckets.mods.ihm.instants.InstantCoreBase;
import javabuckets.mods.ihm.instants.InstantDefaultHouse;
import javabuckets.mods.ihm.instants.InstantHouseBase;
import javabuckets.mods.ihm.instants.InstantJediTemple;
import javabuckets.mods.ihm.utility.ItemRegistry;
import net.minecraft.item.Item;

public class ModItems 
{
	public static Item instantCoreTier1;
	public static Item instantCoreTier2;
	public static Item instantCoreTier3;
	
	public static Item defaultHouse;
	public static Item jediTemple;
	
	public static void init()
	{
		instantCoreTier1 = new InstantCoreBase().setTier(1);
		ItemRegistry.registerItem(instantCoreTier1, "Instant Core Tier 1");
		
		instantCoreTier2 = new InstantCoreBase().setTier(2);
		ItemRegistry.registerItem(instantCoreTier2, "Instant Core Tier 2");
		
		instantCoreTier3 = new InstantCoreBase().setTier(3);
		ItemRegistry.registerItem(instantCoreTier3, "Instant Core Tier 3");
		
		defaultHouse = new InstantDefaultHouse();
		ItemRegistry.registerItem(defaultHouse, "Default House");
		
		jediTemple = new InstantJediTemple();
		ItemRegistry.registerItem(jediTemple, "Jedi Temple");
	}
}