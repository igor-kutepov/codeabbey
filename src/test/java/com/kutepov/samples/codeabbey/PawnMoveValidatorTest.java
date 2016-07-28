package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class PawnMoveValidatorTest extends BaseTest {

    public PawnMoveValidatorTest() {
        this.input = "5\n" +
                "b2b3 b8c6 c2c4 c7c5\n" +
                "e2e4 g8f6 d1h5 f6h5\n" +
                "d2d4 e7e5 g1f3 e5d4 c2d4 d8e7\n" +
                "a2a3 h7h6 b2b4 g7g5 a3a4 h6g5\n" +
                "b1c3 b8c6 b2b4 b7b7";
        this.output = "4 0 5 6 4";
    }

    @Test
    public void main() throws Exception {
        PawnMoveValidator.main(null);
        check();
    }

}