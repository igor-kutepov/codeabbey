package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class SavingsCalculatorTest extends BaseTest {

    public SavingsCalculatorTest() {
        this.input = "2\n" +
                "1000 10000 8\n" +
                "50 100 25";
        this.output = "30 4";
    }

    @Test
    public void main() throws Exception {
        SavingsCalculator.main(null);
        check();
    }

}