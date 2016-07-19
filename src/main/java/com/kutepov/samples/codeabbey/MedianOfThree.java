package com.kutepov.samples.codeabbey;

import java.util.Scanner;

public class MedianOfThree {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lines = input.nextInt();

        for (; lines > 0; lines--) {
            int a = input.nextInt(), b = input.nextInt(), c = input.nextInt();
            int temp;
            if (a > b) {
                temp = a;
                a = b;
                b = temp;
            }
            if (b > c) {
                b = c;
            }
            if (a > b) {
                b = a;
            }

            System.out.print(b + " ");
        }
    }

}
