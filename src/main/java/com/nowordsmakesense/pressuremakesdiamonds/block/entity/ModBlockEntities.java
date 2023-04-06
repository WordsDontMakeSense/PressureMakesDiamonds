package com.nowordsmakesense.pressuremakesdiamonds.block.entity;

import com.nowordsmakesense.pressuremakesdiamonds.PressureMakesDiamonds;
import com.nowordsmakesense.pressuremakesdiamonds.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static BlockEntityType<PressureTableBlockEntity> PRESSURE_TABLE_BLOCK;

    public static void registerBlockEntities() {
        PRESSURE_TABLE_BLOCK = Registry.register(Registries.BLOCK_ENTITY_TYPE,
                new Identifier(PressureMakesDiamonds.MOD_ID, "gem_infusing_station"),
                FabricBlockEntityTypeBuilder.create(PressureTableBlockEntity::new,
                        ModBlocks.PRESSURE_TABLE).build(null));
    }
}