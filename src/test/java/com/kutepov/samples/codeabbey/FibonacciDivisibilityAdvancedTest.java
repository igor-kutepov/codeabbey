package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class FibonacciDivisibilityAdvancedTest extends BaseTest {

    public FibonacciDivisibilityAdvancedTest() {
        this.input = "2\n" +
                "233328 433156";
        this.output = "1620 282";
    }

    @Test
    public void main() throws Exception {
        FibonacciDivisibilityAdvanced.main(null);
        check();
    }

}