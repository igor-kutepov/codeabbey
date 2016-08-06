package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class GradientCalculationTest extends BaseTest {

    public GradientCalculationTest() {
        this.input = "14 -0.5 -0.4 7\n" +
                "0.3 0.2\n" +
                "0.4 -0.5\n" +
                "-0.7 0.1\n" +
                "-0.7 -0.7\n" +
                "0.3 0\n" +
                "0.6 -0.5\n" +
                "-1 -0.7\n" +
                "-0.8 0.8\n" +
                "-0.2 0.9\n" +
                "0.1 -0.4\n" +
                "0.4 -0.6\n" +
                "0.6 -0.5\n" +
                "-0.2 0.8\n" +
                "-0.8 0.2";
        this.output = "222 246 211 212 234 254 19 214 172 234 244 254 175 213";
    }

    @Test
    public void main() throws Exception {
        GradientCalculation.main(null);
        check();
    }

}