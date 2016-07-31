package com.kutepov.samples.codeabbey;

import org.junit.Test;

@SuppressWarnings("SpellCheckingInspection")
public class LevenshteinDistanceTest extends BaseTest {

    public LevenshteinDistanceTest() {
        this.input = "5\n" +
                "PLAIN PLAN\n" +
                "TREE THREE\n" +
                "WOMAN WOMEN\n" +
                "KITTEN SITTING\n" +
                "YPOEHOHRIWUBXMNHZF YCPOEHORIDUBXNHZF";
        this.output = "1 1 1 3 4";
    }

    @Test
    public void main() throws Exception {
        LevenshteinDistance.main(null);
        check();
    }

}