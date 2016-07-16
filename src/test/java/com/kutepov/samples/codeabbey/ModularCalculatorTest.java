package com.kutepov.samples.codeabbey;

import org.junit.Test;

/**
 * @author Igor Kutepov
 */
public class ModularCalculatorTest extends BaseTest {

    public ModularCalculatorTest() {
        this.input = "5\n" +
                "+ 3\n" +
                "* 7\n" +
                "+ 10\n" +
                "* 2\n" +
                "* 3\n" +
                "+ 1\n" +
                "% 11";
        this.output = "1";
    }

    @Test
    public void main() throws Exception {
        ModularCalculator.main(null);
        check();
    }

}