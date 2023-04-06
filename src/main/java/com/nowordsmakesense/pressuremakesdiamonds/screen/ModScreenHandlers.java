package com.nowordsmakesense.pressuremakesdiamonds.screen;

import net.minecraft.screen.ScreenHandlerType;

public class ModScreenHandlers {
    public static ScreenHandlerType<PressurizingScreenHandler> PRESSURIZING_SCREEN_HANDLER;

    public static void registerAllScreenHandlers() {
        PRESSURIZING_SCREEN_HANDLER = new ScreenHandlerType<>(PressurizingScreenHandler::new);
    }
}