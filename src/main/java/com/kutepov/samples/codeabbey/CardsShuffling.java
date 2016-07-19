package com.kutepov.samples.codeabbey;

import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection")
public class CardsShuffling {


    private static final String RANKS = "A23456789TJQK";
    private static final String SUITS = "CDHS";
    private static final int DECK_SIZE = 52;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //fill deck
        String[] deck = new String[DECK_SIZE];
        for (int i = 0; i < SUITS.length(); i++) {
            for (int j = 0; j < RANKS.length(); j++) {
                deck[j + RANKS.length() * i] = String.valueOf(new char[]{SUITS.charAt(i), RANKS.charAt(j)});
            }
        }

        //shuffle deck
        for (int i = 0; i < DECK_SIZE; i++) {
            int moveTo = input.nextInt() % DECK_SIZE;
            String tmp = deck[i];
            deck[i] = deck[moveTo];
            deck[moveTo] = tmp;
        }

        for (String card : deck)
            System.out.print(card + " ");
    }
}
