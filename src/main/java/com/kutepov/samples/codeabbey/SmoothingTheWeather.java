package com.kutepov.samples.codeabbey;

import java.util.Locale;
import java.util.Scanner;

public class SmoothingTheWeather {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        int size = input.nextInt();

        double[] data = new double[size], result = new double[size];
        for (int i = 0; i < size; i++) {
            data[i] = input.nextDouble();
        }
        result[0] = data[0];
        result[size - 1] = data[size - 1];

        for (int i = 1; i < size - 1; i++) {
            result[i] = (data[i - 1] + data[i] + data[i + 1]) / 3;
        }

        for (double value : result)
            System.out.print(value + " ");

    }
}
