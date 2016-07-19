package com.kutepov.samples.codeabbey;

import java.util.Scanner;

public class CollatzSequence {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = input.nextInt();

        for (; count > 0; count--) {
            int number = input.nextInt(), steps = 0;
            do {
                if (number % 2 == 0) {
                    number /= 2;
                } else {
                    number = 3 * number + 1;
                }
                steps++;
            } while (number > 1);

            System.out.print(steps + " ");
        }

    }
}
