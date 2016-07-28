package com.kutepov.samples.codeabbey;

import java.util.Scanner;

public class PawnMoveValidator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        input.nextLine();

        int[][] map = new int[8][8];

        while (input.hasNextLine()) {
            String[] moves = input.nextLine().split(" ");
            clearMap(map);

            int counter = 0;
            boolean wrongMove = false;
            for (String move : moves) {
                counter++;
                if (!applyMove(map, move)) {
                    wrongMove = true;
                    break;
                }
            }

            counter = wrongMove ? counter : 0;

            System.out.print(counter + " ");
        }
    }

    private static void clearMap(int[][] map) {
        for (int y = 0; y < 8; y++) {
            for (int x = 0; x < 8; x++) {
                if (y == 0 || y == 7)
                    map[y][x] = 3;
                else if (y == 1 || y == 6)
                    map[y][x] = y == 1 ? 1 : 2; // 1 - black, 2 - white
                else
                    map[y][x] = 0;
            }
        }
    }

    private static boolean applyMove(int[][] map, String move) {
        int[] m = toCoordinate(move);

        int x1 = m[0], y1 = m[1], x2 = m[2], y2 = m[3];

        boolean isPawn = map[y1][x1] == 1 || map[y1][x1] == 2;

        if (isPawn) {
            //movement signs
            boolean black = map[y1][x1] == 1;
            int directMove = y1 - y2;
            int sidewaysMove = Math.abs(x1 - x2);
            boolean overBlack = (black && y1 + 1 < 8 && (map[y1 + 1][x1] > 0)),
                    overWhite = (!black && y1 - 1 >= 0 && (map[y1 - 1][x1] > 0));


            if (sidewaysMove > 1 || Math.abs(directMove) > 2) {
                //over move limit
                return false;
            } else if (sidewaysMove == 1 && (directMove == 0 || directMove == 2)) {
                //move by sideways prohibited
                return false;
            } else if ((directMove > 0 && black) || (directMove < 0 && !black)) {
                //black can move only down, white - up
                return false;
            } else if (map[y2][x2] > 0 && sidewaysMove == 0 && Math.abs(directMove) == 1) {
                //move blocked (target cell is not empty)
                return false;
            } else if (directMove == -2 && black) {
                if (y1 != 1) {
                    //move on two cells from wrong position
                    return false;
                } else if (overBlack) {
                    //move over existing piece
                    return false;
                }
            } else if (directMove == 2 && !black) {
                if (y1 != 6) {
                    //move on two cells from wrong position
                    return false;
                } else if (overWhite) {
                    //move over existing piece
                    return false;
                }
            } else if (sidewaysMove == 1 && Math.abs(directMove) == 1 && map[y2][x2] == 0) {
                //move by diagonal without capture
                return false;
            } else if ((map[y2][x2] == 1 && black) || (map[y2][x2] == 2 && !black)) {
                //capture target has same side
                return false;
            }

        }

        //if not a pawn or no any restrictions, then just apply move
        map[y2][x2] = map[y1][x1];
        map[y1][x1] = 0;
        return true;
    }

    private static int[] toCoordinate(String move) {
        int x1 = move.charAt(0) - 'a';
        int y1 = 8 - Character.digit(move.charAt(1), 10);
        int x2 = move.charAt(2) - 'a';
        int y2 = 8 - Character.digit(move.charAt(3), 10);

        return new int[]{x1, y1, x2, y2};
    }
}
