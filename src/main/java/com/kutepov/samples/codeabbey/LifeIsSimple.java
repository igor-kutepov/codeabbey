package com.kutepov.samples.codeabbey;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LifeIsSimple {

    private static final int MAX_TURN = 5;
    //build the map on MAX_TURN cell greater than original to each direction
    private static final int COLUMNS = 7 + 2 * MAX_TURN;
    private static final int ROWS = 5 + 2 * MAX_TURN;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean[] map = new boolean[COLUMNS * ROWS];
        List<Integer> borned = new ArrayList<>(), died = new ArrayList<>();

        int creatures = 0;

        //fill map
        int offset = MAX_TURN + COLUMNS * MAX_TURN;
        for (int i = 0; i < ROWS - 2 * MAX_TURN; i++) {
            String row = input.nextLine();
            for (int j = 0; j < COLUMNS - 2 * MAX_TURN; j++) {
                char ch = row.charAt(j);
                if (ch == 'X') {
                    map[offset + j + (i * COLUMNS)] = true;
                    creatures++;
                }
            }
        }

        for (int i = 0; i < MAX_TURN; i++) {
            //scan map for changes
            for (int j = 0; j < map.length; j++) {
                boolean creature = map[j];
                //scan each cell on current neighbors
                int neighbors = scan(map, j);
                if (creature && (neighbors > 3 || neighbors < 2)) {
                    died.add(j);
                } else if (!creature && neighbors == 3) {
                    borned.add(j);
                }
            }

            //apply changes
            for (int index : died) {
                creatures--;
                map[index] = false;
            }
            for (int index : borned) {
                creatures++;
                map[index] = true;
            }
            died.clear();
            borned.clear();

            System.out.print(creatures + " ");
        }

    }

    private static String printMap(boolean[] map) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ROWS; i++) {
            char[] chars = new char[COLUMNS];
            for (int j = 0; j < COLUMNS; j++) {
                chars[j] = map[j + i * COLUMNS] ? 'X' : '-';
            }
            sb.append(chars).append('\n');
        }

        return sb.toString();
    }

    private static int scan(boolean[] map, int pos) {
        int min = 0, max = COLUMNS * ROWS - 1, neighbors = 0;
        int[] dir = {
                pos - COLUMNS, pos + COLUMNS,           //north south
                pos - 1, pos + 1,                       //west east
                pos - COLUMNS - 1, pos - COLUMNS + 1,   //northwest northeast
                pos + COLUMNS - 1, pos + COLUMNS + 1};  //southwest southeast

        if (dir[0] >= min && map[dir[0]]) {
            neighbors++;
        }
        if (dir[1] <= max && map[dir[1]]) {
            neighbors++;
        }
        if (dir[2] >= min && rowChanged(pos, dir[2]) == 0 && map[dir[2]]) {
            neighbors++;
        }
        if (dir[3] <= max && rowChanged(pos, dir[3]) == 0 && map[dir[3]]) {
            neighbors++;
        }
        if (dir[4] >= min && rowChanged(pos, dir[4]) == 1 && map[dir[4]]) {
            neighbors++;
        }
        if (dir[5] >= min && rowChanged(pos, dir[5]) == 1 && map[dir[5]]) {
            neighbors++;
        }
        if (dir[6] <= max && rowChanged(pos, dir[6]) == -1 && map[dir[6]]) {
            neighbors++;
        }
        if (dir[7] <= max && rowChanged(pos, dir[7]) == -1 && map[dir[7]]) {
            neighbors++;
        }

        return neighbors;
    }

    private static int rowChanged(int src, int dst) {
        return src / COLUMNS - dst / COLUMNS;
    }
}
