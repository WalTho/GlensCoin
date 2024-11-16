package glens.glens_coin;

import net.fabricmc.api.ModInitializer;

import net.minecraft.item.Item;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Glens implements ModInitializer {
	public static final String MOD_ID = "glens";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	// Déclare l'objet "coin"
	public static final Item COIN = new Item(new Item.Settings());

	@Override
	public void onInitialize() {
		// Enregistre la pièce de monnaie
		Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "coin"), COIN);
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> entries.add(COIN));
		LOGGER.info("Hello Fabric world!");
	}
}