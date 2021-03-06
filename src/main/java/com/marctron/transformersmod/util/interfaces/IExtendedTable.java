package com.marctron.transformersmod.util.interfaces;

import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public interface IExtendedTable {
	
	NonNullList<ItemStack> getMatrix();
	ItemStack getResult();
	void setResult(ItemStack stack);
	void setInventorySlotContents(int slot, ItemStack stack);
	int getLineSize();
}