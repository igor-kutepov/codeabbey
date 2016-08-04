package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class LinearFunctionTest extends BaseTest {

    public LinearFunctionTest() {
        this.input = "2\n" +
                "0 0 1 1\n" +
                "1 0 0 1";
        this.output = "(1 0) (-1 1)";
    }

    @Test
    public void main() throws Exception {
        LinearFunction.main(null);
        check();
    }

}