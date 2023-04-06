package com.nowordsmakesense.pressuremakesdiamonds.block;

import com.nowordsmakesense.pressuremakesdiamonds.PressureMakesDiamonds;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup PMD;

    public static void registerItemGroup()
    {
        PMD = FabricItemGroup.builder(new Identifier(PressureMakesDiamonds.MOD_ID, "pmd")).displayName(Text.literal("Pressure Makes Diamonds")).icon(() -> new ItemStack(ModBlocks.PRESSURE_TABLE)).build();
    }
}
