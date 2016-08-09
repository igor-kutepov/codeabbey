package com.kutepov.samples.codeabbey;

import java.awt.*;
import java.math.BigDecimal;
import java.util.Scanner;

public class ConvexPolygonArea {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int vertices = input.nextInt();

        Point[] polygon = new Point[vertices];
        for (int i = 0; i < vertices; i++) {
            polygon[i] = new Point(input.nextInt(), input.nextInt());
        }

        Point start = polygon[0];
        double area = 0.0;
        //split the polygon by triangles from a start point
        for (int i = 1; i < polygon.length - 1; i++) {
            area += triangleArea(start, polygon[i], polygon[i + 1]);
        }

        area = BigDecimal.valueOf(area).setScale(7, BigDecimal.ROUND_HALF_UP).doubleValue();
        System.out.println(area);
    }


    private static double triangleArea(Point a, Point b, Point c) {
        int[] ab = new int[]{b.x - a.x, b.y - a.y};
        int[] ac = new int[]{c.x - a.x, c.y - a.y};

        return (ab[0] * ac[1] - ab[1] * ac[0]) / 2.0;
    }
}
