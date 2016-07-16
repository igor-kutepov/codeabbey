package com.kutepov.samples.codeabbey;

import java.util.Scanner;

/**
 * @author Igor Kutepov
 */
public class AverageOfArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.nextLine();

        StringBuilder sb = new StringBuilder();
        while (input.hasNextLine()) {
            String line = input.nextLine();
            line = line.substring(0, line.length() - 2);
            String[] tokens = line.split(" ");

            int sum = 0;
            for (String token : tokens) {
                sum += Integer.valueOf(token);
            }
            int avg = Math.round(sum / (float) tokens.length);

            sb.append(avg).append(' ');
        }

        System.out.println(sb.toString().trim());
    }
}
