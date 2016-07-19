package com.kutepov.samples.codeabbey;

import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lines = input.nextInt();
        input.nextLine();

        for (; lines > 0; lines--) {
            String[] rounds = input.nextLine().split(" ");
            int winner = 0;
            for (String round : rounds) {
                winner += findWinner(round.charAt(0), round.charAt(1));
            }

            System.out.print((winner > 0 ? 1 : 2) + " ");
        }
    }


    private static int findWinner(char first, char second) {
        String rules = "RSP";
        if (first == second)
            return 0;//draw
        if ((first == 'R' && second == 'S') || (first == 'S' && second == 'P') || (first == 'P' && second == 'R')) {
            return 1;   //first wins
        } else {
            return -1;  //second wins
        }
    }

}
