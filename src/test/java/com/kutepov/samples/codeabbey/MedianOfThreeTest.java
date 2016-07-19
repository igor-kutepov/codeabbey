package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class MedianOfThreeTest extends BaseTest {

    public MedianOfThreeTest() {
        this.input = "3\n" +
                "7 3 5\n" +
                "15 20 40\n" +
                "300 550 137";
        this.output = "5 20 300";
    }

    @Test
    public void main() throws Exception {
        MedianOfThree.main(null);
        check();
    }

}