package com.kutepov.samples.codeabbey;

import java.util.Scanner;

public class FibonacciDivisibilityAdvanced {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numbers = input.nextInt();

        for (int i = 0; i < numbers; i++) {
            int div = input.nextInt(), a = 1, b = 0, c, index = 0;

            do {
                c = (a + b) % div;
                a = b;
                b = c;
                index++;
            } while (c > 0);

            System.out.print(index + " ");
        }


    }
}
