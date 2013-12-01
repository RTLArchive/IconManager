package io.snw.iconmanager.listeners;

import io.snw.iconmanager.IconManager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;

public class PingListener implements Listener {

    private IconManager plugin;

    public PingListener(IconManager plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPing(ServerListPingEvent event) {

    }
}
