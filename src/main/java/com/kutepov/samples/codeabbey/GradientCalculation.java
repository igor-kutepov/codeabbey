package com.kutepov.samples.codeabbey;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.Math.*;

public class GradientCalculation {

    private static final double DELTA = 1e-9;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        int count = input.nextInt();
        double a = input.nextDouble(), b = input.nextDouble(), c = input.nextDouble();

        for (; count > 0; count--) {
            double x = input.nextDouble(), y = input.nextDouble(),
                    xg = x + DELTA, yg = y + DELTA;

            double f0 = f(x, y, a, b, c);
            double fx = f(xg, y, a, b, c);
            double fy = f(x, yg, a, b, c);

            //gradient in (x,y)
            double[] gradient = new double[]{(fx - f0) / DELTA, (fy - f0) / DELTA};

            int angle = (int) round(180 + toDegrees(atan2(gradient[1], gradient[0])));

            System.out.print(angle + " ");
        }
    }

    //f = f(x, y) = (x - A)^2 + (y - B)^2 + C * exp(- (x + A)^2 - (y + B)^2)
    private static double f(double x, double y, double a, double b, double c) {
        return pow(x - a, 2) + pow(y - b, 2) + c * exp(-pow(x + a, 2) - pow(y + b, 2));
    }
}
