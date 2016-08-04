package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class MinimumOfTwoTest extends BaseTest {

    public MinimumOfTwoTest() {
        this.input = "3\n" +
                "5 3\n" +
                "2 8\n" +
                "100 15";
        this.output = "3 2 15";
    }

    @Test
    public void main() throws Exception {
        MinimumOfTwo.main(null);
        check();
    }

}