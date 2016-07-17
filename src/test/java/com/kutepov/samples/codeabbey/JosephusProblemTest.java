package com.kutepov.samples.codeabbey;

import org.junit.Test;

/**
 * @author Igor Kutepov
 */
public class JosephusProblemTest extends BaseTest {

    public JosephusProblemTest() {
        this.input = "10 3";
        this.output = "4";
    }

    @Test
    public void main() throws Exception {
        JosephusProblem.main(null);
        check();
    }

}