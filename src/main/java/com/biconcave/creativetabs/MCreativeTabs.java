package com.biconcave.creativetabs;

import net.minecraft.creativetab.CreativeTabs;

public class MCreativeTabs {
	
	public static CreativeTabs tabToeBlock;
	public static CreativeTabs tabToeItem;
	
	public static void initialiseTabs() {
		tabToeBlock = new CreativeTabItem("BlockTab");
		tabToeItem = new CreativeTabBlock("ItemTab");
	}
}
