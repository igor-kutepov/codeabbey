package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class BinaryHeapTest extends BaseTest {

    public BinaryHeapTest() {
        this.input = "13\n" +
                "3 9 6 5 7 1 11 2 0 10 4 8 0";
        this.output = "3 4 6 5 7 8 11 10 9";
    }

    @Test
    public void main() throws Exception {
        BinaryHeap.main(null);
        check();
    }

}