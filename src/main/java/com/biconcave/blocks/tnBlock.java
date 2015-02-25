package com.biconcave.blocks;

import com.biconcave.lib.RefStrings;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class tnBlock extends Block{

	@SideOnly(Side.CLIENT)
	private IIcon top;
	@SideOnly(Side.CLIENT)
	private IIcon front;
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int p_149691_2_)
	{
	return side == 1 || side == 0 ? this.top : (side == 2 ? this.front : this.blockIcon);
	}
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister p_149651_1_)
	{
	this.blockIcon = p_149651_1_.registerIcon(RefStrings.MODID + ":" + "side");
	this.top = p_149651_1_.registerIcon(RefStrings.MODID + ":" + "top");
	this.front = p_149651_1_.registerIcon(RefStrings.MODID + ":" + "front");
	}
	
	protected tnBlock(Material p_i45394_1_) {
		super(p_i45394_1_);
		
	}

}
