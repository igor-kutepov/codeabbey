package com.kutepov.samples.codeabbey;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Igor Kutepov
 */
public class ModularCalculator {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = Integer.valueOf(input.nextLine());

        List<String> lines = new ArrayList<>();
        int div = 0;
        while (input.hasNextLine()) {
            String line = input.nextLine();
            if (line.startsWith("%")) {  //found divider
                div = Integer.valueOf(line.split(" ")[1]);
                break;
            }
            lines.add(line);
        }

        for (String line : lines) {
            String[] tokens = line.split(" ");
            boolean add = tokens[0].contains("+");  //operator
            int number = Integer.valueOf(tokens[1]);    //operand
            sum = add ? sum + (number % div) : sum * (number % div);
            sum %= div;
        }
        sum %= div;

        System.out.println(sum);

    }
}
