package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class RoundingTest extends BaseTest {
    public RoundingTest() {
        this.input = "3\n" +
                "12 8\n" +
                "11 -3\n" +
                "400 5";
        this.output = "2 -4 80";
    }

    @Test
    public void main() throws Exception {
        Rounding.main(null);
        check();
    }

}