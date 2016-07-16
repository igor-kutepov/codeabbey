package com.kutepov.samples.codeabbey;

import org.junit.Test;

/**
 * @author Igor Kutepov
 */
public class SquareRootTest extends BaseTest {

    public SquareRootTest() {
        this.input = "3\n" +
                "150 0\n" +
                "5 1\n" +
                "10 3";
        this.output = "1.0 3.0 3.196005";
    }

    @Test
    public void main() throws Exception {
        SquareRoot.main(null);
        check();
    }

}