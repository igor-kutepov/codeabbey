package com.kutepov.samples.codeabbey;

import org.junit.Test;

/**
 * @author Igor Kutepov
 */

public class ModuloAndTimeDifferenceTest extends BaseTest {

    public ModuloAndTimeDifferenceTest() {
        this.input = "3\n" +
                "1 0 0 0 2 3 4 5\n" +
                "5 3 23 22 24 4 20 45\n" +
                "8 4 6 47 9 11 51 13";
        this.output = "(1 3 4 5) (19 0 57 23) (1 7 44 26)";
    }

    @Test
    public void main() throws Exception {
        ModuloAndTimeDifference.main(null);

        check();
    }

}