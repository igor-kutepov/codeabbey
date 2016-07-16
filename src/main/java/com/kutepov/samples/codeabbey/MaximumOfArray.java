package com.kutepov.samples.codeabbey;

import java.util.Scanner;

public class MaximumOfArray {

    private static final int ARRAY_SIZE = 300;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[ARRAY_SIZE];
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        //fill array
        for (int i = 0; i < array.length; i++) {
            if (!input.hasNextInt())
                break;
            array[i] = input.nextInt();
            if (max < array[i])
                max = array[i];
            if (min > array[i])
                min = array[i];
        }

        System.out.println(max + " " + min);
    }
}
