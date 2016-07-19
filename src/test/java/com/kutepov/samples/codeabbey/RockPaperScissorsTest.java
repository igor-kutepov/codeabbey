package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class RockPaperScissorsTest extends BaseTest {

    public RockPaperScissorsTest() {
        this.input = "3\n" +
                "SS PR\n" +
                "PR RS PS PP SP\n" +
                "PS RR PS RP";
        this.output = "1 1 2";
    }

    @Test
    public void main() throws Exception {
        RockPaperScissors.main(null);
        check();
    }

}