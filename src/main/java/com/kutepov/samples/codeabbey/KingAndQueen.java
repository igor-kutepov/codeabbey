package com.kutepov.samples.codeabbey;

import java.util.Scanner;

public class KingAndQueen {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lines = input.nextInt();
        input.nextLine();

        for (; lines > 0; lines--) {
            String[] pos = input.nextLine().split(" ");

            String king = pos[0];
            String queen = pos[1];
            char xk = king.charAt(0), yk = king.charAt(1), xq = queen.charAt(0), yq = queen.charAt(1);
            if (xk == xq || yq == yk) { //by row or column
                System.out.print("Y ");
            } else if (Math.abs(yq - yk) == Math.abs(xq - xk)) { //by diagonals
                System.out.print("Y ");
            } else {    //no intersection
                System.out.print("N ");
            }

        }
    }
}
