package com.kutepov.samples.codeabbey;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection")
public class MostFrequentWord {

    private static final int WORD_LENGTH = 6;
    private static final int WORD_COUNT = 900_000;
    private static final String CONSONANTS = "bcdfghjklmnprstvwxz";
    private static final String VOWELS = "aeiou";


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int seed = input.nextInt();

        char[] chars = new char[WORD_LENGTH];
        String[] words = new String[WORD_COUNT];

        Map<String, Integer> data = new HashMap<>(WORD_COUNT / 2);

        for (int i = 0; i < WORD_COUNT; i++) {
            for (int j = 0; j < WORD_LENGTH; j++) {
                //Xnext = (A * Xcur + C) % M
                seed = (445 * seed + 700001) % 2097152;
                chars[j] = j % 2 == 0
                        ? CONSONANTS.charAt(seed % CONSONANTS.length())
                        : VOWELS.charAt(seed % VOWELS.length());
            }

            words[i] = String.valueOf(chars);

            Integer value = data.get(words[i]);
            value = value != null ? value : 0;
            value++;
            data.put(words[i], value);

        }

        Map.Entry<String, Integer> max = null;
        for (Map.Entry<String, Integer> entry : data.entrySet()) {
            if (max == null || entry.getValue() > max.getValue()) {
                max = entry;

            }
        }
        System.out.println(max.getKey());
    }


}
