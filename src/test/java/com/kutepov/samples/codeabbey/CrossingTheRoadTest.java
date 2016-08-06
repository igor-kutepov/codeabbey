package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class CrossingTheRoadTest extends BaseTest {

    public CrossingTheRoadTest() {
        this.input = "13\n" +
                "13 12 5 1 2 2 12 11 17 15 21\n" +
                "5 7 16 4 8 21 22 14 5 17 16\n" +
                "9 14 16 11 1 1 8 11 7 4 6\n" +
                "13 5 12 3 12 11 7 23 8 12 26\n" +
                "9 18 11 9 2 7 20 16 14 8 1\n" +
                "6 8 17 19 9 3 7 8 2 25 7\n" +
                "7 18 14 11 19 16 7 23 22 6 14\n" +
                "17 5 16 1 21 16 1 14 8 8 22\n" +
                "15 12 13 6 10 1 6 22 21 16 1\n" +
                "6 17 17 1 13 7 10 21 18 11 4\n" +
                "7 7 14 16 2 5 20 11 24 21 22\n" +
                "13 11 10 10 13 22 16 12 17 19 27\n" +
                "7 12 5 3 12 12 4 16 16 7 21";
        this.output = "136 -1 29 101 -1 -1 -1 75 -1 120 -1 86 52";
    }

    @Test
    public void main() throws Exception {
        CrossingTheRoad.main(null);
        check();
    }

}