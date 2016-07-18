package com.kutepov.samples.codeabbey;

import java.util.Arrays;
import java.util.Scanner;

public class CodeGuesser {

    private static final int DIGITS = 4;

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
        Arrays.fill(digits, -1);

        int found = 0; //counter of found digits
        do {
            for (int i = 0; i < DIGITS; i++) {
                for (int j = 0; j < guesses; j++) {
                    if (guessed[j] == 0) {
                        int value = matrix[i][j];
                        if (value > 0) {
                            for (int k = 0; k < guesses; k++) {
                                if (value == matrix[i][k] && k != j) {
                                    matrix[i][j] = matrix[i][k] = -1;
                                }
                            }
                        }
                    }
                }
            }

            for (int i = 0; i < DIGITS; i++) {
                if (digits[i] < 0) { //digit not yet found
                    if ((DIGITS - found) == 1) { //last digit remained
                        for (int j = 0; j < guesses; j++) {
                            if (guessed[j] > 0) {
                                digits[i] = matrix[i][j];

                                guessed[j]--;
                                found++;
                                break;
                            }
                        }
                    } else {
                        int[] pair = new int[2];
                        if (findPair(matrix[i], guessed, pair)) {
                            //use digit from first index of pair
                            int digit = matrix[i][pair[0]];

                            boolean single = false;
                            for (int j = 0; j < DIGITS; j++) {
//                                product * = matrix[j][pair[0]]
                            }

                            //checking digit that it has no duplicates among not guessed numbers
                            for (int j = 0; j < guesses; j++) {
//                                if (j != pair[0] && digit == matrix[i][j] && guessed[j] <= 0) {
//                                    //cleanup this pair
//                                    matrix[i][pair[0]] = -1;
//                                    matrix[i][pair[1]] = -1;
//                                    digit = -1;
//                                    break;
//                                } else
                                if (j != pair[0] && j != pair[1] && guessed[j] > 0 && digit == matrix[i][j]) {
                                    digit = -1;
                                    break;
                                }
                            }

                            if (digit >= 0) {
                                digits[i] = digit;
                                guessed[pair[0]]--;
                                guessed[pair[1]]--;
                                found++;
                            }
                        }
                    }

                }
            }

        } while (found < DIGITS);

        for (int digit : digits)
            System.out.print(digit);
    }

    private static boolean findPair(int[] array, int[] guessed, int[] pair) {
        boolean[] duplicates = new boolean[10];
        for (int i = 0; i < array.length; i++) {
            if (guessed[i] <= 0 || array[i] < 0)
                continue;
            if (!(duplicates[array[i]] ^= true)) {
                //found duplicate and remember second index to pair
                pair[1] = i;
                int duplicateDigit = array[i];
                //search previous entry the digit
                for (int j = i - 1; j >= 0; j--) {
                    if (array[j] == duplicateDigit) {
                        pair[0] = j;
                        return true;
                    }
                }
            }
        }

        return false;
    }

}
