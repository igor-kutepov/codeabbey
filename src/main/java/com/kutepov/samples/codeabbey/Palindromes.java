package com.kutepov.samples.codeabbey;

import java.util.Scanner;

public class Palindromes {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lines = input.nextInt();
        input.nextLine();

        for (; lines > 0; lines--) {
            String line = input.nextLine();
            //to lower case and remove all non alphabetic characters
            line = line.replaceAll("[^\\p{Alpha}]*", "").toLowerCase();
            //reverse string
            char[] chars = line.toCharArray();
            for (int i = 0; i < chars.length / 2; i++) {
                char tmp = chars[i];
                chars[i] = chars[chars.length - 1 - i];
                chars[chars.length - 1 - i] = tmp;
            }
            String revert = String.valueOf(chars);

            System.out.print(revert.equals(line) ? "Y " : "N ");
        }
    }
}
