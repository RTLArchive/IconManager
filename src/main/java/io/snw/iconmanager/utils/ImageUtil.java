package io.snw.iconmanager.utils;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.*;
import java.util.List;

public class ImageUtil {

    /**
     * Returns an image with the given size.
     */
    public static BufferedImage generateImage(String name, int imageSize) {

        BufferedImage img = new BufferedImage(imageSize, imageSize, Image.SCALE_SMOOTH);
        img.getGraphics().drawImage(ImageGenerator.generateImage(name), 0, 0, imageSize, imageSize, null);

        return img;
    }

    /**
     * This code requires some optimization. I don't like the use of an iterator here but since
     * this is the only way I could get it to work :/
     */
    public static BufferedImage generate8x8(List<String> players) {
        BufferedImage finalImage = new BufferedImage(64, 64, Image.SCALE_SMOOTH);

        int SKIN_SIZE = 8;

        Iterator<String> iter = players.iterator();
        for(int x = 0; x < SKIN_SIZE; x++){
            for(int y = 0; y < SKIN_SIZE; y++){
                if(iter.hasNext()){
                    finalImage.getGraphics().drawImage(ImageGenerator.generateImage(iter.next()), x * SKIN_SIZE, y * SKIN_SIZE, SKIN_SIZE, SKIN_SIZE, null);
                }else{
                    iter = players.iterator(); //allows endless iteration
                    finalImage.getGraphics().drawImage(ImageGenerator.generateImage(iter.next()), x * SKIN_SIZE, y * SKIN_SIZE, SKIN_SIZE, SKIN_SIZE, null);
                }
            }
        }
        return finalImage;
    }
}
