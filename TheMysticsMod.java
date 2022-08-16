package net.zoomerreid.themysticsmod;

import net.fabricmc.api.ModInitializer;
import net.zoomerreid.themysticsmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TheMysticsMod implements ModInitializer {

	public static final String MOD_ID = "modid";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();


		LOGGER.info("Hello Fabric world!");
	}
}
