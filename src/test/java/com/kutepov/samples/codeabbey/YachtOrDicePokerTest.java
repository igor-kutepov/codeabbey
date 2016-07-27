package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class YachtOrDicePokerTest extends BaseTest {

    public YachtOrDicePokerTest() {
        this.input = "3\n" +
                "3 6 5 6 1\n" +
                "1 6 6 1 6\n" +
                "2 4 3 5 1";
        this.output = "pair full-house small-straight";
    }

    @Test
    public void main() throws Exception {
        YachtOrDicePoker.main(null);
        check();
    }

}