package com.kutepov.samples.codeabbey;

import java.util.Scanner;

public class CaesarShiftCipher {

    private static final int LETTERS = 26;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lines = input.nextInt(), shift = input.nextInt();
        input.nextLine();

        int startCode = Character.codePointAt("A", 0);
        int decodeShift = LETTERS - shift;

        for (; lines > 0; lines--) {
            String line = input.nextLine();
            char[] chars = line.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (Character.isLetter(chars[i])) {
                    chars[i] = (char) ((chars[i] + decodeShift + startCode) % LETTERS + startCode);
                }
            }

            System.out.print(String.valueOf(chars) + " ");
        }
    }
}
