package com.nowordsmakesense.pressuremakesdiamonds.block;

import com.nowordsmakesense.pressuremakesdiamonds.PressureMakesDiamonds;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.CraftingTableBlock;
import net.minecraft.block.Material;
import net.minecraft.block.SlabBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block PRESSURED_COAL_BLOCK = registerBlock("pressured_coal_block", new Block(FabricBlockSettings.of(Material.STONE).strength(5.0f, 6.0f).requiresTool()), ModItemGroup.PMD);
    public static final Block COAL_SLAB = registerSlabBlock("coal_slab", new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(5.0f, 6.0f).requiresTool()), ModItemGroup.PMD);
    public static final Block PRESSURE_TABLE = registerBlock("pressure_table", new PressureTableBlock(FabricBlockSettings.of(Material.STONE).strength(3.5f, 3.5f).requiresTool()), ModItemGroup.PMD);

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registries.BLOCK, new Identifier(PressureMakesDiamonds.MOD_ID, name), block);
    }

    private static Block registerSlabBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registries.BLOCK, new Identifier(PressureMakesDiamonds.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab)
    {
        Item item = Registry.register(Registries.ITEM, new Identifier(PressureMakesDiamonds.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(tab).register(entries -> entries.add(item));
        return item;
    }

    public static void registerModBlocks()
    {
        PressureMakesDiamonds.LOGGER.debug("Registering ModBlocks for " + PressureMakesDiamonds.MOD_ID);
    }
}