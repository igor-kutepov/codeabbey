package com.kutepov.samples.codeabbey;

import org.junit.Test;

/**
 * @author Igor Kutepov
 */
public class ArrayCountersTest extends BaseTest {

    public ArrayCountersTest() {
        this.input = "10 3\n" +
                "3 2 1 2 3 1 1 1 1 3";
        this.output = "5 2 3";
    }


    @Test
    public void main() throws Exception {
        ArrayCounters.main(null);
        check();
    }

}