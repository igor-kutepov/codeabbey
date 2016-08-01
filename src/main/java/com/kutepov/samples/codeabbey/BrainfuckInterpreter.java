package com.kutepov.samples.codeabbey;

import java.util.Scanner;

public class BrainfuckInterpreter {

    private static final int MEMORY_SIZE = 1000;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String program = input.nextLine();

        String[] tokens = input.nextLine().split(" ");
        int[] data = new int[tokens.length];
        for (int i = 0; i < data.length; i++) {
            data[i] = Integer.valueOf(tokens[i]);
        }

        int[] memory = new int[MEMORY_SIZE];
        //place initial pointer to a memory cell to the middle of the memory
        int pointer = MEMORY_SIZE / 2;
        //pointer to the input data
        int dataPointer = 0;

        char[] commands = program.toCharArray();
        for (int i = 0; i < commands.length; i++) {
            switch (commands[i]) {
                case '+':
                    memory[pointer]++;
                    break;
                case '-':
                    memory[pointer]--;
                    break;
                case '>':
                    pointer++;
                    break;
                case '<':
                    pointer--;
                    break;
                case '[':
                    if (memory[pointer] == 0) {
                        int depth = 0;
                        for (int j = i; j < commands.length; j++) {
                            if (commands[j] == '[')
                                depth++;
                            else if (commands[j] == ']')
                                depth--;
                            if (depth == 0) {
                                i = j;
                                break;
                            }
                        }
                    }
                    break;
                case ']':
                    int depth = 0;
                    for (int j = i; j >= 0; j--) {
                        if (commands[j] == ']')
                            depth++;
                        else if (commands[j] == '[')
                            depth--;
                        if (depth == 0) {
                            i = j - 1;
                            break;
                        }
                    }
                    break;
                case ':':
                    System.out.print(memory[pointer] + " ");
                    break;
                case ';':
                    memory[pointer] = data[dataPointer];
                    dataPointer++;
                    break;
                default:
                    break;
            }

        }
    }
}
