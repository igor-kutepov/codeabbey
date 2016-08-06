package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class UphillShootingTest extends BaseTest {

    public UphillShootingTest() {
        this.input = "0 0 0 0 0 1 1 1 1 2 2 2 2 2 2 3 4 5 6 6 7 8 9 9 10 10 10 10 10 10 11 11 12 13 14 15 16 16 17 18\n" +
                "42 42\n" +
                "34 33\n" +
                "41 52\n" +
                "0 0 0 0 0 1 1 1 2 3 3 4 5 5 5 6 7 8 9 9 9 9 9 9 9 10 11 11 12 13 13 13 13 13 14 15 15 15 15 16\n" +
                "30 47\n" +
                "36 55\n" +
                "43 62\n" +
                "0 0 0 0 0 0 1 1 1 1 2 3 3 3 3 3 4 5 5 6 7 7 8 8 8 9 9 10 11 12 13 13 13 13 14 14 15 16 16 17\n" +
                "42 37\n" +
                "37 32\n" +
                "32 52";
        this.output = "96 68 120 60 88 120 97 68 76";
    }

    @Test
    public void main() throws Exception {
        UphillShooting.main(null);
        check();
    }

}