package com.kutepov.samples.codeabbey;

import java.util.Scanner;

/**
 * @author Igor Kutepov
 */
@SuppressWarnings("SpellCheckingInspection")
public class LinearCongruentialGenerator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lines = input.nextInt();

        for (; lines > 0; lines--) {
            //Xnext = (A * Xcur + C) % M
            int a = input.nextInt(), c = input.nextInt(), m = input.nextInt(),
                    start = input.nextInt(), count = input.nextInt();

            for (; count > 0; count--) {
                start = (a * start + c) % m;
            }

            System.out.print(start + " ");

        }
    }
}
