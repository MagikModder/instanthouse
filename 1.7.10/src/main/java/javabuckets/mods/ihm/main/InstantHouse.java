package javabuckets.mods.ihm.main;

import javabuckets.mods.ihm.init.ModMisc;
import javabuckets.mods.ihm.init.ModItems;
import javabuckets.mods.ihm.init.ModRecipes;
import javabuckets.mods.ihm.proxies.ServerProxy;
import javabuckets.mods.ihm.utility.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)

public class InstantHouse 
{
	@SidedProxy(clientSide = "javabuckets.mods.ihm.proxies.ClientProxy", serverSide = "javabuckets.mods.ihm.proxies.ServerProxy")
	public static ServerProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ModMisc.init();
		ModItems.init();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		ModRecipes.init();
		proxy.registerProxyInformation();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}