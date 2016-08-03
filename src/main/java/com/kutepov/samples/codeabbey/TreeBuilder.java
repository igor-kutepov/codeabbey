package com.kutepov.samples.codeabbey;

import java.util.Scanner;

public class TreeBuilder {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.nextInt();

        Node root = new Node(input.nextInt());
        while (input.hasNextInt()) {
            root.add(input.nextInt());
        }

        System.out.println(root);
    }


    private static class Node {
        private final int value;
        private Node left;
        private Node right;

        Node(int value) {
            this.value = value;
        }

        public void add(int value) {
            if (value > this.value) {
                if (right == null) {
                    right = new Node(value);
                } else {
                    right.add(value);
                }
            } else {
                if (left == null) {
                    left = new Node(value);
                } else {
                    left.add(value);
                }
            }
        }

        @Override
        public String toString() {
            return "("
                    + (this.left == null ? "-" : this.left)
                    + "," + this.value + ","
                    + (this.right == null ? "-" : this.right)
                    + ")";
        }
    }
}
