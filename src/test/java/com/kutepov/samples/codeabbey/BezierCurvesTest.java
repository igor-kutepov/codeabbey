package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class BezierCurvesTest extends BaseTest {

    public BezierCurvesTest() {
        this.input = "4 10\n" +
                "0 180\n" +
                "90 0\n" +
                "180 120\n" +
                "270 60";
        this.output = "0 180 30 130 60 99 90 82 120 76 150 75 180 78 210 79 240 74 270 60";
    }

    @Test
    public void main() throws Exception {
        BezierCurves.main(null);
        check();
    }

}