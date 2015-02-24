package com.biconcave.creativetabs;

import com.biconcave.blocks.Mblocks;
import com.biconcave.item.Mitems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabBlock extends CreativeTabs {

	public CreativeTabBlock(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem() {
		return Mitems.tNail;
	}

}
