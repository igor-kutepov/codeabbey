package com.kutepov.samples.codeabbey;

import java.util.Scanner;

/**
 * @author Igor Kutepov
 */
public class BubbleInArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //build array
        String[] tokens = input.nextLine().split(" ");
        int[] array = new int[tokens.length - 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.valueOf(tokens[i]);
        }

        //sort array (single pass)
        int swaps = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                int swap = array[i];
                array[i] = array[i + 1];
                array[i + 1] = swap;
                swaps++;
            }
        }

        int checksum = checksum(array);

        System.out.println(swaps + " " + checksum);
    }

    private static int checksum(int[] array) {
        int seed = 113, div = 10000007, result = 0;

        for (int value : array) {
            result = ((result + value) * seed) % div;
        }

        return result;
    }
}
