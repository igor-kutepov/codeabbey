package com.kutepov.samples.codeabbey;

import java.util.Scanner;

public class PythagoreanTheorem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lines = input.nextInt();

        for (; lines > 0; lines--) {
            int a = input.nextInt(), b = input.nextInt(), c = input.nextInt();

            int hyp = (int) Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
            if (hyp == c) {
                System.out.print("R ");
            } else if (hyp < c) {
                System.out.print("O ");
            } else {
                System.out.print("A ");
            }

        }
    }
}
