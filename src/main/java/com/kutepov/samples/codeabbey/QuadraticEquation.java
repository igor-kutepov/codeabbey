package com.kutepov.samples.codeabbey;

import java.util.Scanner;

public class QuadraticEquation {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lines = input.nextInt();

        StringBuilder sb = new StringBuilder();
        for (; lines > 0; lines--) {
            double a = input.nextInt(), b = input.nextInt(), c = input.nextInt();
            double D = b * b - 4 * a * c;

            if (D >= 0) { //roots are real numbers
                int x1 = (int) ((-b + Math.sqrt(D)) / (2 * a));
                int x2 = (int) ((-b - Math.sqrt(D)) / (2 * a));

                sb.append(x1).append(' ').append(x2).append("; ");
            } else {
                int r = (int) (-b / (2 * a)); //real part
                int i = (int) (Math.sqrt(Math.abs(D)) / (2 * a)); //imaginary part

                sb.append(String.format("%1$d+%2$di %1$d-%2$di; ", r, i));
            }
        }

        System.out.println(sb.delete(sb.length() - 2, sb.length()).toString());
    }
}
