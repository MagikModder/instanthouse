package javabuckets.mods.ihm.instants;

import java.util.List;

import javabuckets.mods.ihm.utility.Reference;
import net.ilexiconn.llibrary.common.structure.util.GenHelper;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemDoor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class InstantJediTemple extends InstantHouseBase
{
	public InstantJediTemple() 
	{
		super();
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
				buildJediTemple(world, x, y, z);
			}
			
			if (!player.capabilities.isCreativeMode)
			{
				player.inventory.consumeInventoryItem(this);
			}
			return true;
		}
	}
}