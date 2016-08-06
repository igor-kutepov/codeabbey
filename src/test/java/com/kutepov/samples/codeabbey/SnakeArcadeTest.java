package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class SnakeArcadeTest extends BaseTest {

    public SnakeArcadeTest() {
        this.input =
                "X X X - - $ $ - - - - $ - $ - - - - - $ -\n" +
                        "- $ $ - - - $ - - $ - - $ - - - - - - - $\n" +
                        "- - - $ $ - - - $ - - $ - - - - - - - - $\n" +
                        "- - - $ - - - - - - $ - - - - - - - - - $\n" +
                        "$ $ - - - - - - $ - - $ - $ - - - - $ - -\n" +
                        "- - - - - - $ $ $ $ - $ - $ - - - $ $ - -\n" +
                        "- - - - - - - - - - - - $ $ - - - $ - - $\n" +
                        "- - - - - $ - - - - - - - - $ - - - - - -\n" +
                        "$ $ - - - - - - $ - $ - - $ - $ - $ - - $\n" +
                        "- $ - - - - - - - - - - - - - $ - - - $ -\n" +
                        "- - - - - $ - - - - - $ $ - - $ $ - $ - -\n" +
                        "- - $ - - $ - - - - - $ - - - $ $ $ - $ -\n" +
                        "- - - $ - - - - - $ $ - - $ - - - - - - -\n" +
                        "4 D 4 L 4 D 1 R 15 U 1 L 10 D 2 R 3 D 2 R 9 U 3 L 13 D 1 L 4 U 3 R 11 D 2 L 5 D 4 R 10 U 4 L 7 D 1 L 11 D 6 R 8 U 10 L 5 D 6 R 5 U 1 R 10 U 2 R 2";
        this.output = "8 8 174";
    }

    @Test
    public void main() throws Exception {
        SnakeArcade.main(null);
        check();
    }

}