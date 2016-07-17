package com.kutepov.samples.codeabbey;

import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size = input.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        int swaps, total = 0, pass = 0;
        do {
            swaps = 0;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swaps++;
                }
            }
            total += swaps;
            pass++;

        } while (swaps > 0);

        System.out.println(pass + " " + total);
    }
}
