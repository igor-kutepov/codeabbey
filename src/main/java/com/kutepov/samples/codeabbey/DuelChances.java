package com.kutepov.samples.codeabbey;

import java.util.Scanner;

public class DuelChances {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lines = input.nextInt();

        for (; lines > 0; lines--) {
            double a = input.nextInt() / 100.0, b = input.nextInt() / 100.0;

            double p = a / (1 - (1 - a) * (1 - b));

            int result = (int) Math.round(p * 100);

            System.out.print(result + " ");
        }
    }
}
