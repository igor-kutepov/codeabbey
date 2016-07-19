package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class CollatzSequenceTest extends BaseTest {

    public CollatzSequenceTest() {
        this.input = "3\n" +
                "2 15 97";
        this.output = "1 17 118";
    }

    @Test
    public void main() throws Exception {
        CollatzSequence.main(null);
        check();
    }

}