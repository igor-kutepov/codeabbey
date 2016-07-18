package com.kutepov.samples.codeabbey;

import java.util.Scanner;

public class SharePriceVolatility {


    private static final double MIN_PERCENT_OF_DEVIATION = 0.04;
    private static final int SERIES_SIZE = 14;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lines = input.nextInt();
        int[] series = new int[SERIES_SIZE];

        for (; lines > 0; lines--) {
            String name = input.next("[A-Z]+?");
            double avg = 0.0;
            for (int i = 0; i < series.length; i++) {
                avg += (series[i] = input.nextInt());
            }
            avg /= SERIES_SIZE;

            double dev = 0.0;
            for (int value : series) {
                dev += Math.pow(avg - value, 2);
            }
            dev /= SERIES_SIZE;
            dev = Math.sqrt(dev);

            if (dev / avg >= MIN_PERCENT_OF_DEVIATION) {
                System.out.print(name + " ");
            }

        }

    }
}
