package com.kutepov.samples.codeabbey;

import java.util.Scanner;

public class BinaryHeap {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int commands = input.nextInt();

        int[] heap = new int[commands];
        int heapSize = 0;
        for (int i = 0; i < commands; i++) {
            int number = input.nextInt();

            boolean add = number > 0;
            if (add) {   //add value
                heap[heapSize] = number;
                int parent = heapSize, child = heapSize;
                heapSize++;
                while ((parent = (parent - 1) / 2) >= 0) {
                    if (heap[parent] > heap[child]) {
                        int tmp = heap[parent];
                        heap[parent] = heap[child];
                        heap[child] = tmp;
                        child = parent;
                    } else {
                        break;
                    }
                }
            } else {    //poll value from head
                int current = 0, pointer = 0;
                boolean changed = false;

                //move last element to 0 position and decrease heap
                heap[current] = heap[heapSize - 1];
                heap[heapSize - 1] = 0;
                heapSize--;

                do {
                    int left = current * 2 + 1;
                    if (left < heapSize && heap[left] < heap[pointer])
                        pointer = left;

                    int right = current * 2 + 2;
                    if (right < heapSize && heap[right] < heap[pointer])
                        pointer = right;

                    changed = pointer != current;

                    if (changed) {
                        int tmp = heap[current];
                        heap[current] = heap[pointer];
                        heap[pointer] = tmp;
                        current = pointer;
                    }

                } while (changed);
            }
        }

        for (int i = 0; i < heapSize; i++) {
            System.out.print(heap[i] + " ");
        }
    }
}
