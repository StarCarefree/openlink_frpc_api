package fun.moystudio.openlink.frpc.forge;

import net.minecraftforge.fml.common.Mod;

import fun.moystudio.openlink.frpc.OpenLinkFrpcApi;

@Mod(OpenLinkFrpcApi.MOD_ID)
public final class OpenLinkFrpcApiForge {
    public OpenLinkFrpcApiForge() {
        // Run our common setup.
        OpenLinkFrpcApi.init();
    }
}
