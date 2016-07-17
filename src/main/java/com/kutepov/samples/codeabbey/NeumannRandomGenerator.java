package com.kutepov.samples.codeabbey;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Igor Kutepov
 */
public class NeumannRandomGenerator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = input.nextInt();

        Set<Integer> sequence = new HashSet<>();
        for (; count > 0; count--) {
            int start = input.nextInt();
            sequence.clear();

            while (sequence.add(start)) {
                start = ((int) Math.pow(start, 2) / 100) % 10000;
            }

            System.out.print(sequence.size() + " ");
        }

    }
}
