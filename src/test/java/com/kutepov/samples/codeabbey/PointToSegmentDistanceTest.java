package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class PointToSegmentDistanceTest extends BaseTest {

    public PointToSegmentDistanceTest() {
        this.input = "17\n" +
                "1 7 1 13 7 13\n" +
                "4 8 4 3 15 0\n" +
                "19 3 18 11 3 2\n" +
                "6 10 4 20 14 1\n" +
                "16 10 10 17 0 3\n" +
                "10 15 4 11 13 17\n" +
                "11 11 7 16 7 20\n" +
                "19 14 15 16 15 11\n" +
                "18 11 18 1 4 8\n" +
                "4 6 8 14 10 19\n" +
                "11 13 15 16 2 0\n" +
                "15 16 13 2 4 2\n" +
                "13 9 1 7 11 7\n" +
                "16 2 17 14 5 5\n" +
                "12 8 13 0 3 6\n" +
                "1 14 8 17 2 16\n" +
                "19 4 7 11 9 12";
        this.output = "6 11.40175426 16.00048077 12.04159458 16.70364526 3.60555128 4 4.47213596 14 5.38516481 15.81138831 9 1.64398988 11.21113979 9.17857036 1.44437077 1.87152096";
    }

    @Test
    public void main() throws Exception {
        PointToSegmentDistance.main(null);
        check();
    }

}