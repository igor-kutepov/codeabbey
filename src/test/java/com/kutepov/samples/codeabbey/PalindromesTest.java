package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class PalindromesTest extends BaseTest {

    public PalindromesTest() {
        this.input = "3\n" +
                "Stars\n" +
                "O, a kak Uwakov lil vo kawu kakao!\n" +
                "Some men interpret nine memos";
        this.output = "N Y Y";
    }

    @Test
    public void main() throws Exception {
        Palindromes.main(null);
        check();
    }

}