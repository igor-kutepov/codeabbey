package com.kutepov.samples.codeabbey;

import java.util.Arrays;
import java.util.Scanner;

public class YachtOrDicePoker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        input.nextLine();

        while (input.hasNextLine()) {
            String[] tokens = input.nextLine().split(" ");
            int[] dices = new int[tokens.length];
            for (int i = 0; i < tokens.length; i++) {
                dices[i] = Integer.valueOf(tokens[i]);
            }
            Arrays.sort(dices);

            System.out.print(getCombination(dices) + " ");
        }

    }


    private static String getCombination(int[] dices) {

        boolean straight = true;
        int[] duplicates = new int[6];
        for (int i = 1; i < dices.length; i++) {
            int diff = dices[i] - dices[i - 1];
            straight = diff == 1 && straight;
            if (diff == 0) {
                duplicates[dices[i] - 1]++;
            }
        }

        if (straight) {
            if (dices[0] == 2)
                return "big-straight";
            else
                return "small-straight";
        }

        int firstCounter = 0, secondCounter = 0;
        for (int duplicate : duplicates) {
            if (duplicate > 0 && firstCounter == 0) {
                firstCounter = duplicate;
            } else if (duplicate > 0 && secondCounter == 0) {
                secondCounter = duplicate;
            }
        }

        if (firstCounter > 0 && secondCounter > 0) {
            if (firstCounter != secondCounter)
                return "full-house";
            else
                return "two-pairs";
        } else if (firstCounter > 0) {
            switch (firstCounter) {
                case 4:
                    return "yacht";
                case 3:
                    return "four";
                case 2:
                    return "three";
                case 1:
                    return "pair";
            }
        }

        return "none";
    }
}
