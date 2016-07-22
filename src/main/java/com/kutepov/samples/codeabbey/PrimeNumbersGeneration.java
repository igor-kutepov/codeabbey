package com.kutepov.samples.codeabbey;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeNumbersGeneration {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size = input.nextInt();

        int[] indexes = new int[size], original = new int[size];
        for (int i = 0; i < size; i++) {
            original[i] = indexes[i] = input.nextInt();
        }
        Arrays.sort(indexes);

        //find approximate limit for number for the greatest index (means all needed primes
        //will be found in [0..upperBoundary]
        int maxIndex = indexes[size - 1];
        int upperBoundary = (int) Math.ceil(maxIndex >= 6 ? maxIndex * Math.log(maxIndex) + maxIndex * Math.log(Math.log(maxIndex)) : 12);

        boolean[] isPrime = new boolean[upperBoundary];
        int[] primes = new int[maxIndex];

        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i * i < upperBoundary; i++) {
            if (isPrime[i])
                for (int j = i * i; j < upperBoundary; j += i)
                    isPrime[j] = false;
        }

        int count = 0;
        for (int i = 0; i < isPrime.length; i++) {
            if (isPrime[i]) {
                primes[count] = i;
                count++;
                if (count >= maxIndex)
                    break;
            }
        }

        for (int index : original) {
            System.out.print(primes[index - 1] + " ");
        }
    }
}
