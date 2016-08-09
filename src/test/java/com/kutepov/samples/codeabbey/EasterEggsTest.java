package com.kutepov.samples.codeabbey;

import org.junit.Test;

import static org.junit.Assert.*;

public class EasterEggsTest extends BaseTest {

    public EasterEggsTest() {
        this.input = "1 0 1 0 1 1\n" +
                "0: 0 5\n" +
                "1: 1 4\n" +
                "2: 2 4\n" +
                "3: 2 3 5\n" +
                "4: 1 4\n" +
                "5: 2 3 5";
        this.output = "0 2";
    }

    @Test
    public void main() throws Exception {
        EasterEggs.main(null);
        check();
    }

}