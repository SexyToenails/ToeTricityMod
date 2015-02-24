package com.biconcave.item;

import com.biconcave.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Mitems {
	
	public static void mainRegistry() {
		initializeItem();
		registerItem();
	}
	
	public static Item tNail;
	
	public static void initializeItem() {
		tNail = new Item().setUnlocalizedName("tNail").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(RefStrings.MODID + "tNail");
		
	}

	public static void registerItem() {
		GameRegistry.registerItem(tNail, tNail.getUnlocalizedName());
		
	}
	
}
