package com.kutepov.samples.codeabbey;

import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciSequence {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numbers = input.nextInt();
        input.nextLine();

        BigInteger[] fib = new BigInteger[numbers];
        int[] indexes = new int[numbers];
        for (int i = 0; i < numbers; i++) {
            String line = input.nextLine();
            BigInteger number = new BigInteger(line);
            fib[i] = number;
        }

        BigInteger a = BigInteger.valueOf(1), b = BigInteger.valueOf(0), c;
        int found = 0;
        for (int i = 1; i < 1000; i++) {
            c = a.add(b);
            a = b;
            b = c;
            for (int j = 0; j < numbers; j++) {
                if (fib[j].compareTo(c) == 0) {
                    indexes[j] = i;
                    found++;
                }
            }
            if (found == numbers) {
                break;
            }
        }

        for (int index : indexes) {
            System.out.print(index + " ");
        }

    }
}
