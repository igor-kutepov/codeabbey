package com.kutepov.samples.codeabbey;

import java.util.Scanner;

public class DoubleDiceRoll {

    private static final int DICE_SIZE = 6;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lines = input.nextInt();

        for (; lines > 0; lines--) {
            int first = input.nextInt(), second = input.nextInt();

            int dice = (first % DICE_SIZE + 1) + (second % DICE_SIZE + 1);

            System.out.print(dice + " ");
        }
    }
}
