package com.kutepov.samples.codeabbey;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * @author Igor Kutepov
 */
public class MatchingBrackets {

    private static final String PATTERN = "()[]{}<>";
    private static Deque<BracketContext> stack;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.nextLine();
        stack = new ArrayDeque<>();

        StringBuilder sb = new StringBuilder();
        while (input.hasNextLine()) {
            String line = input.nextLine();
            char[] chars = line.toCharArray();
            stack.clear();
            boolean updated = true;
            for (char ch : chars) {
                if (PATTERN.indexOf(ch) > -1) {  //need update context
                    updated = updateContext(ch);
                    if (!updated) {
                        break;  //interrupt checking, because was not valid context change
                    }
                }
            }

            int result = stack.size() == 0 && updated ? 1 : 0;

            sb.append(result).append(' ');
        }

        System.out.println(sb.toString().trim());
    }

    private static boolean updateContext(char ch) {
        switch (ch) {
            case '(':
                stack.push(BracketContext.ROUND);
                return true;
            case ')':
                BracketContext round = stack.poll();
                return round != null && round.equals(BracketContext.ROUND);
            case '[':
                stack.push(BracketContext.SQUARE);
                return true;
            case ']':
                BracketContext square = stack.poll();
                return square != null && square.equals(BracketContext.SQUARE);
            case '{':
                stack.push(BracketContext.CURLY);
                return true;
            case '}':
                BracketContext curly = stack.poll();
                return curly != null && curly.equals(BracketContext.CURLY);
            case '<':
                stack.push(BracketContext.ANGLE);
                return true;
            case '>':
                BracketContext angle = stack.poll();
                return angle != null && angle.equals(BracketContext.ANGLE);
        }

        return false;
    }

    private enum BracketContext {ROUND, SQUARE, CURLY, ANGLE}

}
