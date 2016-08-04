package com.kutepov.samples.codeabbey;

import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection")
public class LexicographicPermutations {

    private static final int SIZE = 12;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        input.nextInt();

        while (input.hasNextInt()) {
            int n = input.nextInt(); //permutations count

            char[] result = new char[SIZE]; //permutations result
            int[] array = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};  //start permutation
            int[] permutation = new int[SIZE];  // n in factorial radix

            for (int i = 1; i <= SIZE; i++) {
                int k = n % i;
                n /= i;
                permutation[i - 1] = k;
            }

            for (int i = SIZE - 1; i >= 0; i--) {
                int k = permutation[i];
                result[SIZE - 1 - i] = (char) (array[k] + 'A');
                System.arraycopy(array, k + 1, array, k, SIZE - 1 - k);
            }

            System.out.print(String.valueOf(result) + " ");
        }
    }
}
