package io.snw.iconmanager.data;

import io.snw.iconmanager.utils.ImageGenerator;
import org.bukkit.Bukkit;
import org.bukkit.util.CachedServerIcon;

/**
 * Gets a player's skin online.
 * This class is only initialized if mode is set to PLAYER_SKIN
 */
public class SkinData {

    public SkinData(String playerName) {

    }

    public CachedServerIcon getSkin(String name) {
        try {
            return Bukkit.loadServerIcon(ImageGenerator.generateImage(name));
        } catch (Exception e) {
            //don't care about the error since it seems like the server uses the old cachedicon when this one fails.
            return null;
        }
    }
}
