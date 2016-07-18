package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class MortgageCalculatorTest extends BaseTest {

    public MortgageCalculatorTest() {
        this.input = "800000 6 103";
        this.output = "9957";
    }

    @Test
    public void main() throws Exception {
        MortgageCalculator.main(null);
        check();
    }

}