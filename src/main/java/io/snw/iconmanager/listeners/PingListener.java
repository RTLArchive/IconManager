package io.snw.iconmanager.listeners;

import io.snw.iconmanager.IconManager;
import io.snw.iconmanager.utils.ImageGenerator;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;

import java.util.List;

public class PingListener implements Listener {

    private IconManager plugin;

    public PingListener(IconManager plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPing(ServerListPingEvent event) {
        //an example
        try {
            event.setServerIcon(Bukkit.loadServerIcon(ImageGenerator.generateImage("CaptainBern")));
        } catch (Exception e) {
            //oh noes! D: we failed!
            e.printStackTrace();
        }
    }
}
