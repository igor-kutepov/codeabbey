package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class MinimumOfThreeTest extends BaseTest {

    public MinimumOfThreeTest() {
        this.input = "3\n" +
                "7 3 5\n" +
                "15 20 40\n" +
                "300 550 137";
        this.output = "3 15 137";
    }

    @Test
    public void main() throws Exception {
        MinimumOfThree.main(null);
        check();
    }

}