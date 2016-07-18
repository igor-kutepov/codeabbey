package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class QuadraticEquationTest extends BaseTest {

    public QuadraticEquationTest() {
        this.input = "15\n" +
                "9 -9 -108\n" +
                "2 30 108\n" +
                "9 90 81\n" +
                "1 8 65\n" +
                "4 -72 328\n" +
                "8 120 400\n" +
                "5 80 365\n" +
                "1 -18 80\n" +
                "4 -24 180\n" +
                "2 8 -120\n" +
                "4 64 356\n" +
                "6 96 984\n" +
                "5 -90 450\n" +
                "9 72 369\n" +
                "5 -50 250";
        this.output = "4 -3; -6 -9; -1 -9; -4+7i -4-7i; 9+1i 9-1i; -5 -10; -8+3i -8-3i; 10 8; 3+6i 3-6i; 6 -10; -8+5i -8-5i; -8+10i -8-10i; 9+3i 9-3i; -4+5i -4-5i; 5+5i 5-5i";
    }

    @Test
    public void main() throws Exception {
        QuadraticEquation.main(null);
        check();
    }

}