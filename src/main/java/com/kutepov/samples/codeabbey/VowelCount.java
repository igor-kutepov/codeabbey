package com.kutepov.samples.codeabbey;

import java.util.Scanner;

/**
 * @author Igor Kutepov
 */
public class VowelCount {

    @SuppressWarnings("SpellCheckingInspection")
    private static final String VOWELS = "aouiey";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.nextLine();

        StringBuilder sb = new StringBuilder();
        while (input.hasNextLine()) {
            String line = input.nextLine();
            int chars = 0;
            for (char ch : line.toCharArray()) {
                chars += VOWELS.indexOf(ch) > -1 ? 1 : 0;
            }

            sb.append(chars).append(' ');
        }

        System.out.println(sb.toString().trim());
    }
}
