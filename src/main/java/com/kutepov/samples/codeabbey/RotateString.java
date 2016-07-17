package com.kutepov.samples.codeabbey;

import java.util.Scanner;

public class RotateString {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lines = input.nextInt();

        for (; lines > 0; lines--) {
            int count = input.nextInt();
            String line = input.nextLine().trim();
            char[] chars = line.toCharArray();

            boolean leftToRight = count > 0; //rotate direction
            count = Math.abs(count);

            //on first pass revert all chars
            reverse(chars, 0, chars.length);

            //divide an array on two parts and revert each part independently from other
            int leftLength = leftToRight ? chars.length - count : count;
            int rightLength = leftToRight ? count : chars.length - count;

            //revert left part
            reverse(chars, 0, leftLength);

            //revert right part
            reverse(chars, leftLength, rightLength);

            System.out.print(String.valueOf(chars) + " ");
        }
    }


    private static void reverse(char[] chars, int from, int length) {
        for (int i = 0; i < length / 2; i++) {
            char temp = chars[from + i];
            chars[from + i] = chars[from + length - 1 - i];
            chars[from + length - 1 - i] = temp;
        }
    }
}
