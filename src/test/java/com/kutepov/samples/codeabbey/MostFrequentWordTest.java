package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class MostFrequentWordTest extends BaseTest {

    @SuppressWarnings("SpellCheckingInspection")
    public MostFrequentWordTest() {
        this.input = "99658";
        this.output = "riguzi";
    }

    @Test
    public void main() throws Exception {
        MostFrequentWord.main(null);
        check();
    }

}