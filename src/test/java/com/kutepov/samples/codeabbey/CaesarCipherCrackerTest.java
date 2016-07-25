package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class CaesarCipherCrackerTest extends BaseTest {

    @SuppressWarnings("SpellCheckingInspection")
    public CaesarCipherCrackerTest() {
        this.input = "2\n" +
                "XIP DBSFT PG ESFBNT\n" +
                "VJQWIJ KV OCMGU VJKPIU XGTA SWGGT";
        this.output = "WHO CARES OF 1 THOUGH IT MAKES 2";
    }

    @Test
    public void main() throws Exception {
        CaesarCipherCracker.main(null);
        check();
    }

}