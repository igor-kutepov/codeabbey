package com.kutepov.samples.codeabbey;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class PathsInGrid {

    private static final int MAX_EDGE_PER_VERTEX = 2;   //move only right or down;

    private static List<Integer>[] graph;
    private static int end;
    private static int count = 0;

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int rows = input.nextInt(), columns = input.nextInt(), n = columns * rows, start = 0;
        boolean[][] map = new boolean[columns][rows];

        //read map
        Pattern mapPattern = Pattern.compile("[@+X$]+?");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                char element = input.next(mapPattern).charAt(0);
                switch (element) {
                    case '@':
                        start = j + i * columns;   //start vertex
                    case '$':
                        end = j + i * columns;   //end vertex
                    case '+':
                        map[j][i] = true;
                        break;
                    case 'X':
                        map[j][i] = false;
                        break;
                }
            }
        }

        //build graph
        graph = new List[n];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int x = j + i * columns; //current vertex
                if (graph[x] == null) {
                    graph[x] = new ArrayList<>(MAX_EDGE_PER_VERTEX);
                }
                if (!map[j][i]) {    //skip
                    continue;
                }
                if (j < columns - 1 && map[j + 1][i]) {    //right
                    graph[x].add((j + 1) + i * columns);
                }
                if (i < rows - 1 && map[j][i + 1]) {   //down
                    graph[x].add(j + (i + 1) * columns);
                }
            }
        }

        count = 0;
        dfs(start);

        System.out.println(count);
    }

    //depth-first search
    private static void dfs(int vertex) {
        if (vertex == end) {
            count++;
        }

        for (int i = 0; i < graph[vertex].size(); i++) {
            dfs(graph[vertex].get(i));
        }
    }
}
