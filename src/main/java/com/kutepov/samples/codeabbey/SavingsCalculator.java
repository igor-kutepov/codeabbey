package com.kutepov.samples.codeabbey;

import java.math.BigDecimal;
import java.util.Scanner;

public class SavingsCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lines = input.nextInt();

        for (; lines > 0; lines--) {
            double start = input.nextInt(), required = input.nextInt(), interest = input.nextInt();

            BigDecimal money = BigDecimal.valueOf(start);
            int years = 0;
            do {
                years++;
                money = money.multiply(BigDecimal.valueOf(1 + interest / 100)).setScale(2, BigDecimal.ROUND_DOWN);
            } while (money.doubleValue() < required);

            System.out.print(years + " ");
        }

    }
}
