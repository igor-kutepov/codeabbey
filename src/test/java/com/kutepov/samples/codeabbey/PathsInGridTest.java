package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class PathsInGridTest extends BaseTest {

    public PathsInGridTest() {
        this.input = "6 5\n" +
                "@ + + + +\n" +
                "+ + + X X\n" +
                "+ X + + +\n" +
                "+ + + X +\n" +
                "+ X + + X\n" +
                "+ + + + $";
        this.output = "9";
    }

    @Test
    public void main() throws Exception {
        PathsInGrid.main(null);
        check();
    }

}