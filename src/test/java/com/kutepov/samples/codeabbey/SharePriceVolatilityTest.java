package com.kutepov.samples.codeabbey;

import org.junit.Test;

@SuppressWarnings("SpellCheckingInspection")
public class SharePriceVolatilityTest extends BaseTest {

    public SharePriceVolatilityTest() {
        this.input = "2\n" +
                "JOOG 99 99 99 99 99 99 99 101 101 101 101 101 101 101\n" +
                "GOLD 95 105 95 105 95 105 95 105 95 105 95 105 95 105";
        this.output = "GOLD";
    }

    @Test
    public void main() throws Exception {
        SharePriceVolatility.main(null);
        check();
    }

}