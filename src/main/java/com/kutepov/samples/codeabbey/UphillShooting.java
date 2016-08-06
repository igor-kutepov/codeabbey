package com.kutepov.samples.codeabbey;

import java.util.Scanner;

import static java.lang.Math.*;

public class UphillShooting {

    private static final double G = 9.81;
    private static final int SLOPES_COUNT = 40;
    private static final int SLOPE_SIZE = 4;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] slopes = new int[SLOPES_COUNT];
        for (int i = 0; i < 3; i++) {   //blocks
            for (int j = 0; j < SLOPES_COUNT; j++) {
                slopes[j] = input.nextInt();
            }
            for (int j = 0; j < 3; j++) {   //shots
                int velocity = input.nextInt(), angle = input.nextInt();
                double rad = toRadians(angle), x = 0, y;
                //test each slope by intersection with a shot
                for (int k = 1; k < SLOPES_COUNT; k++) {
                    //try find intersection with left slope side
                    x = k * SLOPE_SIZE;
                    y = -(G * x * x) / (2 * velocity * velocity * pow(cos(rad), 2))
                            + tan(rad) * x;

                    if ((slopes[k - 1] * SLOPE_SIZE <= y) && (y <= slopes[k] * SLOPE_SIZE)) {
                        //found a intersection point;
                        break;
                    }

                    //try find intersection with upper slope side
                    y = slopes[k] * SLOPE_SIZE;
                    x = velocity * cos(rad) * (cos(rad) * sqrt(pow(velocity, 2) * pow(tan(rad), 2) - 2 * G * y * pow(1 / cos(rad), 2)) + velocity * sin(rad)) / G;

                    if (k * SLOPE_SIZE <= x && x <= (k + 1) * SLOPE_SIZE) {
                        //found a intersection point;
                        break;
                    }

                }

                int dist = (int) x;
                System.out.print(dist + " ");

            }
        }
    }
}
