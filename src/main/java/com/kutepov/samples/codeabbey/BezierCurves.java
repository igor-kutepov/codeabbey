package com.kutepov.samples.codeabbey;

import java.util.Scanner;

public class BezierCurves {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lines = input.nextInt(), steps = input.nextInt();

        double[][] points = new double[lines][2];

        for (int i = 0; i < points.length; i++) {
            points[i] = new double[]{input.nextInt(), input.nextInt()};
        }

        double part = 1 / (double) (steps - 1);
        double[][] result = new double[steps][2];

        result[steps - 1] = points[points.length - 1];
        for (int i = 0; i < steps - 1; i++) {
            double offset = i * part;
            result[i] = findBezierPoint(points, offset);
        }

        for (int i = 0; i < steps; i++) {
            int x = (int) Math.round(result[i][0]);
            int y = (int) Math.round(result[i][1]);

            System.out.print(x + " " + y + " ");
        }

    }


    private static double[] findPointInSegment(double[] a, double[] b, double part) {
        part = part / (1 - part);
        double x = ((a[0] + part * b[0]) / (1 + part));
        double y = ((a[1] + part * b[1]) / (1 + part));

        return new double[]{x, y};
    }

    private static double[] findBezierPoint(double[][] points, double part) {
        if (points.length == 1) {
            return points[0];
        }
        double[][] result = new double[points.length - 1][2];
        for (int i = 0; i < points.length - 1; i++) {
            result[i] = findPointInSegment(points[i], points[i + 1], part);
        }

        return findBezierPoint(result, part);
    }
}

