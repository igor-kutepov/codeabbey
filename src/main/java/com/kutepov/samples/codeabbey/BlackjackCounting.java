package com.kutepov.samples.codeabbey;

import java.util.Scanner;

public class BlackjackCounting {

    private static final int MAX_SUM = 21;
    private static final int ACE_MIN_VALUE = 1;
    private static final int ACE_MAX_VALUE = 11;
    private static final int OTHER_CARDS_VALUE = 10;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lines = input.nextInt();
        input.nextLine();

        for (; lines > 0; lines--) {
            String[] cards = input.nextLine().split(" ");
            int aces = 0, sum = 0;

            //calculate sum without aces
            for (int i = 0; i < cards.length; i++) {
                char ch = cards[i].charAt(0);
                if (Character.isDigit(ch)) {
                    sum += Character.digit(ch, 10);
                } else if (ch == 'A') {
                    aces++;
                } else {
                    sum += OTHER_CARDS_VALUE;
                }
            }

            if (sum <= MAX_SUM) {
                for (; aces > 0; aces--) {
                    sum += (sum + ACE_MAX_VALUE) <= MAX_SUM ? ACE_MAX_VALUE : ACE_MIN_VALUE;
                }
            }

            System.out.print(sum > MAX_SUM ? "Bust " : sum + " ");
        }
    }
}
