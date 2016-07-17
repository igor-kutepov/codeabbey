package com.kutepov.samples.codeabbey;

import java.util.Scanner;

public class SortWithIndexes {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size = input.nextInt();
        Element[] array = new Element[size];
        //build array
        for (int i = 0; i < array.length; i++) {
            array[i] = new Element(i + 1, input.nextInt());
        }

        //bubble sort
        int swaps;
        do {
            swaps = 0;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i].compareTo(array[i + 1]) > 0) {
                    Element temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swaps++;
                }
            }
        } while (swaps > 0);

        //print indexes after sort
        for (Element element : array) {
            System.out.print(element.index + " ");
        }

    }

    private static class Element implements Comparable<Element> {

        private int index;
        private int value;

        private Element(int index, int value) {
            this.index = index;
            this.value = value;
        }

        @Override
        public int compareTo(Element o) {
            return Integer.valueOf(value).compareTo(o.value);
        }
    }
}
