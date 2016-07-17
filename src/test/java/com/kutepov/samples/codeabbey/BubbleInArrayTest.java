package com.kutepov.samples.codeabbey;

import org.junit.Test;

/**
 * @author Igor Kutepov
 */
public class BubbleInArrayTest extends BaseTest {

    public BubbleInArrayTest() {
        this.input = "1 4 3 2 6 5 -1";
        this.output = "3 5242536";
    }

    @Test
    public void main() throws Exception {
        BubbleInArray.main(null);
        check();
    }

}