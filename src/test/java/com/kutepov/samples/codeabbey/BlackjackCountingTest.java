package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class BlackjackCountingTest extends BaseTest {

    public BlackjackCountingTest() {
        this.input = "4\n" +
                "A T\n" +
                "2 K 4\n" +
                "3 A Q 8\n" +
                "A 3 3 3 A\n";
        this.output = "21 16 Bust 21";
    }

    @Test
    public void main() throws Exception {
        BlackjackCounting.main(null);
        check();
    }

}