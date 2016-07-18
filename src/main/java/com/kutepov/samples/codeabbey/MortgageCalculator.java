package com.kutepov.samples.codeabbey;

import java.math.BigDecimal;
import java.util.Scanner;

public class MortgageCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double loan = input.nextDouble(), interest = (input.nextDouble() / 100), months = input.nextDouble();

        // m = p * (1 + r / 12) ^ n * (1 + r / 12 - 1) / ((1 + r / 12) ^ n - 1)
        //where m - payment per month, p - loan sum at start, r - interest rate and n - time to pay in months
        double k = (1 + interest / 12);
        double payment = loan * Math.pow(k, months) * (k - 1) / (Math.pow(k, months) - 1);

        BigDecimal value = BigDecimal.valueOf(payment).setScale(0, BigDecimal.ROUND_UP);

        System.out.println(value);

    }
}
