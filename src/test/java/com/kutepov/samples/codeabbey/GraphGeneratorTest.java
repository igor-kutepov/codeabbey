package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class GraphGeneratorTest extends BaseTest {

    public GraphGeneratorTest() {
        this.input = "10 0";
        this.output = "4 21 4 12 8 26 2 28 7 20";
    }

    @Test
    public void main() throws Exception {
        GraphGenerator.main(null);
        check();
    }

}