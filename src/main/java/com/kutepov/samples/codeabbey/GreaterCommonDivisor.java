package com.kutepov.samples.codeabbey;

import java.util.Scanner;

/**
 * @author Igor Kutepov
 */
public class GreaterCommonDivisor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lines = input.nextInt();

        for (; lines > 0; lines--) {
            int a = input.nextInt(), b = input.nextInt();

            int gcd = gcd(a, b);
            int lcm = lcm(a, b);

            System.out.print("(" + gcd + " " + lcm + ") ");
        }

    }

    private static int gcd(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    private static int lcm(int x, int y) {
        return x * y / gcd(x, y);
    }
}
