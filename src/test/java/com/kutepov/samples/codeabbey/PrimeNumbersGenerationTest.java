package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class PrimeNumbersGenerationTest extends BaseTest {

    public PrimeNumbersGenerationTest() {
        this.input = "4\n" +
                "7 1 199999 4";
        this.output = "17 2 2750131 7";
    }

    @Test
    public void main() throws Exception {

        PrimeNumbersGeneration.main(null);
        check();
    }

}