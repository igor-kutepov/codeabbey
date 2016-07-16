package com.kutepov.samples.codeabbey;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class SumOfDigitsTest {

    private String input = "11\n" +
            "395 161 128\n" +
            "151 169 141\n" +
            "198 294 137\n" +
            "96 139 82\n" +
            "399 103 112\n" +
            "252 274 195\n" +
            "100 24 24\n" +
            "49 213 191\n" +
            "48 273 30\n" +
            "330 10 91\n" +
            "68 7 198";


    @Test
    public void main() throws Exception {

        InputStream is = System.in;
        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            SumOfDigits.main(null);
        } finally {
            System.setIn(is);
        }

    }

}