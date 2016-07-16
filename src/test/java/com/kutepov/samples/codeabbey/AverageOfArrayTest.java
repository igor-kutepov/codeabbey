package com.kutepov.samples.codeabbey;

import org.junit.Test;

/**
 * @author Igor Kutepov
 */
public class AverageOfArrayTest extends BaseTest {

    public AverageOfArrayTest() {
        this.input = "3\n" +
                "2 3 7 0\n" +
                "20 10 0\n" +
                "1 0";
        this.output = "4 15 1";
    }

    @Test
    public void main() throws Exception {
        AverageOfArray.main(null);
        check();
    }

}