package com.kutepov.samples.codeabbey;

import java.util.Scanner;

public class GirlsAndPigs {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lines = input.nextInt();
        for (; lines > 0; lines--) {
            int legs = input.nextInt(), breasts = input.nextInt(), solutions = 0;
            int maxPigs = legs / 4;

            for (int pigs = maxPigs; pigs > 0; pigs--) {
                int girls = (legs - pigs * 4) / 2;

                //at least one girl should be exist and breasts always have an even integer value
                if (girls > 0 && (breasts - girls * 2) % pigs == 0 && ((breasts - girls * 2) / pigs) % 2 == 0) {
                    solutions++;
                }
            }

            System.out.print(solutions + " ");
        }
    }
}
