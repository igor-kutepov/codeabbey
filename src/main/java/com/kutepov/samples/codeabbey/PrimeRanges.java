package com.kutepov.samples.codeabbey;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeRanges {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //read input
        int lines = input.nextInt();
        int[] pairs = new int[lines * 2], tmp = new int[lines * 2];
        for (int i = 0; i < lines * 2 - 1; i += 2) {
            pairs[i] = tmp[i] = input.nextInt();
            pairs[i + 1] = tmp[i + 1] = input.nextInt();
        }

        //find max value in input data
        Arrays.sort(tmp);
        int maxValue = tmp[tmp.length - 1];

        //build array with primes in range[0..maxValue];
        boolean[] isPrime = new boolean[maxValue];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i * i < maxValue; i++) {
            if (isPrime[i])
                for (int j = i * i; j < maxValue; j += i)
                    isPrime[j] = false;
        }

        //count primes in range [min, max] for each pair
        for (int i = 0; i < lines * 2 - 1; i += 2) {
            int min = pairs[i], max = pairs[i + 1], count = 2;
            for (int j = min + 1; j < max; j++) {
                if (isPrime[j]) {
                    count++;
                }
            }
            System.out.print(count + " ");
        }

    }
}
