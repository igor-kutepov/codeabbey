package com.kutepov.samples.codeabbey;

import org.junit.After;
import org.junit.Before;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;

/**
 * @author Igor Kutepov
 */
public class BaseTest {

    protected String input = "";

    protected String output = "";

    protected ByteArrayOutputStream out;

    @Before
    public void setUp() throws Exception {
        out = new ByteArrayOutputStream();
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(out));
    }

    @After
    public void tearDown() throws Exception {
        System.setIn(null);
        System.setOut(null);
    }

    protected void check() throws Exception {
        String result = new String(out.toByteArray(), StandardCharsets.UTF_8).trim();
        assertEquals(output, result);

    }
}
