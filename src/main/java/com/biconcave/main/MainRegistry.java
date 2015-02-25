package com.biconcave.main;

import net.minecraft.init.Blocks;

import com.biconcave.blocks.Mblocks;
import com.biconcave.creativetabs.MCreativeTabs;
import com.biconcave.item.Mitems;
import com.biconcave.lib.RefStrings;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = RefStrings.MODID , name = RefStrings.NAME , version = RefStrings.VERSION)
public class MainRegistry {
	
	@SidedProxy(clientSide = RefStrings.CLIENTSIDEPROXY , serverSide = RefStrings.SERVERSIDEPROXY)
	public static ServerProxy proxy;

	@EventHandler
	public static void PreLoad(FMLPreInitializationEvent PreEvent) {
		MCreativeTabs.initialiseTabs();
		Mblocks.mainRegistry();
		Mitems.mainRegistry();
		CraftingManager.mainRegistry();
		proxy.registerRenderInfo();
	}
	@EventHandler
	public static void Load(FMLInitializationEvent Event) {
		
	}
	@EventHandler
	public static void PostLoad(FMLPostInitializationEvent PostEvent) {
		
	}
}