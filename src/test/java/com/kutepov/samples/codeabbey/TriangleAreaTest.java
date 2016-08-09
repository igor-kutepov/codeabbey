package com.kutepov.samples.codeabbey;

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleAreaTest extends BaseTest {

    public TriangleAreaTest() {
        this.input = "3\n" +
                "1 3 9 5 6 0\n" +
                "1 0 0 1 10000 10000\n" +
                "7886 5954 9953 2425 6250 2108";
        this.output = "17.0 9999.5 6861563.0";
    }

    @Test
    public void main() throws Exception {
        TriangleArea.main(null);
        check();
    }

}