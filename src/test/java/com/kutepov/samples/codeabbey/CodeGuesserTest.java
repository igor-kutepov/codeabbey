package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class CodeGuesserTest extends BaseTest {

    public CodeGuesserTest() {
        this.input = "15\n" +
                "6460 0\n" +
                "1881 0\n" +
                "4602 1\n" +
                "5771 0\n" +
                "6827 0\n" +
                "6001 0\n" +
                "7522 1\n" +
                "0867 0\n" +
                "2384 1\n" +
                "1655 1\n" +
                "3689 0\n" +
                "3600 0\n" +
                "5381 0\n" +
                "3931 0\n" +
                "4634 2";
        this.output = "4554";
    }

    @Test
    public void main() throws Exception {
        CodeGuesser.main(null);
        check();
    }

}