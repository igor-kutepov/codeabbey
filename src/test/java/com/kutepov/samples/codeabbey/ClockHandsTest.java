package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class ClockHandsTest extends BaseTest {

    public ClockHandsTest() {
        this.input = "3\n" +
                "12:00 15:00 9:30";
        this.output = "10.0 16.0 10.0 19.0 16.0 10.0 10.0 19.0 4.20444504 11.55291427 10.0 1.0";
    }

    @Test
    public void main() throws Exception {
        ClockHands.main(null);
        check();
    }

}