package com.kutepov.samples.codeabbey;

import java.util.PriorityQueue;
import java.util.Scanner;

public class StarvingPriorityQueue {

    private static int rand;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int visitors = input.nextInt();
        int ticks = visitors * 2;
        rand = input.nextInt();

        PriorityQueue<Visitor> queue = new PriorityQueue<>(visitors / 2 + 1, (o1, o2) -> -(o1.starvation - o2.starvation));

        long discomfort = 0;
        for (int i = 0; i <= ticks; i++) {
            if (i % 2 == 0 && i > 0) {   //time to feed
                Visitor visitor = queue.poll();
                discomfort += visitor.starvation * (i - visitor.arrival);
            }

            //new visitors arrived
            if (i < visitors) {
                int starvation = generateStarvation();
                queue.add(new Visitor(starvation, i));
            }

        }

        System.out.println(discomfort);
    }

    //random value in [1..999]
    private static int generateStarvation() {
        rand = (445 * rand + 700001) % 2097152;
        return rand % 999 + 1;
    }

    private static class Visitor {
        private final int starvation;
        private final int arrival;

        Visitor(int starvation, int arrival) {
            this.starvation = starvation;
            this.arrival = arrival;
        }

    }
}
