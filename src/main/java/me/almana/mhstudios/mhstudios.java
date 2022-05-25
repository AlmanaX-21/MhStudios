package me.almana.mhstudios;

import com.google.inject.Inject;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.plugin.Plugin;
import com.velocitypowered.api.proxy.ProxyServer;
import org.slf4j.Logger;

@Plugin(
        id = "MhStudios",
        name = "MhStudios",
        version = "1.0",
        description = "Basic rank forwarding for Minehut Studios server",
        authors = {"AlmanaX21"}
)
public class mhstudios {

    public Logger logger;
    public ProxyServer server;

    @Inject
    public void pluginInitialise(ProxyServer server, Logger logger) {

        this.server = server;
        this.logger = logger;

        logger.info("Plugin constructed.");
    }

    @Subscribe
    public void onProxyInitialization(ProxyInitializeEvent event, Logger logger) {

        this.logger = logger;
        logger.info("Plugin initialised");
    }
}
