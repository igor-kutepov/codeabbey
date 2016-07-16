package com.kutepov.samples.codeabbey;

import java.util.Scanner;

public class ArithmeticProgression {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.nextLine(); //skip first line

        StringBuilder sb = new StringBuilder();
        while (input.hasNextLine()) {
            String[] tokens = input.nextLine().split(" ");
            int first = Integer.valueOf(tokens[0]), step = Integer.valueOf(tokens[1]), count = Integer.valueOf(tokens[2]);
            int last = first + (count - 1) * step;
            int sum = (first + last) * count / 2;

            sb.append(sum).append(' ');
        }

        System.out.println(sb.toString().trim());
    }
}
