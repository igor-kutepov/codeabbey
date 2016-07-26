package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class BicycleRaceTest extends BaseTest {

    public BicycleRaceTest() {
        this.input = "2\n" +
                "10 1 1\n" +
                "20 1 2";
        this.output = "5 6.66666667";
    }

    @Test
    public void main() throws Exception {
        BicycleRace.main(null);
        check();
    }

}