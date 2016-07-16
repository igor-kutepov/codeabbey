package com.kutepov.samples.codeabbey;

import java.util.Scanner;

public class FahrenheitToCelsius {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.nextInt();    //skip first

        double k = (212 - 32) / 100.0;

        StringBuilder sb = new StringBuilder();
        while (input.hasNextInt()) {
            int fahrenheit = input.nextInt();
            int celsius = (int) Math.round((fahrenheit - 32) / k);
            sb.append(celsius).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
