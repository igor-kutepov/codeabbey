package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class FibonacciDivisibilityTest extends BaseTest {

    public FibonacciDivisibilityTest() {
        this.input = "3\n" +
                "17 12 61";
        this.output = "9 12 15";
    }

    @Test
    public void main() throws Exception {
        FibonacciDivisibility.main(null);
        check();
    }

}