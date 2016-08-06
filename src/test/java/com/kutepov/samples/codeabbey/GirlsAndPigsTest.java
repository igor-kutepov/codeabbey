package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class GirlsAndPigsTest extends BaseTest {

    public GirlsAndPigsTest() {
        this.input = "4\n" +
                "6 10\n" +
                "26 136\n" +
                "106 336\n" +
                "200 500";
        this.output = "1 2 3 9";
    }

    @Test
    public void main() throws Exception {
        GirlsAndPigs.main(null);
        check();
    }

}