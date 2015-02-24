package com.biconcave.blocks;

import com.biconcave.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class Mblocks {
	
	public static void mainRegistry() {
		initializeBlock();
		registerItem();
	}
	
	public static Block tnBlock;
	
	private static void initializeBlock() {
		tnBlock = new tnBlock(Material.ground).setBlockName("tnBlock").setCreativeTab(CreativeTabs.tabBlock).setBlockTextureName(RefStrings.MODID + ":tnBlock");
	}
	

	public static void registerItem() {
		GameRegistry.registerBlock(tnBlock, tnBlock.getUnlocalizedName());
	}
	
}
