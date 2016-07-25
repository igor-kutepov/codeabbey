package com.kutepov.samples.codeabbey;

import java.util.*;

public class TransitiveClosureOnCandyStates {

    private static final int INF = 10_000_000;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int roadLines = input.nextInt();
        input.nextLine();

        Set<String> states = new HashSet<>();
        List<Pair<String>> roads = new ArrayList<>(roadLines);

        for (int i = 0; i < roadLines; i++) {
            String[] tokens = input.nextLine().split(" - ");
            String first = tokens[0], second = tokens[1];
            Pair<String> road = new Pair<>(first, second);

            states.add(first);
            states.add(second);
            roads.add(road);
        }

        List<String> stateList = new ArrayList<>(states);
        int vertices = states.size();
        int[][] adj = new int[vertices][vertices];

        //build adjacency matrix
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                Pair<String> road = new Pair<>(stateList.get(i), stateList.get(j));
                adj[i][j] = roads.contains(road) ? 1 : INF;
            }
        }

        //find routes lengths
        for (int k = 0; k < vertices; k++) {
            for (int i = 0; i < vertices; i++) {
                for (int j = 0; j < vertices; j++) {
                    adj[i][j] = Math.min(adj[i][j], adj[i][k] + adj[k][j]);
                }
            }
        }

        int routeLines = input.nextInt();
        input.nextLine();

        for (int i = 0; i < routeLines; i++) {
            String[] tokens = input.nextLine().split(" - ");
            int first = stateList.indexOf(tokens[0]), second = stateList.indexOf(tokens[1]);
            int length = adj[first][second] >= INF ? INF : adj[first][second];

            System.out.print(length + " ");
        }


    }

    private static class Pair<T> {

        T first;
        T second;

        Pair(T first, T second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair<?> pair = (Pair<?>) o;

            return (first.equals(pair.first) && second.equals(pair.second))
                    || (first.equals(pair.second) && second.equals(pair.first));
        }

        @Override
        public int hashCode() {
            return first.hashCode() + second.hashCode();
        }
    }
}
