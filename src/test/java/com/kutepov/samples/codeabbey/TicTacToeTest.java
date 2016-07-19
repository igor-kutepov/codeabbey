package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class TicTacToeTest extends BaseTest {

    public TicTacToeTest() {
        this.input = "12\n" +
                "9 6 2 4 1 5 8 7 3\n" +
                "4 6 7 8 9 5 2 3 1\n" +
                "8 1 5 4 6 9 3 2 7\n" +
                "8 9 6 5 3 7 2 1 4\n" +
                "6 1 8 7 2 9 3 4 5\n" +
                "3 6 5 8 4 7 9 2 1\n" +
                "8 4 1 3 5 2 9 7 6\n" +
                "7 9 3 1 6 2 4 5 8\n" +
                "3 7 1 8 6 9 4 2 5\n" +
                "5 1 9 8 4 2 7 3 6\n" +
                "7 8 2 9 6 1 5 3 4\n" +
                "3 1 2 4 6 9 7 8 5";
        this.output = "6 9 9 8 8 9 7 8 6 8 9 9";
    }

    @Test
    public void main() throws Exception {
        TicTacToe.main(null);
        check();
    }

}