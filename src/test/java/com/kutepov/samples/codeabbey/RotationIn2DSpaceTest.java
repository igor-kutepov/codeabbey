package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class RotationIn2DSpaceTest extends BaseTest {

    public RotationIn2DSpaceTest() {
        this.input = "4 45\n" +
                "Deneb -10 10\n" +
                "Algol 10 10\n" +
                "Sirius -10 -10\n" +
                "Mira 10 -10";
        this.output = "Sirius Deneb Mira Algol";
    }

    @Test
    public void main() throws Exception {
        RotationIn2DSpace.main(null);
        check();
    }

}