package com.kutepov.samples.codeabbey;

import java.math.BigDecimal;
import java.util.Scanner;

public class PointToSegmentDistance {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = input.nextInt();

        for (; count > 0; count--) {
            int[] A = new int[]{input.nextInt(), input.nextInt()},
                    B = new int[]{input.nextInt(), input.nextInt()},
                    C = new int[]{input.nextInt(), input.nextInt()};

            double distance = cross(A, B, C) / distance(A, B);

            //closest point beyond the segment
            if (dot(A, B, C) > 0)
                distance = distance(B, C);
            if (dot(B, A, C) > 0)
                distance = distance(A, C);

            distance = Math.abs(BigDecimal.valueOf(distance).setScale(8, BigDecimal.ROUND_UP).doubleValue());

            String dist = String.valueOf(distance).replaceAll("\\.0$", "");

            System.out.print(dist + " ");
        }
    }

    //Compute the dot product AB ⋅ BC
    private static int dot(int[] A, int[] B, int[] C) {
        int[] AB = new int[2];
        int[] BC = new int[2];

        AB[0] = B[0] - A[0];
        AB[1] = B[1] - A[1];
        BC[0] = C[0] - B[0];
        BC[1] = C[1] - B[1];

        return AB[0] * BC[0] + AB[1] * BC[1];
    }

    //Compute the cross product AB x AC
    private static int cross(int[] A, int[] B, int[] C) {
        int[] AB = new int[2];
        int[] AC = new int[2];

        AB[0] = B[0] - A[0];
        AB[1] = B[1] - A[1];
        AC[0] = C[0] - A[0];
        AC[1] = C[1] - A[1];

        return AB[0] * AC[1] - AB[1] * AC[0];
    }

    //Compute the distance from A to B
    private static double distance(int[] A, int[] B) {
        int d1 = A[0] - B[0];
        int d2 = A[1] - B[1];

        return Math.sqrt(d1 * d1 + d2 * d2);
    }
}
