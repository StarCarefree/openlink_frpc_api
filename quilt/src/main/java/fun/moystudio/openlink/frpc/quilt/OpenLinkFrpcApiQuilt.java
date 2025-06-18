package fun.moystudio.openlink.frpc.quilt;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

import fun.moystudio.openlink.frpc.OpenLinkFrpcApi;

public final class OpenLinkFrpcApiQuilt implements ModInitializer {
    @Override
    public void onInitialize(ModContainer mod) {
        // Run our common setup.
        OpenLinkFrpcApi.init();
    }
}
