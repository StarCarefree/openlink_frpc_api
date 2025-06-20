package fun.moystudio.openlink.frpc.quilt;

import net.fabricmc.api.ModInitializer;
import org.quiltmc.loader.api.ModContainer;


import fun.moystudio.openlink.frpc.OpenLinkFrpcApi;

public final class OpenLinkFrpcApiQuilt implements ModInitializer {
    @Override
    public void onInitialize() {
        // Run our common setup.
        OpenLinkFrpcApi.init();
    }
}
