package io.snw.iconmanager;

import io.snw.iconmanager.listeners.PingListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class IconManager extends JavaPlugin {

    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new PingListener(this), this);

        saveDefaultConfig();
    }
}
