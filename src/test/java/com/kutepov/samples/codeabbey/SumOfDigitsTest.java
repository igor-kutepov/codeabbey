package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class SumOfDigitsTest extends BaseTest {


    public SumOfDigitsTest() {
        this.input = "3\n" +
                "11 9 1\n" +
                "14 90 232\n" +
                "111 15 111";
        this.output = "1 16 21";
    }

    @Test
    public void main() throws Exception {

        SumOfDigits.main(null);

        check();
    }

}