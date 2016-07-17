package com.kutepov.samples.codeabbey;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        int lines = input.nextInt();

        for (; lines > 0; lines--) {
            double a = input.nextDouble(), b = input.nextDouble(), c = input.nextDouble(), d = input.nextDouble(),
                    min = 0, max = 100, precision = 1e-7;
            //A * x + B * sqrt(x ^ 3) - C * exp(-x / 50) - D = 0
            //0 <= x <= 100
            double result = search(a, b, c, d, min, max, precision);
            //round to precision
            result = BigDecimal.valueOf(result).setScale(7, BigDecimal.ROUND_HALF_UP).doubleValue();
            System.out.print(result + " ");
        }

    }

    private static double search(double a, double b, double c, double d, double min, double max, double precision) {
        double middle = (max + min) / 2;
        double result = equation(a, b, c, middle);

        if (result == d || Math.abs(result - d) <= precision) {
            return middle;
        } else if (result > d) {
            max = middle;
        } else if (result < d) {
            min = middle;
        }

        return search(a, b, c, d, min, max, precision);
    }

    private static double equation(double a, double b, double c, double x) {
        return a * x + b * Math.sqrt(Math.pow(x, 3)) - c * Math.exp(-x / 50);
    }
}
