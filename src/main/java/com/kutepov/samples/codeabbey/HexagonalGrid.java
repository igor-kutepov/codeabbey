package com.kutepov.samples.codeabbey;

import java.math.BigDecimal;
import java.util.Scanner;

public class HexagonalGrid {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int paths = input.nextInt();
        input.nextLine();

        for (; paths > 0; paths--) {
            String path = input.nextLine();
            double[] vec = new double[]{0, 0};   //resulting vector
            for (int i = 0; i < path.length(); i++) {
                char ch = path.charAt(i);
                //each step as vector
                double[] step = getVector(ch);
                vec[0] += step[0];
                vec[1] += step[1];
            }

            //resulting vector length
            double length = Math.sqrt(Math.pow(vec[0], 2) + Math.pow(vec[1], 2));

            length = BigDecimal.valueOf(length).setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
            System.out.print(length + " ");
        }
    }


    private static double[] getVector(char ch) {
        int diff = ch - 'A';

        double angle = (60 * diff * Math.PI) / 180;

        double x = Math.cos(angle), y = Math.sin(angle);

        return new double[]{x, y};
    }

}
