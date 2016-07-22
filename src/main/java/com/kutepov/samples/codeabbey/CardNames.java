package com.kutepov.samples.codeabbey;

import java.util.Scanner;

public class CardNames {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size = input.nextInt();
        String[] suits = {"Clubs", "Spades", "Diamonds", "Hearts"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        for (; size > 0; size--) {
            int card = input.nextInt(); //0..51

            int suit = card / ranks.length;
            int rank = card % ranks.length;

            String name = ranks[rank] + "-of-" + suits[suit];

            System.out.print(name + " ");
        }
    }
}
