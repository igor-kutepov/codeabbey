package com.kutepov.samples.codeabbey;

import java.util.Locale;
import java.util.Scanner;

public class DiceRolling {

    private static final int DICE_SIZE = 6;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        int lines = input.nextInt();

        for (; lines > 0; lines--) {
            double value = input.nextDouble();
            int dice = (int) (value * DICE_SIZE) + 1;

            System.out.print(dice + " ");
        }


    }
}
