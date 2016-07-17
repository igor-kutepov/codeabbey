package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class BinarySearchTest extends BaseTest {

    public BinarySearchTest() {
        this.input = "2\n" +
                "0.59912051 0.64030348 263.33721367 387.92069617\n" +
                "15.68387514 1.26222280 695.23706506 698.72384731";
        this.output = "73.5953685 41.8991749";
    }

    @Test
    public void main() throws Exception {
        BinarySearch.main(null);
        check();
    }

}