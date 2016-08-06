package com.kutepov.samples.codeabbey;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TODO Very slow solution!
@SuppressWarnings("unchecked")
public class TravellingSalesman {

    private static List<Road> minPath;
    private static int minLength = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<String> lines = new ArrayList<>();
        while (input.hasNextLine()) {
            lines.add(input.nextLine());
        }

        List<Road>[] graph = new List[lines.size()];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
            String[] tokens = lines.get(i).split(" ");
            for (int j = 1; j < tokens.length; j++) {
                String[] parts = tokens[j].split(":");
                graph[i].add(new Road(Integer.valueOf(parts[0]), Integer.valueOf(parts[1])));
            }
        }

        search(0, graph, new ArrayList<>());

        System.out.print("0 ");
        for (Road road : minPath) {
            System.out.print(road.city + " ");
        }

    }

    private static void search(int v, List<Road>[] graph, List<Road> path) {
        if (path.size() == graph.length - 1) {
            int sum = 0;
            for (Road road : path) {
                sum += road.length;
            }
            if (sum < minLength) {
                minLength = sum;
                minPath = new ArrayList<>(path);
            }
        }

        for (int i = 0; i < graph[v].size(); i++) {
            Road road = graph[v].get(i);
            if (road.city != 0 && !path.contains(road)) {
                path.add(road);
                search(road.city, graph, path);
            }
        }

        if (path.size() > 0)
            path.remove(path.size() - 1);
    }


    private static class Road {
        private final int city;
        private final int length;

        Road(int city, int length) {
            this.city = city;
            this.length = length;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Road road = (Road) o;

            return city == road.city;

        }

        @Override
        public int hashCode() {
            return city;
        }

    }
}
