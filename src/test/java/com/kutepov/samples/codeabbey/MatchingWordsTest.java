package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class MatchingWordsTest extends BaseTest {

    public MatchingWordsTest() {
        this.input = "nun lam mip tex bal pif sot bal bod tex end";
        this.output = "bal tex";
    }

    @Test
    public void main() throws Exception {
        MatchingWords.main(null);
        check();
    }

}