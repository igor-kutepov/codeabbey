package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class ArithmeticProgressionTest extends BaseTest {

    public ArithmeticProgressionTest() {
        this.input = "2\n" +
                "5 2 3\n" +
                "3 0 10";
        this.output = "21 30";
    }

    @Test
    public void main() throws Exception {
        ArithmeticProgression.main(null);
        check();
    }

}