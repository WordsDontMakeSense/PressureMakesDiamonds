package com.nowordsmakesense.pressuremakesdiamonds;

import com.nowordsmakesense.pressuremakesdiamonds.block.ModItemGroup;
import com.nowordsmakesense.pressuremakesdiamonds.block.ModBlocks;
import com.nowordsmakesense.pressuremakesdiamonds.entity.PressureTableEntity;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
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
