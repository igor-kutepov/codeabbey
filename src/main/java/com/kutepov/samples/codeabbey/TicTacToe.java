package com.kutepov.samples.codeabbey;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection")
public class TicTacToe {

    private static final int MAX_STEPS = 9;
    private static final int FIELD_SIZE = 3;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lines = input.nextInt();

        List<Integer> X = new ArrayList<>(), O = new ArrayList<>();
        for (; lines > 0; lines--) {
            int[] steps = new int[MAX_STEPS];
            X.clear();
            O.clear();

            boolean win = false;
            for (int i = 0; i < steps.length; i++) {
                steps[i] = input.nextInt();
                if (i % 2 == 0) {
                    X.add(steps[i]);
                } else {
                    O.add(steps[i]);
                }

                win = (X.size() >= FIELD_SIZE && checkWin(X)) || (O.size() >= FIELD_SIZE && checkWin(O));
                if (win) {
                    System.out.print((i + 1) + " ");
                    if (input.hasNextLine())
                        input.nextLine(); // skip remaining steps
                    break;
                }
            }

            if (!win) {  //nobody win
                System.out.print("0 ");
            }

        }
    }

    private static boolean checkWin(List<Integer> moves) {
        int last = moves.get(moves.size() - 1);
        int row = (last - 1) / FIELD_SIZE,
                col = last - row * FIELD_SIZE - 1,
                winCol = 0, winRow = 0,
                winDiag = 0, winRevDiag = 0;

        for (int i = 0; i < FIELD_SIZE; i++) {

            //check win in row or column
            int checkCol = (col + i * FIELD_SIZE) + 1;
            if (moves.contains(checkCol))
                winCol++;

            int checkRow = (i + row * FIELD_SIZE) + 1;
            if (moves.contains(checkRow))
                winRow++;

            if (row == col || row == (col + FIELD_SIZE - 1)) { //check win in diagonal

                int checkDiag = (i + i * FIELD_SIZE) + 1;
                if (moves.contains(checkDiag))
                    winDiag++;

                int checkRevDiag = ((FIELD_SIZE - i) + i * FIELD_SIZE);
                if (moves.contains(checkRevDiag))
                    winRevDiag++;
            }
        }

        return winCol == FIELD_SIZE || winRow == FIELD_SIZE || winDiag == FIELD_SIZE || winRevDiag == FIELD_SIZE;
    }
}
