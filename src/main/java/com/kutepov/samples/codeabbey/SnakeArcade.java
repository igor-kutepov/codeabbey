package com.kutepov.samples.codeabbey;

import java.awt.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class SnakeArcade {

    private static final int FIELD_SIZE_X = 21;
    private static final int FIELD_SIZE_Y = 13;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean[][] field = new boolean[FIELD_SIZE_Y][FIELD_SIZE_X];
        Deque<Point> snake = new ArrayDeque<>();

        //fill map
        for (int i = 0; i < field.length; i++) {
            String[] tokens = input.nextLine().split(" ");
            for (int j = 0; j < tokens.length; j++) {
                char ch = tokens[j].charAt(0);
                switch (ch) {
                    case 'X':
                        snake.addFirst(new Point(j, i));
                        break;
                    case '$':
                        field[i][j] = true;
                        break;
                }
            }
        }

        String[] moves = input.nextLine().split(" ");
        int step = 0;
        String direction = "R";
        boolean alive = true;

        for (String move : moves) {
            if (move.matches("\\d+")) {  //make move
                int count = Integer.valueOf(move);
                for (; count > 0; count--) {
                    step++;
                    alive = move(direction, snake, field);
                    if (!alive)
                        break;
                }
            } else {    //change direction
                direction = move;
            }

            if (!alive)
                break;
        }

        Point head = snake.peek();
        System.out.println(head.x + " " + head.y + " " + step);
    }

    private static boolean move(String direction, Deque<Point> snake, boolean[][] field) {
        Point head = snake.peek();
        Point newHead = new Point(head);
        boolean alive = true;

        switch (direction) {
            case "R":
                newHead.translate(1, 0);
                break;
            case "L":
                newHead.translate(-1, 0);
                break;
            case "U":
                newHead.translate(0, -1);
                break;
            case "D":
                newHead.translate(0, 1);
                break;
        }

        //remove tail if no food
        if (!field[newHead.y][newHead.x]) {
            snake.pollLast();
        } else {
            field[newHead.y][newHead.x] = false;
        }

        //check on collision
        for (Point point : snake) {
            if (point.equals(newHead)) {
                alive = false;
                break;
            }
        }

        snake.addFirst(newHead);

        return alive;
    }
}
