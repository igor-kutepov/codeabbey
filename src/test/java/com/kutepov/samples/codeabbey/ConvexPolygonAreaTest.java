package com.kutepov.samples.codeabbey;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConvexPolygonAreaTest extends BaseTest {

    public ConvexPolygonAreaTest() {
        this.input = "5\n" +
                "51 9\n" +
                "77 10\n" +
                "92 71\n" +
                "62 84\n" +
                "29 94";
        this.output = "3274.5";
    }

    @Test
    public void main() throws Exception {
        ConvexPolygonArea.main(null);
        check();
    }

}