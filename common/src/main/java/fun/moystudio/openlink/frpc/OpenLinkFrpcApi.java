package fun.moystudio.openlink.frpc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class OpenLinkFrpcApi {
    public static final String MOD_ID = "openlink_frpc_api";
    public static final Logger LOGGER = LogManager.getLogger();

    public static void init() {
        LOGGER.info("OpenLinkFrpcApi initialized.");
    }
}
