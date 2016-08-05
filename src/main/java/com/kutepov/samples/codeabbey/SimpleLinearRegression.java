package com.kutepov.samples.codeabbey;

import java.util.Scanner;

public class SimpleLinearRegression {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int startYear = input.nextInt(), endYear = input.nextInt(), years = endYear - startYear + 1;
        input.nextLine();

        //y = k * x + b;
        double sx = 0, sy = 0, sxx = 0, sxy = 0;
        for (int i = 0; i < years; i++) {
            String[] tokens = input.nextLine().replaceAll("\\d{4}: (\\d+) (\\d+)", "$1 $2").split(" ");
            int x = Integer.valueOf(tokens[0]), y = Integer.valueOf(tokens[1]);
            sx += x;
            sy += y;
            sxx += x * x;
            sxy += x * y;
        }

        double k = (years * sxy - sx * sy) / (years * sxx - sx * sx);
        double b = (sy - k * sx) / years;

        System.out.println(k + " " + b);
    }
}
