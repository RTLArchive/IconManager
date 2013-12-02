package io.snw.iconmanager;

import io.snw.iconmanager.utils.ImageGenerator;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;

public class Main {

    /**
     * I used this class to test if the image gen worked. It will be removed soon :/
     * @param args
     */
    public static void main(String[] args){
        File file = new File("DATAAAAA.png");

        try {
            ImageIO.write((RenderedImage) ImageGenerator.generateImage("CaptainBern"), "png", file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
