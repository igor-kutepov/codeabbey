package com.kutepov.samples.codeabbey;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class RandomSearchOptimization {

    private static final int SPEEDS = 5;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        int attempts = input.nextInt();
        double[] driverSpeed = new double[SPEEDS];
        for (int i = 0; i < driverSpeed.length; i++) {
            driverSpeed[i] = input.nextInt();
        }

        //initial time
        double time = calculateTime(driverSpeed);

        for (; attempts > 0; attempts--) {
            int index = input.nextInt();
            double change = input.nextDouble();

            //apply a change to the speeds
            double[] test = Arrays.copyOf(driverSpeed, driverSpeed.length);
            test[index] += change;

            if (validateSpeeds(test)) {     //check the speed change rules
                double result = calculateTime(test);
                if (result < time) {    //found new result
                    time = result;
                    driverSpeed = test;
                }
            }
        }

        //print speeds
        for (double speed : driverSpeed) {
            double value = BigDecimal.valueOf(speed).setScale(7, BigDecimal.ROUND_HALF_UP).doubleValue();
            System.out.print(value + " ");
        }

        //print best time
        time = BigDecimal.valueOf(time).setScale(7, BigDecimal.ROUND_HALF_UP).doubleValue();
        System.out.print(time);

    }

    private static double calculateTime(double[] speeds) {
        double x = 0, v = 0, xd = 0, t = 0, dt = 0.2, m = 5, k = 0.5, b = -0.5,
                forceSpring, forceFriction, forceTotal, acceleration;

        while (!((xd >= 100) && (Math.abs(xd - x) <= 0.1) && (Math.abs(v) <= 0.1))) {
            forceSpring = k * (xd - x);
            forceFriction = b * v;
            forceTotal = forceSpring + forceFriction;
            acceleration = forceTotal / m;

            x += v * dt;
            v += acceleration * dt;
            t += dt;
            if(xd < 100)
                xd += getSpeed(xd, speeds) * dt;
        }

        return t;
    }

    private static double getSpeed(double xd, double[] speeds) {
        int idx = ((int) xd) / 20;
        idx = idx == 5 ? idx - 1 : idx;
        return speeds[idx];
    }

    private static boolean validateSpeeds(double[] speeds) {
        for (int i = 0; i < speeds.length; i++) {
            if (speeds[i] <= 0)
                return false;
            if (speeds[0] > 3)
                return false;
            if (i > 0 && Math.abs(speeds[i - 1] - speeds[i]) > 3)
                return false;
            if (i < speeds.length - 1 && Math.abs(speeds[i + 1] - speeds[i]) > 3)
                return false;
        }

        return true;
    }
}
