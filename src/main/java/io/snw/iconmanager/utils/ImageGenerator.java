package io.snw.iconmanager.utils;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class ImageGenerator {

    /**
     * Returns a 64x64 image of the player head
     * @param player The name of the player
     * @return A head-image.
     */
    public static BufferedImage generateImage(String player) {

        Image img;
        Image goggles
                ;
        try {

            URL url = new URL("http://s3.amazonaws.com/MinecraftSkins/" + player + ".png");
            BufferedImage image = ImageIO.read(url);

            img = image.getSubimage(8, 8, 8, 8); //head c:
            goggles = image.getSubimage(40, 8, 8, 8); //should return the goggles, if I wouldn't do this then my skin looks retard ._.

            BufferedImage finalImage = new BufferedImage(64, 64, Image.SCALE_SMOOTH);
            finalImage.getGraphics().drawImage(img, 0, 0, 64, 64, null); //render head
            finalImage.getGraphics().drawImage(goggles, 0, 0, 64, 64, null); //render goggles

            return finalImage;
        } catch (MalformedURLException e) {
            //getLogger().warning("Failed to find valid image for player x!");
        } catch (IOException e) {
            //getLogger().warning("Failed to read the skin of player x!");
        }
        return null;
    }
}
