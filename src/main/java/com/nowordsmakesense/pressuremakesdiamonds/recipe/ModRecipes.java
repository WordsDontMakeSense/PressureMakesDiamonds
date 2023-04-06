package com.nowordsmakesense.pressuremakesdiamonds.recipe;

import com.nowordsmakesense.pressuremakesdiamonds.PressureMakesDiamonds;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModRecipes {
    public static void registerRecipes()
    {
        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(PressureMakesDiamonds.MOD_ID, PressureTableRecipe.Serializer.ID), PressureTableRecipe.Serializer.INSTANCE);
        Registry.register(Registries.RECIPE_TYPE, new Identifier(PressureMakesDiamonds.MOD_ID, PressureTableRecipe.Type.ID), PressureTableRecipe.Type.INSTANCE);
    }
}
