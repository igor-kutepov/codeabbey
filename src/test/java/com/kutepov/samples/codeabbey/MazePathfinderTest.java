package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class MazePathfinderTest extends BaseTest {

    public MazePathfinderTest() {
        this.input = "13 9\n" +
                "1111101110111\n" +
                "0010001000001\n" +
                "1011111111111\n" +
                "1000000010100\n" +
                "1111111110101\n" +
                "0010000010001\n" +
                "1111101010111\n" +
                "1010001000100\n" +
                "1011111111111";
        this.output = "2D10L2U2L 2U2R2U6R2U6L2U2L 10L4U6R2U6L2U2L";
    }

    @Test
    public void main() throws Exception {
        MazePathfinder.main(null);
        check();
    }

}