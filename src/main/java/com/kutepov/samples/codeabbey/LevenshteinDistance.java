package com.kutepov.samples.codeabbey;

import java.util.Scanner;

public class LevenshteinDistance {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lines = input.nextInt();
        input.nextLine();

        for (; lines > 0; lines--) {
            String[] words = input.nextLine().split(" ");

            int dist = distance(words[0], words[1]);

            System.out.print(dist + " ");
        }

    }

    //Levenshtein algorithm with two rows
    private static int distance(String a, String b) {
        if (a.equals(b))
            return 0;
        else if (a.length() == 0)
            return b.length();
        else if (b.length() == 0)
            return a.length();

        int[] previousRow = new int[b.length() + 1], currentRow = new int[b.length() + 1];

        //max(i,j), if min(i,j)=0 (only for first row i=0)
        for (int j = 0; j < previousRow.length; j++) {
            previousRow[j] = j;
        }

        for (int i = 0; i < a.length(); i++) {
            currentRow[0] = i + 1;
            //fill row by formula
            for (int j = 0; j < b.length(); j++) {
                int cost = a.charAt(i) == b.charAt(j) ? 0 : 1;
                currentRow[j + 1] = Math.min(
                        Math.min(currentRow[j] + 1, previousRow[j + 1] + 1),
                        previousRow[j] + cost
                );
            }

            //copy current row to previous
            System.arraycopy(currentRow, 0, previousRow, 0, previousRow.length);
        }

        return currentRow[b.length()];
    }

}
