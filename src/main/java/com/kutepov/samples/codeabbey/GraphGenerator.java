package com.kutepov.samples.codeabbey;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SuppressWarnings("unchecked")
public class GraphGenerator {

    private static final int VERTICES_PER_VERTEX = 2;

    private static int rand = 0;
    private static int vertices = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        vertices = input.nextInt();
        rand = input.nextInt();

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

        //print graph
        for (List<Pair<Integer, Integer>> pairs : graph) {
            int sum = 0;
            for (Pair<Integer, Integer> vertex : pairs) {
                sum += vertex.getValue();
            }

            System.out.print(sum + " ");
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
