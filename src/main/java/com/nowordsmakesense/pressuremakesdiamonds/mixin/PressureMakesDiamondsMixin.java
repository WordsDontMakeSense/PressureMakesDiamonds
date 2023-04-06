package com.nowordsmakesense.pressuremakesdiamonds.mixin;

import com.nowordsmakesense.pressuremakesdiamonds.PressureMakesDiamonds;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class PressureMakesDiamondsMixin {
    @Inject(at = @At("HEAD"), method = "init()V")
    private void init(CallbackInfo info) {
        // PressureMakesDiamonds.LOGGER.info("This line is printed by an example mod mixin!");
    }
}
