package com.kutepov.samples.codeabbey;

import java.math.BigDecimal;
import java.util.Scanner;

public class ClockHands {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        input.nextLine();

        String[] times = input.nextLine().split(" ");
        double beginX = 10, beginY = 10, hourHand = 6, minuteHand = 9;
        for (String time : times) {
            String[] tokens = time.split(":");
            int hours = Integer.valueOf(tokens[0]) % 12, minutes = Integer.valueOf(tokens[1]);

            double ha = Math.toRadians(hours * (360 / 12.0) + (minutes * (360 / (60.0 * 12.0)))), ma = Math.toRadians(minutes * (360 / 60.0));

            double hx = round(beginX + hourHand * Math.sin(ha)), hy = round(beginY + hourHand * Math.cos(ha)),
                    mx = round(beginX + minuteHand * Math.sin(ma)), my = round(beginY + minuteHand * Math.cos(ma));

            System.out.print(hx + " " + hy + " " + mx + " " + my + " ");
        }
    }

    private static double round(double value) {
        return BigDecimal.valueOf(value).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
    }
}
