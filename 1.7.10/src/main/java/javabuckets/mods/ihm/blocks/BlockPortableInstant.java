package javabuckets.mods.ihm.blocks;

import scala.reflect.internal.Trees.This;
import javabuckets.mods.ihm.init.ModItems;
import javabuckets.mods.ihm.utility.Reference;
import net.ilexiconn.llibrary.common.structure.util.GenHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BlockPortableInstant extends Block 
{
	private static String color;
	
	public BlockPortableInstant(String color) 
	{
		super(Material.ground);
		this.setStepSound(soundTypeMetal);
		this.color = color;
	}
	
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int i, float f1, float f2, float f3) 
	{
		Block air = Blocks.air;
		
		for (int j = 0; j < 5; j++)
		{
			world.setBlock(x, y+1, z+1, air);
			
			world.setBlock(x, y, z+j, air);
			world.setBlock(x+1, y, z+j, air);
			world.setBlock(x+2, y, z+j, air);
			world.setBlock(x+3, y, z+j, air);
			world.setBlock(x+4, y, z+j, air);
			world.setBlock(x+5, y, z+j, air);
			
			world.setBlock(x, y+1, z+j, air);
			world.setBlock(x+1, y+1, z+j, air);
			world.setBlock(x+2, y+1, z+j, air);
			world.setBlock(x+3, y+1, z+j, air);
			world.setBlock(x+4, y+1, z+j, air);
			world.setBlock(x+5, y+1, z+j, air);
			
			world.setBlock(x, y+2, z+j, air);
			world.setBlock(x+1, y+2, z+j, air);
			world.setBlock(x+2, y+2, z+j, air);
			world.setBlock(x+3, y+2, z+j, air);
			world.setBlock(x+4, y+2, z+j, air);
			world.setBlock(x+5, y+2, z+j, air);
			
			world.setBlock(x, y+3, z+j, air);
			world.setBlock(x+1, y+3, z+j, air);
			world.setBlock(x+2, y+3, z+j, air);
			world.setBlock(x+3, y+3, z+j, air);
			world.setBlock(x+4, y+3, z+j, air);
			world.setBlock(x+5, y+3, z+j, air);
		}
		
		GenHelper.spawnEntityInStructure(world, new EntityItem(world, x, y, z, new ItemStack(ModItems.tent)), x, y, z);
		
		return true;
	}
	
	@Override
	public void registerBlockIcons(IIconRegister iconRegistry) 
	{
		blockIcon = iconRegistry.registerIcon(Reference.MOD_ID + ":" + this.getTextureName()/* + "_" + this.color*/);
	}
}