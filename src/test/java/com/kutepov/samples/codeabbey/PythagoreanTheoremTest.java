package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class PythagoreanTheoremTest extends BaseTest {

    public PythagoreanTheoremTest() {
        this.input = "3\n" +
                "6 8 9\n" +
                "9 12 15\n" +
                "16 12 22";
        this.output = "A R O";
    }

    @Test
    public void main() throws Exception {
        PythagoreanTheorem.main(null);
        check();
    }

}