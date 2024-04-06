package com.theseus;

import net.fabricmc.api.ModInitializer;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Theseus implements ModInitializer {
	public static final String MOD_ID = "theseus";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static final Item test_item_1 = new Item(new Item.Settings().group(ItemGroup.MISC).maxCount(16));

	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM,new Identifier("theseus","test_item_1"),test_item_1);

	}
}