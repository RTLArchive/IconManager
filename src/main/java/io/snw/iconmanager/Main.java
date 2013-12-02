package io.snw.iconmanager;

import io.snw.iconmanager.utils.ImageGenerator;
import io.snw.iconmanager.utils.ImageUtil;

import javax.imageio.ImageIO;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Main {

    /**
     * I used this class to test if the image gen worked. It will be removed soon :/
     * @param args
     */
    public static void main(String[] args) {
        File file = new File("DATAAAAA.png");

        String[] names = new String[]{
                "LeaverBoy",
                "metalheadcz",
                "Icarus",
                "Dominus",
                "Miner",
                "Goblin",
                "Citizen",
                "Maokai",
                "Judge",
                "Guard",
                "Herobrine",
                "God",
                "Alberts",
                "Notch",
                "PigZombie",
                "Dragonianer",
                "Pixelglitch1",
                "Dawdle2",
                "assassins_kid",
                "KingCharles",
                "Oracle",
                "Librarian",
                "augphlosiom",
                "Basic",
                "Wolfram",
                "EnlightendDead",
                "Hidendra",
                "Drakia",
                "Quaffle",
                "Jereq",
                "HoneyDew",
                "Xephos",
                "Israphel",
                "Grim",
                "Ezreal",
                "Jason",
                "Non",
                "Gazz",
                "Britannia",
                "Little",
                "aPunch",
                "Chris",
                "Joe",
                "Engel",
                "Blockmann",
                "Chef",
                "Archer",
                "CaptainSparklez",
                "Kaikez",
                "Adventurer",
                "Warami",
                "SoldjahBoy",
                "frosty",
                "ParkerGG",
                "Joymo",
                "AnewAaron",
                "TheDarkStar",
                "Geecku",
                "Shoigun",
                "Giik",
                "seekercat",
                "Yamatsukami",
                "MakaHearts",
                "Kraiten",
                "WingOfWar",
                "ThePengu",
                "Ninja",
                "Raecchi",
                "Amber",
                "MizLiv",
                "AngelGirl737",
                "SuccubusQueen"
        };

        try {
            ImageIO.write(ImageUtil.generate8x8(Arrays.asList(names)), "png", file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
