package com.kutepov.samples.codeabbey;

import java.util.Scanner;

public class FunnyWordsGenerator {

    private static final String CONSONANTS = "bcdfghjklmnprstvwxz";
    private static final String VOWELS = "aeiou";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int words = input.nextInt(), seed = input.nextInt();

        for (; words > 0; words--) {
            int length = input.nextInt();

            char[] chars = new char[length];

            int[] seq = linearGenerator(seed, length);
            seed = seq[seq.length - 1];

            for (int i = 0; i < seq.length; i++) {
                chars[i] = i % 2 == 0
                        ? CONSONANTS.charAt(seq[i] % CONSONANTS.length())
                        : VOWELS.charAt(seq[i] % VOWELS.length());
            }

            String word = String.valueOf(chars);

            System.out.print(word + " ");
        }

    }

    private static int[] linearGenerator(int seed, int count) {
        int[] result = new int[count];

        for (int i = 0; i < count; i++) {
            int current = i == 0 ? seed : result[i - 1];
            //Xnext = (A * Xcur + C) % M
            result[i] = (445 * current + 700001) % 2097152;
        }

        return result;
    }


}
