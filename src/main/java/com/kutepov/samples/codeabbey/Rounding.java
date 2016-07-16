package com.kutepov.samples.codeabbey;

import java.util.Scanner;

public class Rounding {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.nextLine(); //skip first line
        StringBuilder sb = new StringBuilder();
        while (input.hasNextLine()) {
            String[] tokens = input.nextLine().split(" ");
            float first = Float.valueOf(tokens[0]), second = Float.valueOf(tokens[1]);

            int result = Math.round(first / second);

            sb.append(result).append(" ");
        }
        System.out.println(sb.toString().trim());

    }
}
