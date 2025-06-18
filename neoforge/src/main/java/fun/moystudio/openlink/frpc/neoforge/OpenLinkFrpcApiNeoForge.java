package fun.moystudio.openlink.frpc.neoforge;

import net.neoforged.fml.common.Mod;

import fun.moystudio.openlink.frpc.OpenLinkFrpcApi;

@Mod(OpenLinkFrpcApi.MOD_ID)
public final class OpenLinkFrpcApiNeoForge {
    public OpenLinkFrpcApiNeoForge() {
        // Run our common setup.
        OpenLinkFrpcApi.init();
    }
}
