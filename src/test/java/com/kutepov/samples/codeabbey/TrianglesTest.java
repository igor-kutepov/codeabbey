package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class TrianglesTest extends BaseTest {

    public TrianglesTest() {
        this.input = "2\n" +
                "3 4 5\n" +
                "1 2 4";
        this.output = "1 0";
    }

    @Test
    public void main() throws Exception {
        Triangles.main(null);
        check();
    }

}