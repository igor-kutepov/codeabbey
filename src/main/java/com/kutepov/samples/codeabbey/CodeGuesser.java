package com.kutepov.samples.codeabbey;

import java.util.Arrays;
import java.util.Scanner;

public class CodeGuesser {

    private static final int DIGITS = 4;
    private static final int EMPTY_DIGIT = -1;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int guesses = input.nextInt();

        //build matrix with digits of numbers
        int[][] matrix = new int[DIGITS][guesses];
        //guessed amounts of digits
        int[] guessed = new int[guesses];
        for (int i = 0; i < guesses; i++) {
            int guess = input.nextInt(), correct = input.nextInt();
            guessed[i] = correct;
            for (int j = 1; j <= DIGITS; j++) {
                matrix[DIGITS - j][i] = guess % 10;
                guess /= 10;
            }
        }

        int[] digits = new int[DIGITS]; //holds correct digits
        Arrays.fill(digits, EMPTY_DIGIT);
        //holds already used digits for each digit position in the number
        boolean[][] usedDigits = new boolean[DIGITS][10];

        //sets non-significant digits as -1 and save them in usedDigits
        for (int i = 0; i < DIGITS; i++) {
            for (int j = 0; j < guesses; j++) {
                if (guessed[j] == 0) {
                    int value = matrix[i][j];
                    if (value >= 0) {
                        for (int k = 0; k < guesses; k++) {
                            if (value == matrix[i][k] && k != j) {
                                matrix[i][j] = matrix[i][k] = EMPTY_DIGIT;
                            }
                        }

                        matrix[i][j] = EMPTY_DIGIT;
                        usedDigits[i][value] = true;
                    }
                }
            }
        }

        int found = 0; //counter of found digits
        do {
            //if number guessed digits equals number of nonempty digits then desired digits was found
            for (int i = 0; i < guesses; i++) {
                if (guessed[i] > 0) {
                    int foundDigits = 0;
                    for (int j = 0; j < DIGITS; j++) {
                        if (matrix[j][i] != EMPTY_DIGIT) {
                            foundDigits++;
                        }
                    }

                    if (foundDigits == guessed[i]) {
                        for (int j = 0; j < DIGITS; j++) {
                            int value = matrix[j][i];
                            if (value != EMPTY_DIGIT) {
                                digits[j] = value;
                                found++;
                                //cleanup all digits with same value and position in numbers
                                for (int k = 0; k < guesses; k++) {
                                    if (matrix[j][k] == value && guessed[k] > 0) {
                                        guessed[k]--;
                                    }
                                    matrix[j][k] = EMPTY_DIGIT;
                                }
                            }
                        }
                    }
                }
            }

            //use substitution of not yet used digits on empty the number positions
            for (int i = 0; i < DIGITS; i++) {
                if (digits[i] < 0) { //digit not yet found
                    int digit = EMPTY_DIGIT;
                    for (int j = 0; j < usedDigits[i].length; j++) {
                        if (!usedDigits[i][j]) {
                            if (digit == EMPTY_DIGIT) {
                                digit = j;
                            } else {    //skip if more than one not used digits
                                digit = EMPTY_DIGIT;
                                break;
                            }
                        }
                    }
                    if (digit != EMPTY_DIGIT) {
                        digits[i] = digit;
                        found++;
                    }
                }
            }

        } while (found < DIGITS);

        for (int digit : digits)
            System.out.print(digit);
    }


}
