package com.kutepov.samples.codeabbey;

import java.util.Scanner;

public class BitCount {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numbers = input.nextInt();
        for (; numbers > 0; numbers--) {
            int number = input.nextInt();

            int counter = 0;
            do {
                counter += number & 1;
                number >>>= 1;

            } while (number > 0);

            System.out.print(counter + " ");
        }
    }
}
