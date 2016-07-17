package com.kutepov.samples.codeabbey;

import org.junit.Test;

/**
 * @author Igor Kutepov
 */
public class BubbleSortTest extends BaseTest {

    public BubbleSortTest() {
        this.input = "8\n" +
                "3 1 4 1 5 9 2 6";
        this.output = "5 8";
    }

    @Test
    public void main() throws Exception {
        BubbleSort.main(null);
        check();
    }

}