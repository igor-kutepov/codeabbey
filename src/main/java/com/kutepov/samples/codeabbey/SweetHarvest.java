package com.kutepov.samples.codeabbey;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SweetHarvest {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lines = input.nextInt();
        input.nextLine();
        for (; lines > 0; lines--) {
            String[] tokens = input.nextLine().split(" ");
            int[] isles = new int[tokens.length];
            for (int i = 0; i < tokens.length; i++) {
                isles[i] = Integer.valueOf(tokens[i]);
            }

            //build graph
            List<Integer>[] graph = new List[isles.length];
            for (int i = 0; i < graph.length; i++) {
                if (graph[i] == null) {
                    graph[i] = new ArrayList<>();
                }
                if (i + 2 < graph.length)
                    graph[i].add(i + 2);
                if (i + 3 < graph.length) {
                    graph[i].add(i + 3);
                }
            }

            //getting max sum
            int max = dfs(graph, isles, 0);

            System.out.print(max + " ");

        }

    }

    //depth-first search
    private static int dfs(List<Integer>[] graph, int[] isles, int vertex) {
        int sum = isles[vertex];

        if (vertex == graph.length - 1 || vertex == graph.length - 2) {
            return sum;
        }

        int max = 0;
        for (int i = 0; i < graph[vertex].size(); i++) {
            max = Math.max(max, dfs(graph, isles, graph[vertex].get(i)));
        }
        sum += max;

        return sum;
    }

}
