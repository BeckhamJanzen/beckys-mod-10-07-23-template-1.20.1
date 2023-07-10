package net.becky.mod100723;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Mod100723 implements ModInitializer {
	public static final String MOD_ID = "mod100723";
    public static final Logger LOGGER = LoggerFactory.getLogger("beckys-mod-10-07-23");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");
	}
}