package com.kutepov.samples.codeabbey;

import java.util.Scanner;

public class Triangles {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.nextLine(); //skip line

        StringBuilder sb = new StringBuilder();
        while (input.hasNextLine()) {
            String[] tokens = input.nextLine().split(" ");
            int first = Integer.valueOf(tokens[0]), second = Integer.valueOf(tokens[1]), third = Integer.valueOf(tokens[2]);
            int result = (first + second) >= third && (first + third) >= second && (second + third) >= first ? 1 : 0;

            sb.append(result).append(' ');
        }
        System.out.println(sb.toString().trim());
    }
}
