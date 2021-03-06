package com.java.game;

import java.util.*;

/**
 * Created by yl on 30.10.15.
 */
public class Generator {

    Set<Integer> numberSet = new HashSet<Integer>();

    List<Integer> lottoNumber = new ArrayList<Integer>();

    Random r = new Random();

    public void generateNumbers(int lowestNumber, int highestNumber, int neededNumber) {
        for (int i = 1; i <= highestNumber; i++) {
            numberSet.add(i);
        }

        for (int i = 1; i <= neededNumber; i++) {

            int randomNumber = r.nextInt(highestNumber - lowestNumber) + lowestNumber;

            while (lottoNumber.contains(randomNumber)) {
                randomNumber = r.nextInt(highestNumber - lowestNumber) + lowestNumber;
            }

            lottoNumber.add(randomNumber);
        }

        Collections.sort(lottoNumber);

        System.out.println("Six numbers are:");
        for (int i: lottoNumber) {
            System.out.print(i + " ");
        }
    }

    public void generateSuperNumber() {

        int superNumber = r.nextInt(9 - 0);

        System.out.println();
        System.out.println();
        System.out.println("The super Number is:");
        System.out.println(superNumber);
    }


}
