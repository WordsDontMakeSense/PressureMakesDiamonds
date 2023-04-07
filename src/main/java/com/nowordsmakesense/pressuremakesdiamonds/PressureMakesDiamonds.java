package com.nowordsmakesense.pressuremakesdiamonds;

import com.nowordsmakesense.pressuremakesdiamonds.block.ModItemGroup;
import com.nowordsmakesense.pressuremakesdiamonds.block.ModBlocks;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PressureMakesDiamonds implements ModInitializer {
    public static final String MOD_ID = "pmd";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItemGroup.registerItemGroup();
        ModBlocks.registerModBlocks();
    }
}
