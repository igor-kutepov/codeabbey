package com.kutepov.samples.codeabbey;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class MatchingWords {

    private static final String STOP_WORD = "end";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Pattern pattern = Pattern.compile("[a-z]+?");
        List<String> words = new ArrayList<>();

        while (input.hasNext(pattern)) {
            String word = input.next();
            if (STOP_WORD.equals(word))
                break;
            words.add(word);
        }

        Collections.sort(words);

        for (int i = 0; i < words.size() - 1; i++) {
            String word = words.get(i);
            if (word.equals(words.get(i + 1))) {
                System.out.print(word + " ");
                //skip other duplicates
                while (i < (words.size() - 1) && word.equals(words.get(i + 1))) {
                    i++;
                }
            }
        }
    }
}
