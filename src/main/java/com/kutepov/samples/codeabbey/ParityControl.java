package com.kutepov.samples.codeabbey;

import java.util.Scanner;

public class ParityControl {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();
        while (input.hasNextInt()) {
            int ch = input.nextInt();
            int mask = 128; //0b10000000
            if (numberOfSetBits(ch) % 2 > 0) {    //corrupted byte
                continue;
            }
            ch %= mask;
            sb.append((char) ch);
        }

        System.out.println(sb.toString());
    }

    private static int numberOfSetBits(int value) {
        int bits = 0;
        while (value > 0) {
            if (value % 2 > 0)
                bits++;
            value >>= 1;
        }
        return bits;
    }
}
