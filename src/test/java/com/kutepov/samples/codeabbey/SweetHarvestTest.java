package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class SweetHarvestTest extends BaseTest {

    public SweetHarvestTest() {
        this.input = "2\n" +
                "11 5 3 17 2 13 19 7\n" +
                "9 7 12 7 16 3 7 17 14 13 4 6 11 6 3 3 5 4 11 3 15 12 14 2 15 19 11 12";
        this.output = "48 157";
    }

    @Test
    public void main() throws Exception {
        SweetHarvest.main(null);
        check();
    }

}