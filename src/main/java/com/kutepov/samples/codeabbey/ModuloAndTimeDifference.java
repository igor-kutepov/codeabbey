package com.kutepov.samples.codeabbey;

import java.util.Scanner;

public class ModuloAndTimeDifference {

    private static final int DAY = 24 * 60 * 60;
    private static final int HOUR = 60 * 60;
    private static final int MINUTE = 60;


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lines = input.nextInt();

        StringBuilder sb = new StringBuilder();
        for (; lines > 0; lines--) {
            int[] firstDate = new int[]{input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
            int[] secondDate = new int[]{input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

            //calculate first and second timestamps in seconds
            int firstTimestamp = firstDate[0] * DAY + firstDate[1] * HOUR + firstDate[2] * MINUTE + firstDate[3];
            int secondTimestamp = secondDate[0] * DAY + secondDate[1] * HOUR + secondDate[2] * MINUTE + secondDate[3];
            //time difference in seconds
            int diff = secondTimestamp - firstTimestamp;

            int days = diff / DAY;
            diff %= DAY;
            int hours = diff / HOUR;
            diff %= HOUR;
            int minutes = diff / MINUTE;
            diff %= MINUTE;
            int seconds = diff;

            sb
                    .append("(")
                    .append(days).append(' ').append(hours).append(' ').append(minutes).append(' ').append(seconds)
                    .append(")").append(' ');
        }

        System.out.println(sb.toString().trim());
    }
}
