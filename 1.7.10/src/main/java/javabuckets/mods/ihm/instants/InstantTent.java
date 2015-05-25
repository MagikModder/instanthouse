package javabuckets.mods.ihm.instants;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class InstantTent extends InstantHouseBase
{
	private int colorCode;
	
	public InstantTent(int colorCode) 
	{
		super();
		this.colorCode = colorCode;
	}
	
	public boolean onItemUse(ItemStack itemstack, EntityPlayer player, World world, int x, int y, int z, int j, float f1, float f2, float f3) 
	{
		if (j == 0)
		{
			--y;
		}
		
		if (j == 1)
		{
			++y;
		}
		
		if (j == 2)
		{
			--z;
		}
		
		if (j == 3)
		{
			++z;
		}
		
		if (j == 4)
		{
			--x;
		}
		
		if (j == 5)
		{
			++x;
		}
		
		if (!player.canPlayerEdit(x, y, z, j, itemstack))
		{
			return false;
		}
		
		else
		{
			if (world.isAirBlock(x, y, z))
			{
				buildTent(world, x, y, z, this.colorCode);
			}
			
			if (!player.capabilities.isCreativeMode)
			{
				player.inventory.consumeInventoryItem(this);
			}
			return true;
		}
	}
}