package com.kutepov.samples.codeabbey;

import java.util.Arrays;
import java.util.Scanner;

public class RotationIn2DSpace {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lines = input.nextInt(), rotation = input.nextInt();
        input.nextLine();

        double angle = Math.toRadians(rotation);
        Star[] stars = new Star[lines];
        for (int i = 0; i < lines; i++) {
            String[] tokens = input.nextLine().split(" ");

            int x = Integer.valueOf(tokens[1]), y = Integer.valueOf(tokens[2]);

            int xn = (int) Math.round(x * Math.cos(angle) - y * Math.sin(angle));
            int yn = (int) Math.round(x * Math.sin(angle) + y * Math.cos(angle));

            stars[i] = new Star(xn, yn, tokens[0]);
        }

        Arrays.sort(stars);
        for (Star star : stars) {
            System.out.print(star.getName() + " ");
        }

    }


    private static class Star implements Comparable<Star> {
        private int x;
        private int y;
        private String name;

        Star(int x, int y, String name) {
            this.x = x;
            this.y = y;
            this.name = name;
        }

        String getName() {
            return name;
        }

        @Override
        public int compareTo(Star o) {
            int result = Integer.valueOf(y).compareTo(o.y);
            if (result == 0)
                result = Integer.valueOf(x).compareTo(o.x);
            return result;
        }

    }
}
