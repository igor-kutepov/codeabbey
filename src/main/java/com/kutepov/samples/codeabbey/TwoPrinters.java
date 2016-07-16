package com.kutepov.samples.codeabbey;

import java.util.Scanner;

/**
 * @author Igor Kutepov
 */
public class TwoPrinters {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lines = input.nextInt();

        for (; lines > 0; lines--) {
            int firstSpeed = input.nextInt(), secondSpeed = input.nextInt(), pages = input.nextInt();
            //pages always has integer values
            //high and low integer boundaries for printed pages with first speed
            int firstPagesMin = (int) Math.floor(pages * secondSpeed / (double) (firstSpeed + secondSpeed));
            int firstPagesMax = (int) Math.ceil(pages * secondSpeed / (double) (firstSpeed + secondSpeed));
            //high and low integer boundaries for printed pages with second speed
            int secondPagesMax = (int) Math.ceil(pages * firstSpeed / (double) (firstSpeed + secondSpeed));
            int secondPagesMin = (int) Math.floor(pages * firstSpeed / (double) (firstSpeed + secondSpeed));
            //calculate elapsed time then first - min and second - max
            int elapsedTimeFirst = Math.max(firstPagesMin * firstSpeed, secondPagesMax * secondSpeed);
            //calculate elapsed time then second - min and first - max
            int elapsedTimeSecond = Math.max(firstPagesMax * firstSpeed, secondPagesMin * secondSpeed);
            //use minimal elapsed time as result
            int resultElapsedTime = Math.min(elapsedTimeFirst, elapsedTimeSecond);

            System.out.print(resultElapsedTime + " ");
        }

    }
}
