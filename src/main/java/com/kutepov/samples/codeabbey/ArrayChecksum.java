package com.kutepov.samples.codeabbey;

import java.util.Scanner;

/**
 * @author Igor Kutepov
 */
public class ArrayChecksum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size = input.nextInt();
        int seed = 113;
        int div = 10000007;
        long result = 0;

        for (int i = 0; i < size; i++) {
            int element = input.nextInt();
            result = ((result + element) * seed) % div;
        }

        System.out.println(result);

    }
}
