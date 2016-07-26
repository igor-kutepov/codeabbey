package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class FunnyWordsGeneratorTest extends BaseTest {

    @SuppressWarnings("SpellCheckingInspection")
    public FunnyWordsGeneratorTest() {
        this.input = "3 0\n" +
                "4 5 6";
        this.output = "fami wovaw kelasi";
    }

    @Test
    public void main() throws Exception {
        FunnyWordsGenerator.main(null);
        check();
    }

}