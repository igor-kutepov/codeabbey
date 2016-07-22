package com.kutepov.samples.codeabbey;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeNumbersGeneration {

    private static final int SEGMENT_SIZE = 30000;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size = input.nextInt();

        int max = Integer.MAX_VALUE;
        int n = (int) Math.sqrt(max);
        int m = n + 1;

        boolean[] isPrime = new boolean[n];
        int[] primes = new int[200_000];

        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i * i < n; i++) {
            if (isPrime[i])
                for (int j = i * i; j < n; j += i)
                    isPrime[j] = false;
        }

        int count = 0;
        for (int i = 0; i < isPrime.length; i++) {
            if (isPrime[i]) {
                primes[count] = i;
                count++;
            }
        }


        boolean[] segment = new boolean[SEGMENT_SIZE]; // вторичное решето
        for (int i = m - 1; i < max; i += SEGMENT_SIZE) {
            Arrays.fill(segment, true);
            for (int k = 0; k < count; i++) {
                int h = i % primes[k];
                int j = h > 0 ? primes[k] - h : 0;
                for (; j < SEGMENT_SIZE; j += primes[k])
                    segment[j] = false;
            }
            for (int k = 0; k < SEGMENT_SIZE; k++) {
                if (segment[k] && (k + i < max)) {
                    primes[count] = k + i;
                    count++;
//                    System.out.println(k + i); // выводим простое число на экран
                }
            }
        }


        for (; size > 0; size--) {
            int index = input.nextInt();


        }
    }
}
