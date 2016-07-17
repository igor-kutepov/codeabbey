package com.kutepov.samples.codeabbey;

import org.junit.Test;

/**
 * @author Igor Kutepov
 */
public class LinearCongruentialGeneratorTest extends BaseTest {

    public LinearCongruentialGeneratorTest() {
        this.input = "2\n" +
                "3 7 12 1 2\n" +
                "2 3 15 8 10";
        this.output = "1 11";
    }

    @Test
    public void main() throws Exception {
        LinearCongruentialGenerator.main(null);
        check();
    }

}