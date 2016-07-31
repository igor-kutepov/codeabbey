package com.kutepov.samples.codeabbey;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CyclesDetection {


    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int cases = input.nextInt();

        Pattern pattern = Pattern.compile("[A-Z]{1}-[A-Z]{1}");
        for (; cases > 0; cases--) {
            int paths = input.nextInt();
            //read graph data and find vertices count
            String[] edges = new String[paths];
            int vertices = 0;
            for (int i = 0; i < edges.length; i++) {
                edges[i] = input.next(pattern);
                int first = edges[i].charAt(0) - 'A';
                int second = edges[i].charAt(2) - 'A';
                vertices = Math.max(vertices, Math.max(first, second));
            }
            vertices++;

            //fill graph
            boolean hasDuplicate = false;
            List<Integer>[] graph = new List[vertices];
            for (int i = 0; i < graph.length; i++) {
                graph[i] = new ArrayList<>();
            }
            for (String edge : edges) {
                int first = edge.charAt(0) - 'A';
                int second = edge.charAt(2) - 'A';
                if (!graph[first].contains(second)) {
                    graph[first].add(second);
                } else {
                    hasDuplicate = true;
                    break;
                }

                if (!graph[second].contains(first)) {
                    graph[second].add(first);
                } else {
                    hasDuplicate = true;
                    break;
                }
            }

            boolean cycle = hasDuplicate;
            //if already found a duplicate during build the graph, then additional search not needed
            if (!cycle) {
                for (int i = 0; i < graph.length; i++) {
                    int[] color = new int[graph.length];
                    cycle = findCycle(-1, i, graph, color);
                    if (cycle) {
                        break;
                    }

                }
            }

            System.out.print((cycle ? 1 : 0) + " ");
        }
    }

    private static boolean findCycle(int from, int to, List<Integer>[] graph, int color[]) {
        color[to] = 1;  //mark vertex as in progress

        for (int i = 0; i < graph[to].size(); i++) {
            int target = graph[to].get(i);
            if (from != target) {
                if (color[target] == 0) {
                    if (findCycle(to, target, graph, color)) {
                        return true;
                    }
                } else if (color[target] == 1) {
                    return true;
                }
            }
        }

        color[to] = 2;  //mark vertex as completed

        return false;
    }
}
