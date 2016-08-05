package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class StarvingPriorityQueueTest extends BaseTest {

    public StarvingPriorityQueueTest() {
        this.input = "7 0";
        this.output = "7572";
    }

    @Test
    public void main() throws Exception {
        StarvingPriorityQueue.main(null);
        check();
    }

}