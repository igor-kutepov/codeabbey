package com.kutepov.samples.codeabbey;

import java.util.Scanner;

public class GameOf2048 {

    private static final int MAP_SIZE = 4;
    private static final int MAX_NUMBERS = 6;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //fill map
        int[][] map = new int[MAP_SIZE][MAP_SIZE];
        for (int i = 0; i < MAP_SIZE; i++) {
            for (int j = 0; j < MAP_SIZE; j++) {
                map[i][j] = input.nextInt();
            }
        }
        input.nextLine();
        String[] moves = input.nextLine().split(" ");

        //apply moves
        for (String move : moves) {
            switch (move) {
                case "D":
                    transpose(map);
                    slideToRight(map);
                    transpose(map);
                    break;
                case "U":
                    transpose(map);
                    slideToLeft(map);
                    transpose(map);
                    break;
                case "R":
                    slideToRight(map);
                    break;
                case "L":
                    slideToLeft(map);
                    break;
            }
        }

        //calculate numbers
        int[] counts = new int[MAX_NUMBERS];
        for (int i = 0; i < MAP_SIZE; i++) {
            for (int j = 0; j < MAP_SIZE; j++) {
                int value = map[i][j];
                if (value > 0) {
                    int idx = (int) (Math.round(Math.log(value) / Math.log(2)) - 1);
                    counts[idx]++;
                }
            }
        }

        //without zeros tail
        int lastIdx = 0;
        for (int i = counts.length - 1; i >= 0; i--) {
            if (counts[i] > 0) {
                lastIdx = i;
                break;
            }

        }
        for (int i = 0; i <= lastIdx; i++) {
            System.out.print(counts[i] + " ");
        }

    }

    private static void transpose(int[][] matrix) {
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    private static void slideToLeft(int[][] map) {
        for (int[] line : map) {
            slideToLeft(line);
        }
    }

    private static void slideToLeft(int[] line) {
        for (int i = 0; i < line.length; i++) {
            if (line[i] > 0) {
                rotate(line, i);
                break;
            }
        }
        for (int i = 0; i < line.length - 1; i++) {
            if (line[i] > 0 && line[i] == line[i + 1]) {
                line[i] *= 2;
                System.arraycopy(line, i + 1 + 1, line, i + 1, line.length - 1 - (i + 1));
                line[line.length - 1] = 0;
            }
        }
    }

    private static void slideToRight(int[][] map) {
        for (int[] line : map) {
            slideToRight(line);
        }
    }

    private static void slideToRight(int[] line) {
        for (int i = line.length - 1; i >= 0; i--) {
            if (line[i] > 0) {
                rotate(line, -(line.length - 1 - i));
                break;
            }
        }

        for (int i = line.length - 1; i > 0; i--) {
            if (line[i] > 0 && line[i] == line[i - 1]) {
                line[i] *= 2;
                System.arraycopy(line, 0, line, 1, i - 1);
                line[0] = 0;
            }
        }
    }

    private static void rotate(int[] array, int count) {
        boolean leftToRight = count > 0; //rotate direction
        count = Math.abs(count);
        //on first pass revert all chars
        reverse(array, 0, array.length);
        //divide an array on two parts and revert each part independently from other
        int leftLength = leftToRight ? array.length - count : count;
        int rightLength = leftToRight ? count : array.length - count;
        //revert left part
        reverse(array, 0, leftLength);
        //revert right part
        reverse(array, leftLength, rightLength);

    }

    private static void reverse(int[] array, int from, int length) {
        for (int i = 0; i < length / 2; i++) {
            int temp = array[from + i];
            array[from + i] = array[from + length - 1 - i];
            array[from + length - 1 - i] = temp;
        }
    }

}
