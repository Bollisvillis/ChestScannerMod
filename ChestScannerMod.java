package net.dinmod.chestscanner;

import net.fabricmc.api.ClientModInitializer;

public class ChestScannerMod implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        System.out.println("✅ Chest Scanner aktiv!");
    }
}
