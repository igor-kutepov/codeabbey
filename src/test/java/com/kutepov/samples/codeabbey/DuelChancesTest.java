package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class DuelChancesTest extends BaseTest {

    public DuelChancesTest() {
        this.input = "2\n" +
                "30 50\n" +
                "20 15";
        this.output = "46 63";
    }

    @Test
    public void main() throws Exception {
        DuelChances.main(null);
        check();
    }

}