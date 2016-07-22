package com.kutepov.samples.codeabbey;

import java.util.Scanner;

public class BullsAndCows {

    private static final int DIGIT_COUNT = 4;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int secret = input.nextInt(), attempts = input.nextInt();
        int[] digits = toDigits(secret);

        for (; attempts > 0; attempts--) {
            int attempt = input.nextInt(), bulls = 0, cows = 0;
            int[] attemptDigits = toDigits(attempt);
            for (int i = 0; i < DIGIT_COUNT; i++) {
                if (attemptDigits[i] == digits[i]) {
                    bulls++;
                } else {
                    for (int j = 0; j < DIGIT_COUNT; j++) {
                        if (attemptDigits[i] == digits[j] && i != j) {
                            cows++;
                        }
                    }
                }
            }

            System.out.print(bulls + "-" + cows + " ");
        }
    }

    private static int[] toDigits(int value) {
        int[] result = new int[DIGIT_COUNT];
        for (int i = 0; i < DIGIT_COUNT; i++) {
            result[i] = value % 10;
            value /= 10;
        }
        return result;
    }
}
