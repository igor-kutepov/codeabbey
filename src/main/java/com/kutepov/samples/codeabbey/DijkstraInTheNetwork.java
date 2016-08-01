package com.kutepov.samples.codeabbey;

import java.util.*;

@SuppressWarnings("unchecked")
public class DijkstraInTheNetwork {

    private static final int VERTICES_PER_VERTEX = 2;
    private static final int INFINITY = 10_000_000;

    private static int rand = 0;
    private static int vertices = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        vertices = input.nextInt();
        rand = input.nextInt();

        int start = input.nextInt();

        //create graph
        List<Pair<Integer, Integer>>[] graph = new List[vertices];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>(VERTICES_PER_VERTEX);
        }

        //fill graph (generate VERTICES_PER_VERTEX random undirected edges for each vertex)
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < VERTICES_PER_VERTEX; j++) {

                Pair<Integer, Integer> vertex = generatePair();
                if (vertex.getKey() != i) {
                    boolean contains = false;
                    for (Pair<Integer, Integer> pair : graph[i]) {
                        contains = pair.getKey().equals(vertex.getKey());
                        if (contains)
                            break;
                    }

                    if (!contains)
                        graph[i].add(vertex);
                    else
                        continue;

                    boolean reverse = false;
                    for (Pair<Integer, Integer> edge : graph[vertex.getKey()]) {
                        reverse = edge.getKey() == i;
                        if (reverse)
                            break;
                    }
                    if (!reverse)
                        graph[vertex.getKey()].add(new Pair<>(i, vertex.getValue()));

                }

            }
        }

        dijkstra(graph, start - 1);
    }

    private static void dijkstra(List<Pair<Integer, Integer>>[] graph, int source) {
        Map<Integer, List<Pair<Integer, Integer>>> q = new HashMap<>(graph.length);
        int[] dist = new int[graph.length];

        for (int i = 0; i < graph.length; i++) {
            dist[i] = INFINITY;
            q.put(i, graph[i]);
        }

        dist[source] = 0;

        while (!q.isEmpty()) {

            int d = INFINITY, u = 0;
            for (Integer key : q.keySet()) {
                if (dist[key] < d) {
                    d = dist[key];
                    u = key;
                }
            }

            List<Pair<Integer, Integer>> vertex = q.remove(u);

            for (Pair<Integer, Integer> neighbor : vertex) {
                int len = dist[u] + neighbor.getValue();
                if (len < dist[neighbor.getKey()]) {
                    dist[neighbor.getKey()] = len;
                }
            }
        }

        for (int i = 0; i < graph.length; i++) {
            System.out.print(dist[i] + " ");
        }

    }

    //pair with key - [0..vertices-1] and value - [1..vertices]
    private static Pair<Integer, Integer> generatePair() {
        return new Pair<>(generate(), generate() + 1);
    }

    //random value in [0..vertices-1]
    private static int generate() {
        rand = (445 * rand + 700001) % 2097152;
        return rand % vertices;
    }


    private static class Pair<K, V> {
        private K key;
        private V value;

        Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        K getKey() {
            return key;
        }

        V getValue() {
            return value;
        }


    }
}
