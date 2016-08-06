package com.kutepov.samples.codeabbey;

import java.util.*;

@SuppressWarnings("unchecked")
public class CrossingTheRoad {

    private static final int ROADS = 11;
    private static final int BASE_SPEED = 5;
    private static final int BASE_DISTANCE = 18;

    private static List<Integer> paths;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int cases = input.nextInt();

        int[] positions = new int[ROADS];
        for (; cases > 0; cases--) {
            for (int i = 0; i < ROADS; i++) {
                positions[i] = input.nextInt();
            }
            State state = new State(positions, 0);

            List<Integer>[] graph = new List[ROADS];
            for (int i = 0; i < graph.length; i++) {
                graph[i] = new ArrayList<>();
                if (i < graph.length - 1)
                    graph[i].add(i + 1);
                graph[i].add(i);
                if (i > 0)
                    graph[i].add(i - 1);
            }

            paths = new ArrayList<>();

            search(graph, state, new Counter(), new ArrayList<>());

            Collections.sort(paths);
            int size = paths.size() > 0 ? paths.get(0) + 1 : -1;
            System.out.print(size + " ");
        }

    }

    private static void search(List<Integer>[] graph, State state, Counter counter, List<State> used) {
        int pos = state.line;
        if (pos == graph.length - 1) { //found exit
            paths.add(counter.value);
            return;
        }

        if (used.contains(state)) {
            counter.dec();
            return;
        }
        used.add(state);

        for (int i = 0; i < graph[pos].size(); i++) {
            int line = graph[pos].get(i);
            if (state.canMove(line)) {
                State st = state.step(line);
                counter.inc();
                search(graph, st, counter, used);
            }
        }

        counter.dec();
    }

    private static class Counter {
        int value;

        private void inc() {
            value++;
        }

        private void dec() {
            value--;
        }

    }

    private static class State {
        private final int[] positions;    //car positions;
        private final int line; //pedestrian position;

        State(int[] positions, int line) {
            this.positions = positions;
            this.line = line;
        }

        private boolean canMove(int line) {
            int pos = positions[line];
            int speed = BASE_SPEED + line;
            return pos - speed > 0;
        }

        private State step(int line) {
            int[] pos = new int[positions.length];
            for (int i = 0; i < positions.length; i++) {
                int speed = BASE_SPEED + i;
                int dist = BASE_DISTANCE + i;

                int newPos = positions[i] - speed;
                if (newPos < 0)
                    newPos += dist;

                pos[i] = newPos;
            }

            return new State(pos, line);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            State state = (State) o;

            return line == state.line && Arrays.equals(positions, state.positions);

        }

        @Override
        public int hashCode() {
            int result = Arrays.hashCode(positions);
            result = 31 * result + line;
            return result;
        }

        @Override
        public String toString() {
            return "State{" +
                    "positions=" + Arrays.toString(positions) +
                    ", line=" + line +
                    '}';
        }
    }
}
