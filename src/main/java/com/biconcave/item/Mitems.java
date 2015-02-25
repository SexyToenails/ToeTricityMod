package com.biconcave.item;

import com.biconcave.creativetabs.MCreativeTabs;
import com.biconcave.lib.RefStrings;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class Mitems {
	
	public static void mainRegistry() {
		initializeItem();
		registerItem();
	}
	
	public static ToolMaterial htnClips = EnumHelper.addToolMaterial("Hardened ToeNails", 3, 1000, 10.0f, 2.5f, 10);
	
	public static Item tNail;
	public static Item tToe;
	public static Item tnPick;
	public static Item tnAxe;
	public static Item tnSpade;
	public static Item tnHoe;
	public static Item tnSword;
	
	public static void initializeItem() {
		tNail = new Item().setUnlocalizedName("tNail").setCreativeTab(MCreativeTabs.tabToeItem).setTextureName(RefStrings.MODID + ":tnClip");	
		tToe = new Item().setUnlocalizedName("tToe").setCreativeTab(MCreativeTabs.tabToeItem).setTextureName(RefStrings.MODID + ":tToe");
		tnPick = new tnPick(htnClips).setUnlocalizedName("tnPick").setCreativeTab(MCreativeTabs.tabToeItem).setTextureName(RefStrings.MODID + ":tnPick");
		tnAxe = new tnAxe(htnClips).setUnlocalizedName("tnAxe").setCreativeTab(MCreativeTabs.tabToeItem).setTextureName(RefStrings.MODID + ":tnAxe");
		tnSpade = new tnSpade(htnClips).setUnlocalizedName("tnSpade").setCreativeTab(MCreativeTabs.tabToeItem).setTextureName(RefStrings.MODID + ":tnSpade");
		tnHoe = new tnHoe(htnClips).setUnlocalizedName("tnHoe").setCreativeTab(MCreativeTabs.tabToeItem).setTextureName(RefStrings.MODID + ":tnHoe");
		tnSword = new tnSword(htnClips).setUnlocalizedName("tnSword").setCreativeTab(MCreativeTabs.tabToeItem).setTextureName(RefStrings.MODID + ":tnSword");
	}

	public static void registerItem() {
		GameRegistry.registerItem(tNail, tNail.getUnlocalizedName());
		GameRegistry.registerItem(tToe, tToe.getUnlocalizedName());
		GameRegistry.registerItem(tnPick, tnPick.getUnlocalizedName());
		GameRegistry.registerItem(tnAxe, tnAxe.getUnlocalizedName());
		GameRegistry.registerItem(tnSpade, tnSpade.getUnlocalizedName());
		GameRegistry.registerItem(tnHoe, tnHoe.getUnlocalizedName());
		GameRegistry.registerItem(tnSword, tnSword.getUnlocalizedName());
	}

}