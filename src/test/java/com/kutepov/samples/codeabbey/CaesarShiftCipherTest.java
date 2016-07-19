package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class CaesarShiftCipherTest extends BaseTest {

    public CaesarShiftCipherTest() {
        this.input = "2 3\n" +
                "YHQL YLGL YLFL.\n" +
                "HYHQ BRX EUXWXV.";
        this.output = "VENI VIDI VICI. EVEN YOU BRUTUS.";
    }

    @Test
    public void main() throws Exception {
        CaesarShiftCipher.main(null);
        check();
    }

}