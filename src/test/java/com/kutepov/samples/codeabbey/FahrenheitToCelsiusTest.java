package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class FahrenheitToCelsiusTest extends BaseTest {

    public FahrenheitToCelsiusTest() {
        this.input = "5 495 353 168 -39 22";
        this.output = "257 178 76 -39 -6";
    }

    @Test
    public void main() throws Exception {
        FahrenheitToCelsius.main(null);
        check();
    }

}