package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class PythagoreanTriplesTest extends BaseTest {

    public PythagoreanTriplesTest() {
        this.input = "2\n" +
                "12\n" +
                "30";
        this.output = "25 169";
    }

    @Test
    public void main() throws Exception {
        PythagoreanTriples.main(null);
        check();
    }

}