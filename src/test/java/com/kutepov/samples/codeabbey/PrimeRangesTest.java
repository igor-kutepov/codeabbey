package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class PrimeRangesTest extends BaseTest {

    public PrimeRangesTest() {
        this.input = " 3\n" +
                " 5 19\n" +
                " 11 29\n" +
                " 2 23";
        this.output = "6 6 9";
    }

    @Test
    public void main() throws Exception {
        PrimeRanges.main(null);
        check();
    }

}