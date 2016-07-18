package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class CodeGuesserTest extends BaseTest {

    public CodeGuesserTest() {
        this.input = "21\n" +
                "7955 1\n" +
                "9473 0\n" +
                "8818 0\n" +
                "4558 0\n" +
                "5701 0\n" +
                "1916 0\n" +
                "2339 0\n" +
                "5913 0\n" +
                "8788 0\n" +
                "2620 0\n" +
                "5499 0\n" +
                "0485 0\n" +
                "2873 0\n" +
                "7900 1\n" +
                "2398 0\n" +
                "2011 0\n" +
                "8000 0\n" +
                "7312 2\n" +
                "7018 1\n" +
                "5948 0\n" +
                "8116 0";
        this.output = "7262";
    }

    @Test
    public void main() throws Exception {
        CodeGuesser.main(null);
        check();
    }

}