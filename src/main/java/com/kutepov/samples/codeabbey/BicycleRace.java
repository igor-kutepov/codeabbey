package com.kutepov.samples.codeabbey;

import java.math.BigDecimal;
import java.util.Scanner;

public class BicycleRace {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lines = input.nextInt();

        StringBuilder sb = new StringBuilder();
        for (; lines > 0; lines--) {
            int dist = input.nextInt(), speedA = input.nextInt(), speedB = input.nextInt();

            double result = speedA * dist / (double) (speedA + speedB);

            result = BigDecimal.valueOf(result).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();

            sb.append(result).append(' ');
        }

        System.out.println(sb.toString().replaceAll("\\.0 ", " "));
    }
}
