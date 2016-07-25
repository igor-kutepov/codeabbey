package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class FibonacciSequenceTest extends BaseTest {

    public FibonacciSequenceTest() {
        this.input = "5\n" +
                "610\n" +
                "34\n" +
                "0\n" +
                "1346269\n" +
                "10946";
        this.output = "15 9 0 31 21";
    }

    @Test
    public void main() throws Exception {
        FibonacciSequence.main(null);
        check();
    }

}