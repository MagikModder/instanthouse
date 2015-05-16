package javabuckets.mods.ihm.instants;

import java.util.List;

import javabuckets.mods.ihm.utility.Reference;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class InstantCoreBase extends Item
{
	private int tier;
	
	public InstantCoreBase()
	{
		super();
		this.setMaxStackSize(16);
	}
	
	public Item setTier(int tier)
	{
		this.tier = tier;
		return this;
	}
	
	public int getTier() 
	{
		return this.tier;
	}
	
	@Override
	public void registerIcons(IIconRegister iconRegistry) 
	{
		itemIcon = iconRegistry.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(5));
	}
	
	@Override
	public void addInformation(ItemStack itemstack, EntityPlayer player, List list, boolean par4) 
	{
		list.add("This core is of tier " + this.tier);
	}
}
