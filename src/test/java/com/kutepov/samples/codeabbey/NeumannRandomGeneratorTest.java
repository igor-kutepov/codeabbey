package com.kutepov.samples.codeabbey;

import org.junit.Test;

/**
 * @author Igor Kutepov
 */
public class NeumannRandomGeneratorTest extends BaseTest {

    public NeumannRandomGeneratorTest() {
        this.input = "3\n" +
                "0001 4100 5761";
        this.output = "2 4 88";
    }

    @Test
    public void main() throws Exception {
        NeumannRandomGenerator.main(null);
        check();
    }

}