package com.kutepov.samples.codeabbey;

import java.util.Arrays;
import java.util.Scanner;

public class DungeonsAndDragonsDice {

    private static final int NUM_OF_SERIES = 3;
    private static final int SERIES_SIZE = 100;
    private static final int MAX_DICES = 5;
    private static final int MAX_SIDES = 12;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < NUM_OF_SERIES; i++) {
            int[] series = new int[SERIES_SIZE];
            for (int j = 0; j < SERIES_SIZE; j++) {
                series[j] = input.nextInt();
            }
            input.nextInt(); //skip 0

            Arrays.sort(series);

            int min = series[0], max = series[SERIES_SIZE - 1];
            if (min > MAX_DICES) {
                min = MAX_DICES;
            }

            int sides = max / min;
            while (sides > MAX_SIDES) {
                sides -= 2;
            }
            if (sides % 2 > 0 && sides < MAX_SIDES) { //must be even
                //correct value
                sides++;
            }


            System.out.print(min + "d" + sides + " ");
        }

    }
}
