package com.kutepov.samples.codeabbey;

import org.junit.Test;

/**
 * @author Igor Kutepov
 */
public class ReverseStringTest extends BaseTest {

    public ReverseStringTest() {
        this.input = "four score and seven years ago";
        this.output = "oga sraey neves dna erocs ruof";
    }

    @Test
    public void main() throws Exception {
        ReverseString.main(null);
        check();
    }

}