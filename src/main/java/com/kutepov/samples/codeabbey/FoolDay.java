package com.kutepov.samples.codeabbey;

import java.util.Scanner;

public class FoolDay {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lines = input.nextInt();
        input.nextLine();

        for (; lines > 0; lines--) {
            String[] tokens = input.nextLine().split(" ");
            int sum = 0;
            for (String token : tokens) {
                sum += Math.pow(Integer.valueOf(token), 2);
            }
            System.out.print(sum + " ");
        }

    }
}
