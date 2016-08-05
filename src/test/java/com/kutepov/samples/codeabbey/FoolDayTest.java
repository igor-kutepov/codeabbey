package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class FoolDayTest extends BaseTest {

    public FoolDayTest() {
        this.input = "5\n" +
                "1 2\n" +
                "1 2 3\n" +
                "2 3 4\n" +
                "2 4 6 8 10\n" +
                "7 11 19";
        this.output = "5 14 29 220 531";
    }

    @Test
    public void main() throws Exception {
        FoolDay.main(null);
        check();
    }

}