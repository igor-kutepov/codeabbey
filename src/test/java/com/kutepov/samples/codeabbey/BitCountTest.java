package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class BitCountTest extends BaseTest {

    public BitCountTest() {
        this.input = "3\n" +
                "1 100 -1";
        this.output = "1 3 32";
    }

    @Test
    public void main() throws Exception {
        BitCount.main(null);
        check();
    }
}