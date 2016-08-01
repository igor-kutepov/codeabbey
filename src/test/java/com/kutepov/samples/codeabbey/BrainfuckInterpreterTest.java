package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class BrainfuckInterpreterTest extends BaseTest {

    public BrainfuckInterpreterTest() {
        this.input = ";>;<[->+<]:>:\n" +
                "3 5";
        this.output = "0 8";
    }

    @Test
    public void main() throws Exception {
        BrainfuckInterpreter.main(null);
        check();
    }

}