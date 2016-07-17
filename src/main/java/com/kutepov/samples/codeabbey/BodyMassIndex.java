package com.kutepov.samples.codeabbey;

import java.util.Locale;
import java.util.Scanner;

public class BodyMassIndex {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        int lines = input.nextInt();

        for (; lines > 0; lines--) {
            double weight = input.nextDouble(), height = input.nextDouble();
            double bmi = weight / (Math.pow(height, 2));
            WeightCategory category = WeightCategory.findByBMI(bmi);

            System.out.print(category + " ");
        }
    }

    private enum WeightCategory {

        UNDER("under", 0.0, 18.5),
        NORMAL("normal", 18.5, 25.0),
        OVER("over", 25.0, 30.0),
        OBESITY("obese", 30.0, Double.POSITIVE_INFINITY);

        private String name;
        private double min;
        private double max;

        WeightCategory(String name, double min, double max) {
            this.name = name;
            this.min = min;
            this.max = max;
        }

        @Override
        public String toString() {
            return name;
        }

        public static WeightCategory findByBMI(double bmi) {
            for (WeightCategory category : values()) {
                if (bmi >= category.min && bmi < category.max)
                    return category;
            }
            return null;
        }
    }
}
