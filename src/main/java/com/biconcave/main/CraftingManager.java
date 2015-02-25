package com.biconcave.main;

import com.biconcave.blocks.Mblocks;
import com.biconcave.item.Mitems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CraftingManager {
	public static void mainRegistry() {
		addCraftingRec();
		//addSmeltingRec();
	}
	public static void addCraftingRec() {	
		// Shaped Crafting
		// 9 Toenail Clippings = 1 Compressed ToeNail Block
		GameRegistry.addRecipe(new ItemStack(Mblocks.tnBlock), new Object[]{"XXX","XXX","XXX", 'X', Mitems.tNail});
		// Tools
		GameRegistry.addRecipe(new ItemStack(Mitems.tnPick), "xxx", " y ", " y ", 'x', Mitems.tNail, 'y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(Mitems.tnAxe), "xx ", "xy ", " y ", 'x', Mitems.tNail, 'y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(Mitems.tnSpade), " x ", " y ", " y ", 'x', Mitems.tNail, 'y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(Mitems.tnHoe), " xx", " y ", " y ", 'x', Mitems.tNail, 'y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(Mitems.tnSword), " x ", " x ", " y ", 'x', Mitems.tNail, 'y', Items.stick);
		
		// (Shapeless) 1 Compressed ToeNail Block ---> ToeNail Clippings
		GameRegistry.addShapelessRecipe(new ItemStack(Mitems.tNail, 9), new ItemStack(Mblocks.tnBlock));
	}
	public static void addSmeltingRec() {
		
	}
}
