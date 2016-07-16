package com.kutepov.samples.codeabbey;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lines = input.nextInt();
        StringBuilder sb = new StringBuilder();
        for (; lines > 0; lines--) {
            int number = input.nextInt() * input.nextInt() + input.nextInt();
            int sumOfDigits = 0;
            do {
                sumOfDigits += number % 10;
            } while ((number /= 10) > 0);
            sb.append(sumOfDigits).append(' ');
        }

        System.out.println(sb.toString().trim());

    }
}
