package javabuckets.mods.ihm.instants;

import javabuckets.mods.ihm.init.ModItems;
import javabuckets.mods.ihm.utility.Reference;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemDoor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class InstantHouseBase extends Item 
{
	public InstantHouseBase() 
	{
		super();
		this.setMaxStackSize(1);
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
			
			player.inventory.consumeInventoryItem(this);
			return true;
		}
	}
	
	public void buildDefaultHouse(World world, int x, int y, int z)
	{
		for(int par1 = 0; par1 < 5; ++par1)
		{
			world.setBlock(x, y + par1, z, Blocks.log);
			world.setBlock(x + 9, y + par1, z, Blocks.log);
			world.setBlock(x + 9, y + par1, z + 9, Blocks.log);
			world.setBlock(x, y + par1, z + 9, Blocks.log);
		}
		
		for(int par2 = 0; par2 < 8; ++par2)
		{
			world.setBlock(x + 1 + par2, y + 3, z, Blocks.log, 4, 2);
			world.setBlock(x + 1 + par2, y + 3, z + 9, Blocks.log, 4, 2);
			world.setBlock(x, y + 3, z + 1 + par2, Blocks.log, 8, 2);
			world.setBlock(x + 9, y + 3, z + 1 + par2, Blocks.log, 8, 2);

			world.setBlock(x + 1 + par2, y, z, Blocks.planks);
			world.setBlock(x + 1 + par2, y + 1, z, Blocks.planks);
			world.setBlock(x + 1 + par2, y + 2, z, Blocks.planks);
			world.setBlock(x + 1 + par2, y, z + 9, Blocks.planks);
			world.setBlock(x + 1 + par2, y + 1, z + 9, Blocks.planks);
			world.setBlock(x + 1 + par2, y + 2, z + 9, Blocks.planks);		
			world.setBlock(x + 9, y, z + 1 + par2, Blocks.planks);
			world.setBlock(x + 9, y + 1, z + 1 + par2, Blocks.planks);
			world.setBlock(x + 9, y + 2, z + 1 + par2, Blocks.planks);		
			world.setBlock(x, y, z + 1 + par2, Blocks.planks);
			world.setBlock(x, y + 1, z + 1 + par2, Blocks.planks);
			world.setBlock(x, y + 2, z + 1 + par2, Blocks.planks);

			world.setBlockToAir(x, y, z + 4); world.setBlockToAir(x, y, z + 5); world.setBlockToAir(x, y + 1, z + 4); world.setBlockToAir(x, y + 1, z + 5);
			ItemDoor.placeDoorBlock(world, x, y, z + 4, 2, Blocks.wooden_door); ItemDoor.placeDoorBlock(world, x, y, z + 5, 2, Blocks.wooden_door);
		}
		
		for(int par3 = 0; par3 < 10; ++par3)
		{
			world.setBlock(x + par3, y - 1, z, Blocks.planks);
			world.setBlock(x + par3, y - 1, z+1, Blocks.planks);
			world.setBlock(x + par3, y - 1, z+2, Blocks.planks);
			world.setBlock(x + par3, y - 1, z+3, Blocks.planks);
			world.setBlock(x + par3, y - 1, z+4, Blocks.planks);
			world.setBlock(x + par3, y - 1, z+5, Blocks.planks);
			world.setBlock(x + par3, y - 1, z+6, Blocks.planks);
			world.setBlock(x + par3, y - 1, z+7, Blocks.planks);
			world.setBlock(x + par3, y - 1, z+8, Blocks.planks);
			world.setBlock(x + par3, y - 1, z+9, Blocks.planks);
		}
		
		for(int par4 = 0; par4 < 8; ++par4)
		{
			world.setBlock(x + 1 + par4, y + 3, z + 1, Blocks.planks);
			world.setBlock(x + 1 + par4, y + 3, z + 2, Blocks.planks);
			world.setBlock(x + 1 + par4, y + 3, z + 3, Blocks.planks);
			world.setBlock(x + 1 + par4, y + 3, z + 4, Blocks.planks);
			world.setBlock(x + 1 + par4, y + 3, z + 5, Blocks.planks);
			world.setBlock(x + 1 + par4, y + 3, z + 6, Blocks.planks);
			world.setBlock(x + 1 + par4, y + 3, z + 7, Blocks.planks);
			world.setBlock(x + 1 + par4, y + 3, z + 8, Blocks.planks);
		}
		
		for(int par5 = 0; par5 < 12; ++par5)
		{
			world.setBlock(x - 1 + par5, y + 4, z - 1, Blocks.stone_brick_stairs, 2, 2);
			world.setBlock(x - 1 + par5, y + 5, z, Blocks.stone_brick_stairs, 2, 2);
			world.setBlock(x - 1 + par5, y + 6, z + 1, Blocks.stonebrick);
			world.setBlock(x - 1 + par5, y + 7, z + 1, Blocks.stone_brick_stairs, 2, 2);
			world.setBlock(x - 1 + par5, y + 8, z + 2, Blocks.stonebrick);
			world.setBlock(x - 1 + par5, y + 9, z + 2, Blocks.stone_brick_stairs, 2, 2);
			world.setBlock(x - 1 + par5, y + 10, z + 3, Blocks.stone_brick_stairs, 2, 2);
			world.setBlock(x - 1 + par5, y + 11, z + 4, Blocks.stone_slab, 5, 2);
			
			world.setBlock(x - 1 + par5, y + 11, z + 5, Blocks.stone_slab, 5, 2);
			world.setBlock(x - 1 + par5, y + 10, z + 6, Blocks.stone_brick_stairs, 3, 2);
			world.setBlock(x - 1 + par5, y + 9, z + 7, Blocks.stone_brick_stairs, 3, 2);
			world.setBlock(x - 1 + par5, y + 8, z + 7, Blocks.stonebrick);
			world.setBlock(x - 1 + par5, y + 7, z + 8, Blocks.stone_brick_stairs, 3, 2);
			world.setBlock(x - 1 + par5, y + 6, z + 8, Blocks.stonebrick);
			world.setBlock(x - 1 + par5, y + 5, z + 9, Blocks.stone_brick_stairs, 3, 2);
			world.setBlock(x - 1 + par5, y + 4, z + 10, Blocks.stone_brick_stairs, 3, 2);
			
			world.setBlock(x - 1, y + 4, z, Blocks.stone_brick_stairs, 7, 2);
			world.setBlock(x - 1, y + 5, z + 1, Blocks.stone_brick_stairs, 7, 2);
			world.setBlock(x - 1, y + 7, z + 2, Blocks.stone_brick_stairs, 7, 2);
			world.setBlock(x - 1, y + 9, z + 3, Blocks.stone_brick_stairs, 7, 2);
			world.setBlock(x - 1, y + 10, z + 4, Blocks.stone_brick_stairs, 7, 2);
			world.setBlock(x - 1, y + 10, z + 5, Blocks.stone_brick_stairs, 6, 2);
			world.setBlock(x - 1, y + 9, z + 6, Blocks.stone_brick_stairs, 6, 2);
			world.setBlock(x - 1, y + 7, z + 7, Blocks.stone_brick_stairs, 6, 2);
			world.setBlock(x - 1, y + 5, z + 8, Blocks.stone_brick_stairs, 6, 2);
			world.setBlock(x - 1, y + 4, z + 9, Blocks.stone_brick_stairs, 6, 2);
			
			world.setBlock(x + 10, y + 4, z, Blocks.stone_brick_stairs, 7, 2);
			world.setBlock(x + 10, y + 5, z + 1, Blocks.stone_brick_stairs, 7, 2);
			world.setBlock(x + 10, y + 7, z + 2, Blocks.stone_brick_stairs, 7, 2);
			world.setBlock(x + 10, y + 9, z + 3, Blocks.stone_brick_stairs, 7, 2);
			world.setBlock(x + 10, y + 10, z + 4, Blocks.stone_brick_stairs, 7, 2);		
			world.setBlock(x + 10, y + 10, z + 5, Blocks.stone_brick_stairs, 6, 2);
			world.setBlock(x + 10, y + 9, z + 6, Blocks.stone_brick_stairs, 6, 2);
			world.setBlock(x + 10, y + 7, z + 7, Blocks.stone_brick_stairs, 6, 2);
			world.setBlock(x + 10, y + 5, z + 8, Blocks.stone_brick_stairs, 6, 2);
			world.setBlock(x + 10, y + 4, z + 9, Blocks.stone_brick_stairs, 6, 2);
		}
		
		for(int par6 = 0; par6 < 2; ++par6)
		{
			world.setBlock(x, y + 4 + par6, z + 1, Blocks.planks);
			world.setBlock(x, y + 4 + par6, z + 8, Blocks.planks);
			world.setBlock(x, y + 10, z + 4 + par6, Blocks.planks);
			
			world.setBlock(x + 9, y + 4 + par6, z + 1, Blocks.planks);
			world.setBlock(x + 9, y + 4 + par6, z + 8, Blocks.planks);
			world.setBlock(x + 9, y + 10, z + 4 + par6, Blocks.planks);
		}
		
		for(int par7 = 0; par7 < 4; ++par7)
		{
			world.setBlock(x, y + 4 + par7, z + 2, Blocks.log);
			world.setBlock(x, y + 4 + par7, z + 7, Blocks.log);
			world.setBlock(x, y + 8, z + 3 + par7, Blocks.log, 8, 2);
			world.setBlock(x, y + 9, z + 3 + par7, Blocks.planks);
			world.setBlock(x, y + 7, z + 3 + par7, Blocks.stonebrick);
			world.setBlock(x, y + 6, z + 3 + par7, Blocks.glass_pane);
			world.setBlock(x, y + 5, z + 3 + par7, Blocks.glass_pane);
			world.setBlock(x, y + 4, z + 3 + par7, Blocks.stonebrick);
			
			world.setBlock(x + 9, y + 4 + par7, z + 2, Blocks.log);
			world.setBlock(x + 9, y + 4 + par7, z + 7, Blocks.log);
			world.setBlock(x + 9, y + 8, z + 3 + par7, Blocks.log, 8, 2);
			world.setBlock(x + 9, y + 9, z + 3 + par7, Blocks.planks);
			world.setBlock(x + 9, y + 7, z + 3 + par7, Blocks.stonebrick);
			world.setBlock(x + 9, y + 6, z + 3 + par7, Blocks.glass_pane);
			world.setBlock(x + 9, y + 5, z + 3 + par7, Blocks.glass_pane);
			world.setBlock(x + 9, y + 4, z + 3 + par7, Blocks.glass_pane);
		}
		
		//Decoration
		world.setBlock(x, y, z + 3, Blocks.log); world.setBlock(x, y + 1, z + 3, Blocks.log); world.setBlock(x, y + 2, z + 3, Blocks.log);
		world.setBlock(x, y, z + 6, Blocks.log); world.setBlock(x, y + 1, z + 6, Blocks.log); world.setBlock(x, y + 2, z + 6, Blocks.log);
		world.setBlock(x, y + 2, z + 4, Blocks.oak_stairs, 4, 2); world.setBlock(x, y + 2, z + 5, Blocks.oak_stairs, 4, 2);
		world.setBlock(x - 1, y, z + 3, Blocks.fence); world.setBlock(x - 2, y, z + 3, Blocks.fence); world.setBlock(x - 3, y, z + 3, Blocks.fence); world.setBlock(x - 3, y + 1, z + 3, Blocks.fence); world.setBlock(x - 3, y + 2, z + 3, Blocks.fence);
		world.setBlock(x - 1, y, z + 6, Blocks.fence); world.setBlock(x - 2, y, z + 6, Blocks.fence); world.setBlock(x - 3, y, z + 6, Blocks.fence); world.setBlock(x - 3, y + 1, z + 6, Blocks.fence); world.setBlock(x - 3, y + 2, z + 6, Blocks.fence);
		for(int a = 0; a < 4; ++a) { world.setBlock(x - 1, y + 3, z + 3 + a, Blocks.stone_slab, 5, 2); world.setBlock(x - 2, y + 3, z + 3 + a, Blocks.stone_slab, 5, 2); world.setBlock(x - 3, y + 3, z + 3 + a, Blocks.stone_slab, 5, 2); }
		world.setBlock(x - 1, y + 3, z + 3, Blocks.stonebrick); world.setBlock(x - 1, y + 3, z + 4, Blocks.stonebrick); world.setBlock(x - 1, y + 3, z + 5, Blocks.stonebrick); world.setBlock(x - 1, y + 3, z + 6, Blocks.stonebrick); world.setBlock(x - 2, y + 3, z + 4, Blocks.stonebrick); world.setBlock(x - 2, y + 3, z + 5, Blocks.stonebrick);
		world.setBlock(x - 1, y + 4, z + 4, Blocks.stone_brick_stairs); world.setBlock(x - 1, y + 4, z + 5, Blocks.stone_brick_stairs);
		world.setBlockToAir(x - 1, y - 1, z + 1); world.setBlockToAir(x - 1, y - 1, z + 8);
		world.setBlock(x - 1, y + 4, z + 1, Blocks.stonebrick); world.setBlock(x - 1, y + 4, z + 8, Blocks.stonebrick);
		world.setBlock(x - 2, y + 4, z + 1, Blocks.stone_brick_stairs); world.setBlock(x - 2, y + 4, z + 8, Blocks.stone_brick_stairs); world.setBlock(x - 2, y + 3, z + 1, Blocks.stone_brick_stairs, 4, 2); world.setBlock(x - 2, y + 3, z + 8, Blocks.stone_brick_stairs, 4, 2);
		world.setBlock(x - 1, y + 3, z + 2, Blocks.stone_brick_stairs, 2, 2); world.setBlock(x - 1, y + 3, z + 9, Blocks.stone_brick_stairs, 2, 2); world.setBlock(x - 1, y + 3, z, Blocks.stone_brick_stairs, 3, 2); world.setBlock(x - 1, y + 3, z + 7, Blocks.stone_brick_stairs, 3, 2);
		world.setBlock(x - 1, y + 3, z + 1, Blocks.water); world.setBlock(x - 1, y + 3, z + 8, Blocks.water);
		world.setBlockToAir(x + 4, y + 3, z + 8); world.setBlockToAir(x + 5, y + 3, z + 8);
		world.setBlock(x + 4, y + 4, z + 9, Blocks.stonebrick); world.setBlock(x + 5, y + 4, z + 9, Blocks.stonebrick);
		for(int b = 0; b < 6; ++b) { world.setBlock(x + 4, y + b, z + 8, Blocks.ladder, 2, 2); world.setBlock(x + 5, y + b, z + 8, Blocks.ladder, 2, 2); }
		
		//Windows
		world.setBlock(x, y + 1, z + 2, Blocks.glass_pane); world.setBlock(x, y + 1, z + 7, Blocks.glass_pane);
		world.setBlock(x + 2, y + 1, z, Blocks.glass_pane); world.setBlock(x + 3, y + 1, z, Blocks.glass_pane);
		world.setBlock(x + 6, y + 1, z, Blocks.glass_pane); world.setBlock(x + 7, y + 1, z, Blocks.glass_pane);
		world.setBlock(x + 9, y + 1, z + 2, Blocks.glass_pane); world.setBlock(x + 9, y + 1, z + 3, Blocks.glass_pane);
		world.setBlock(x + 9, y + 1, z + 6, Blocks.glass_pane); world.setBlock(x + 9, y + 1, z + 7, Blocks.glass_pane);
		world.setBlock(x + 2, y + 1, z + 9, Blocks.glass_pane); world.setBlock(x + 3, y + 1, z + 9, Blocks.glass_pane);
		world.setBlock(x + 6, y + 1, z + 9, Blocks.glass_pane); world.setBlock(x + 7, y + 1, z + 9, Blocks.glass_pane);
	}
	
	public void buildJediTemple(World world, int x, int y, int z)
	{
		for (int i = 0; i < 10; i++)
		{
			world.setBlock(x, y, z+1+i, Blocks.quartz_stairs);
			world.setBlock(x+1, y, z+1+i, Blocks.quartz_block, 1, 2);
		}
	}
	
	@Override
	public void registerIcons(IIconRegister iconRegistry) 
	{
		itemIcon = iconRegistry.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(5));
	}
}