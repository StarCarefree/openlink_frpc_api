package fun.moystudio.openlink.frpc.fabric;

import net.fabricmc.api.ModInitializer;

import fun.moystudio.openlink.frpc.OpenLinkFrpcApi;

public final class OpenLinkFrpcApiFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        // Run our common setup.
        OpenLinkFrpcApi.init();
    }
}
