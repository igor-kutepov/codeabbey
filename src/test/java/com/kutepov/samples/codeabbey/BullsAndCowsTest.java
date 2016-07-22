package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class BullsAndCowsTest extends BaseTest {

    public BullsAndCowsTest() {
        this.input = "1492 5\n" +
                "2013 1865 1234 4321 7491";
        this.output = "0-2 1-0 1-2 0-3 2-1";
    }

    @Test
    public void main() throws Exception {
        BullsAndCows.main(null);
        check();
    }

}