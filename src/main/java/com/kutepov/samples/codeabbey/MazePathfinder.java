package com.kutepov.samples.codeabbey;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SuppressWarnings("unchecked")
public class MazePathfinder {

    private static Pair<List<Integer>, Integer>[] graph;
    private static boolean[] used;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int width = input.nextInt(), height = input.nextInt();
        input.nextLine();

        //read map
        int[][] map = new int[height][width];
        for (int i = 0; i < height; i++) {
            String line = input.nextLine();
            for (int j = 0; j < width; j++) {
                map[i][j] = Character.digit(line.charAt(j), 10);
            }
        }

        //build graph
        graph = new Pair[height * width];
        used = new boolean[height * width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                int value = map[i][j];

                if (value > 0) {
                    int index = j + i * width;
                    if (graph[index] == null) {
                        graph[index] = new Pair<>(new ArrayList<>(), value);
                    }
                    Pair<List<Integer>, Integer> vertex = graph[index];

                    //check possible directions
                    //left
                    if (j > 0) {
                        if (map[i][j - 1] > 0) {
                            vertex.key.add(j - 1 + i * width);
                        }
                    }
                    //right
                    if (j < width - 1) {
                        if (map[i][j + 1] > 0) {
                            vertex.key.add(j + 1 + i * width);
                        }
                    }
                    //up
                    if (i > 0) {
                        if (map[i - 1][j] > 0) {
                            vertex.key.add(j + (i - 1) * width);
                        }
                    }
                    //down
                    if (i < height - 1) {
                        if (map[i + 1][j] > 0) {
                            vertex.key.add(j + (i + 1) * width);
                        }
                    }
                }

            }
        }

        //send waves from the end point
        sendWave(0);

        //start points
        int a = width - 1;
        int b = (height - 1) * width;
        int c = width - 1 + (height - 1) * width;

        List<Integer> path = new ArrayList<>();

        findPath(a, path);
        String pathA = printPath(path, width);
        path.clear();

        findPath(b, path);
        String pathB = printPath(path, width);
        path.clear();

        findPath(c, path);
        String pathC = printPath(path, width);

        System.out.println(pathA + " " + pathB + " " + pathC);
    }

    private static String printPath(List<Integer> path, int width) {
        StringBuilder sb = new StringBuilder();
        int counter = 1;
        char old = '0';
        for (int i = 0; i < path.size() - 1; i++) {
            int offset = path.get(i) - path.get(i + 1);
            char dir = '0';
            if (offset == width) {
                dir = 'U';
            } else if (offset == -width) {
                dir = 'D';
            } else if (offset == 1) {
                dir = 'L';
            } else if (offset == -1) {
                dir = 'R';
            }

            if (old == dir) {
                counter++;
            } else if (old == '0') {
                old = dir;
            } else if (old != dir) {
                sb.append(counter).append(old);
                old = dir;
                counter = 1;
            }

            if (i == (path.size() - 2)) {
                sb.append(counter).append(old);
            }
        }

        return sb.toString();
    }


    private static void sendWave(int vertex) {
        if (used[vertex])
            return;
        used[vertex] = true;

        for (int i = 0; i < graph[vertex].key.size(); i++) {
            int v = graph[vertex].key.get(i);
            if (!used[v]) {
                graph[v].value = graph[vertex].value + 1;
                sendWave(v);
            }
        }
    }

    private static void findPath(int vertex, List<Integer> path) {
        path.add(vertex);
        if (vertex == 0) {
            return;
        }
        for (int i = 0; i < graph[vertex].key.size(); i++) {
            int v = graph[vertex].key.get(i);
            if ((graph[vertex].value - graph[v].value) == 1) {
                findPath(v, path);
                break;
            }
        }
    }

    private static class Pair<K, V> {

        private K key;
        private V value;

        Pair(K index, V value) {
            this.key = index;
            this.value = value;
        }
    }
}
