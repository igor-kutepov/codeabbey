package com.kutepov.samples.codeabbey;

import java.math.BigDecimal;
import java.util.Scanner;

import static java.lang.Math.abs;

public class TriangleArea {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int triangles = input.nextInt();

        for (; triangles > 0; triangles--) {
            int x1 = input.nextInt(), y1 = input.nextInt(),
                    x2 = input.nextInt(), y2 = input.nextInt(),
                    x3 = input.nextInt(), y3 = input.nextInt();

            int[] vec1 = new int[]{x2 - x1, y2 - y1};
            int[] vec2 = new int[]{x3 - x1, y3 - y1};

            //vector product
            int product = vec1[0] * vec2[1] - vec1[1] * vec2[0];

            double area = abs(product) / 2.0;
            area = BigDecimal.valueOf(area).setScale(7, BigDecimal.ROUND_HALF_UP).doubleValue();

            System.out.print(area + " ");
        }
    }
}
