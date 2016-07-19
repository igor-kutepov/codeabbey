package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class DiceRollingTest extends BaseTest {

    public DiceRollingTest() {
        this.input = "6\n" +
                "0.59558786964\n" +
                "0.861037873663\n" +
                "0.385597702116\n" +
                "0.246237673331\n" +
                "0.808033385314\n" +
                "0.0544673665427";
        this.output = "4 6 3 2 5 1";
    }

    @Test
    public void main() throws Exception {
        DiceRolling.main(null);
        check();
    }

}