package com.kutepov.samples.codeabbey;

import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciDivisibility {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numbers = input.nextInt();

        int[] div = new int[numbers];
        for (int i = 0; i < numbers; i++) {
            div[i] = input.nextInt();
        }

        int[] indexes = new int[numbers];
        BigInteger a = BigInteger.valueOf(1), b = BigInteger.valueOf(0), c;
        int found = 0, index = 0;
        do {
            c = a.add(b);
            a = b;
            b = c;
            index++;
            for (int j = 0; j < numbers; j++) {
                if (div[j] > 0 && c.mod(BigInteger.valueOf(div[j])).equals(BigInteger.ZERO)) {
                    indexes[j] = index;
                    div[j] = 0;
                    found++;
                }
            }

        } while (found < numbers);

        for (int idx : indexes) {
            System.out.print(idx + " ");
        }


    }
}
