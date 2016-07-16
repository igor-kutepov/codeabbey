package com.kutepov.samples.codeabbey;

import java.util.Scanner;

/**
 * @author Igor Kutepov
 */
public class SquareRoot {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = input.nextInt();

        StringBuilder sb = new StringBuilder();
        for (; count > 0; count--) {
            int value = input.nextInt();
            int steps = input.nextInt();
            float result = 1;
            while (steps-- > 0) {
                result = (result + value / result) / 2;
            }

            sb.append(result).append(' ');
        }

        System.out.println(sb.toString().trim());
    }
}
