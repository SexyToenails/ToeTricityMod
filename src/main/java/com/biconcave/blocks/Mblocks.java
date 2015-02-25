package com.biconcave.blocks;

import com.biconcave.creativetabs.MCreativeTabs;
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
	//Compressed Toenail block
	public static Block tnBlock;
	public static Block tnCrop;
	
	private static void initializeBlock() {
		tnBlock = new tnBlock(Material.ground).setBlockName("tnBlock").setCreativeTab(MCreativeTabs.tabToeBlock);
		//tnCrop = new tCrop().setBlockName("tnCrop").setCreativeTab(MCreativeTabs.tabToeBlock).setBlockTextureName(RefStrings.MODID + ":tnPlant");
	}
	

	public static void registerItem() {
		GameRegistry.registerBlock(tnBlock, tnBlock.getUnlocalizedName());
	}
	
}
