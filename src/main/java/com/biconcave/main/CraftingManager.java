package com.biconcave.main;

import com.biconcave.blocks.Mblocks;
import com.biconcave.item.Mitems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CraftingManager {
	public static void mainRegistry() {
		addCraftingRec();
	}
	public static void addCraftingRec() {
		GameRegistry.addRecipe(new ItemStack(Mitems.tNail, 9), new Object[]{" X ", 'X', Mblocks.tnBlock});
		GameRegistry.addRecipe(new ItemStack(Mblocks.tnBlock), new Object[]{"XXX","XXX","XXX", 'X', Mitems.tNail});
	}
}