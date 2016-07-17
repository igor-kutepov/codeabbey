package com.kutepov.samples.codeabbey;

import org.junit.Test;

/**
 * @author Igor Kutepov
 */
public class SortWithIndexesTest extends BaseTest {

    public SortWithIndexesTest() {
        this.input = "4\n" +
                "50 98 17 79";
        this.output = "3 1 4 2";
    }

    @Test
    public void main() throws Exception {
        SortWithIndexes.main(null);
        check();
    }

}