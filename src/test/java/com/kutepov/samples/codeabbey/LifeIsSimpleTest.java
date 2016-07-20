package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class LifeIsSimpleTest extends BaseTest {

    public LifeIsSimpleTest() {
        this.input = "-------\n" +
                "---XX--\n" +
                "-XXX---\n" +
                "-------\n" +
                "-------";
        this.output = "6 5 3 2 0";
    }

    @Test
    public void main() throws Exception {
        LifeIsSimple.main(null);
        check();
    }

}