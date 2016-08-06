package com.kutepov.samples.codeabbey;

import java.util.Scanner;

public class AzimuthAtTreasureIsland {

    private static final String LAST_LINE = "Dig here!";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.nextLine();

        double x = 0, y = 0;
        while (input.hasNextLine()) {
            String line = input.nextLine();
            if (line.startsWith(LAST_LINE))
                break;

            String[] tokens = line.replaceAll(".*?(\\d+).*?(\\d+)", "$1 $2").split(" ");
            int length = Integer.valueOf(tokens[0]), angle = Integer.valueOf(tokens[1]);

            x += Math.sin(Math.toRadians(angle)) * length;
            y += Math.cos(Math.toRadians(angle)) * length;
        }

        int xr = (int) Math.round(x), yr = (int) Math.round(y);
        System.out.println(xr + " " + yr);
    }
}
