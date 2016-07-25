package com.kutepov.samples.codeabbey;

import java.util.Arrays;
import java.util.Scanner;

public class CaesarCipherCracker {

    private static final int LETTERS = 26;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lines = input.nextInt();
        input.nextLine();

        double[] frequencies = {8.1, 1.5, 2.8, 4.3, 13.0, 2.2, 2.0, 6.1, 7.0, 0.15, 0.77, 7.0, 2.4,
                6.8, 7.5, 1.9, 0.095, 6.0, 6.3, 9.1, 2.8, 0.98, 2.4, 0.15, 2.0, 0.074};
        int startCode = Character.codePointAt("A", 0);


        for (; lines > 0; lines--) {
            char[] line = input.nextLine().toCharArray();
            double[] freq = new double[LETTERS];
            double minDiff = Double.POSITIVE_INFINITY;

            int decodeShift = 0, lastIndex = 0;
            for (int shift = 0; shift < LETTERS; shift++) {


                Arrays.fill(freq, 0);
                int count = 0, spaces = 0;
                for (int i = 0; i < line.length; i++) {
                    char ch = line[i];
                    if (Character.isLetter(ch)) {
                        int idx = ch - startCode;
                        freq[idx]++;
                        count++;
                    } else {
                        spaces++;
                        //needs only first three words
                        if (spaces == 3) {
                            lastIndex = i;
                        }
                    }
                }

                int letters = 0;
                double avgDiff = 0.0;
                //calculate average of squares of differences
                for (int i = 0; i < freq.length; i++) {
                    if (freq[i] != 0) {
                        freq[i] = (freq[i] / count) * 100;
                        avgDiff = (avgDiff * letters + Math.pow(freq[i] - frequencies[i], 2)) / (letters + 1);
                        letters++;
                    }
                }

                //remembers a possible decoding cipher key
                if (avgDiff < minDiff) {
                    minDiff = avgDiff;
                    decodeShift = shift;
                }

                //shift current chars by 1
                for (int i = 0; i < line.length; i++) {
                    if (Character.isLetter(line[i])) {
                        line[i] = (char) ((line[i] + 1 + startCode) % LETTERS + startCode);
                    }
                }

            }

            //decode line
            for (int i = 0; i < line.length; i++) {
                if (Character.isLetter(line[i])) {
                    line[i] = (char) ((line[i] + decodeShift + startCode) % LETTERS + startCode);
                }
            }

            int encodeShift = LETTERS - decodeShift;

            System.out.print(String.valueOf(line, 0, lastIndex) + " " + encodeShift + " ");

        }

    }
}
