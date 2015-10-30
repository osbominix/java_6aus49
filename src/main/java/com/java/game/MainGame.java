package com.java.game;

/**
 * Created by yl on 30.10.15.
 */
public class MainGame {

    private static int lowestNumber = 1;
    private static int highestNumber = 49;
    private static int neededNumber = 6;

    public static void main (String[] args) {
        Generator generator = new Generator();
        generator.generateNumbers(lowestNumber, highestNumber, neededNumber);
        generator.generateSuperNumber();
    }
}
