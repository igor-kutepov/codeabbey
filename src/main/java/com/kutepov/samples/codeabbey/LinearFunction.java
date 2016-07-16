package com.kutepov.samples.codeabbey;

import java.util.Scanner;

public class LinearFunction {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.nextLine();

        StringBuilder sb = new StringBuilder();
        while (input.hasNextLine()) {
            String[] tokens = input.nextLine().split(" ");
            float
                    x1 = Integer.valueOf(tokens[0]), y1 = Integer.valueOf(tokens[1]),
                    x2 = Integer.valueOf(tokens[2]), y2 = Integer.valueOf(tokens[3]);
            //y(x) = a*x + b
            int a = Math.round((y2 - y1) / (x2 - x1));
            int b = Math.round(y1 - x1 * a);

            sb.append('(').append(a).append(' ').append(b).append(')').append(' ');
        }

        System.out.println(sb.toString().trim());
    }
}
