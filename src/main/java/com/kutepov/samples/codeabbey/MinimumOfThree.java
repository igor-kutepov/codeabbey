package com.kutepov.samples.codeabbey;

import java.util.Scanner;

public class MinimumOfThree {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.nextLine();   //skip first line
        StringBuilder sb = new StringBuilder();
        while (input.hasNextLine()) {
            String[] tokens = input.nextLine().split(" ");
            int first = Integer.valueOf(tokens[0]),
                    second = Integer.valueOf(tokens[1]),
                    third = Integer.valueOf(tokens[2]);
            sb.append(Math.min(Math.min(first, second), third)).append(" ");
        }
        String result = sb.toString().trim();
        System.out.println(result);

    }
}
