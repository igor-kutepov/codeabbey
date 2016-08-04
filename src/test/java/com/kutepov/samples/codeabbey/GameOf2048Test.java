package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class GameOf2048Test extends BaseTest {

    public GameOf2048Test() {
        this.input = "2 2 4 2\n" +
                "4 2 2 4\n" +
                "2 2 2 2\n" +
                "2 4 2 2\n" +
                "D R D L U";
        this.output = "0 2 2 1";
    }

    @Test
    public void main() throws Exception {
        GameOf2048.main(null);
        check();
    }

}