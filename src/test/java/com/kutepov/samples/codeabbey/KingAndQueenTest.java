package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class KingAndQueenTest extends BaseTest {


    public KingAndQueenTest() {
        this.input = "8\n" +
                "b4 b8\n" +
                "b4 e7\n" +
                "b4 d2\n" +
                "b4 g4\n" +
                "f2 b1\n" +
                "f2 c4\n" +
                "f2 d5\n" +
                "f2 g7";
        this.output = "Y Y Y Y N N N N";
    }

    @Test
    public void main() throws Exception {
        KingAndQueen.main(null);
        check();
    }

}