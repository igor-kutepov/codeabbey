package com.kutepov.samples.codeabbey;

import org.junit.Test;

/**
 * @author Igor Kutepov
 */
public class ArrayChecksumTest extends BaseTest {

    public ArrayChecksumTest() {
        this.input = "6\n" +
                "3 1 4 1 5 9";
        this.output = "8921379";
    }

    @Test
    public void main() throws Exception {
        ArrayChecksum.main(null);
        check();
    }

}