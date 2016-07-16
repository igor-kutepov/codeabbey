package com.kutepov.samples.codeabbey;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Igor Kutepov
 */
public class WeightedSumOfDigits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int values = input.nextInt();

        StringBuilder sb = new StringBuilder();
        for (; values > 0; values--) {
            int number = input.nextInt();

            List<Integer> digits = new ArrayList<>();
            do {
                digits.add(number % 10);
            } while ((number /= 10) > 0);

            int sumOfDigits = 0;
            for (int i = 0; i < digits.size(); i++) {
                sumOfDigits += digits.get(i) * (digits.size() - i);
            }

            sb.append(sumOfDigits).append(' ');
        }

        System.out.println(sb.toString().trim());
    }
}
