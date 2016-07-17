package com.kutepov.samples.codeabbey;

import org.junit.Test;

/**
 * @author Igor Kutepov
 */
public class GreaterCommonDivisorTest extends BaseTest {

    public GreaterCommonDivisorTest() {
        this.input = "2\n" +
                "2 3\n" +
                "4 10";
        this.output = "(1 6) (2 20)";
    }

    @Test
    public void main() throws Exception {
        GreaterCommonDivisor.main(null);
        check();
    }

}