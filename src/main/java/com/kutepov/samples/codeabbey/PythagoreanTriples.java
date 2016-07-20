package com.kutepov.samples.codeabbey;

import java.util.Scanner;

public class PythagoreanTriples {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        input.nextInt();

        while (input.hasNextInt()) {
            long sum = input.nextInt();

            //try to find m and n values for pythagorean triples
            int m = 0, n;
            do {
                m++;
                while ((sum - 2 * Math.pow(m, 2)) % (2 * m) > 0) {
                    m++;
                }
                n = (int) ((sum - 2 * Math.pow(m, 2)) / (2 * m));
            } while (m <= n);

            //c = (m^2+n^2)^2
            long c = (long) Math.pow(Math.pow(m, 2) + Math.pow(n, 2), 2);

            System.out.print(c + " ");
        }
    }
}
