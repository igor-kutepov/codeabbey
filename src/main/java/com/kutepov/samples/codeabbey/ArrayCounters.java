package com.kutepov.samples.codeabbey;

import java.util.Scanner;

/**
 * @author Igor Kutepov
 */
public class ArrayCounters {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.nextInt();
        int limit = input.nextInt();
        int[] counters = new int[limit];

        while (input.hasNextInt()) {
            int number = input.nextInt();
            counters[number - 1]++;
        }
        for (int counter : counters) {
            System.out.print(counter + " ");
        }

    }
}
