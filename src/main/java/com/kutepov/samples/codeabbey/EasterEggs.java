package com.kutepov.samples.codeabbey;

import java.util.Scanner;

public class EasterEggs {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String eggsString = input.nextLine().replaceAll(" ", "");
        int sequence = Integer.valueOf(eggsString, 2);
        int size = eggsString.length() - 1;
        int[] values = new int[eggsString.length()];

        //read all changes for each egg as an integer value
        for (int i = 0; i <= size; i++) {
            String tokens[] = input.nextLine().replaceAll("\\d+:(.*)", "$1").trim().split(" ");
            int value = 0;
            for (String token : tokens) {
                value = setBit(value, size - Integer.valueOf(token));
            }
            values[i] = value;
        }

        //check all combinations from 0 to size
        for (int i = 0; i < values.length; i++) {
            int[] comb = new int[i];
            //fill a combination with start values {0,1,2,..,i}
            for (int j = 0; j < comb.length; j++)
                comb[j] = j;

            boolean found;
            do {
                found = testCombination(sequence, comb, values);
            } while (!found && nextCombination(comb, values.length - 1));

            if (found) {
                for (int egg : comb) {
                    System.out.print(egg + " ");
                }
                break;
            }
        }

    }

    private static int setBit(int value, int pos) {
        return value | 1 << pos;
    }

    private static boolean testCombination(int value, int[] comb, int[] values) {
        for (int idx : comb)
            value ^= values[idx];
        return value == 0;
    }

    private static boolean nextCombination(int[] comb, int n) {
        int k = comb.length;
        for (int i = k - 1; i >= 0; --i)
            if (comb[i] < n - k + i + 1) {
                comb[i]++;
                for (int j = i + 1; j < k; ++j)
                    comb[j] = comb[j - 1] + 1;
                return true;
            }
        return false;
    }
}
