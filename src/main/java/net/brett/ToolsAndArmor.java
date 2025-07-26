package net.brett;

import net.brett.block.ModBlocks;
import net.brett.item.ModItemGroups;
import net.brett.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ToolsAndArmor implements ModInitializer {
	public static final String MOD_ID = "tools-and-armor";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}