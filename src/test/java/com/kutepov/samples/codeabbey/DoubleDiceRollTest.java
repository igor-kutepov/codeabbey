package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class DoubleDiceRollTest extends BaseTest {

    public DoubleDiceRollTest() {
        this.input = "7\n" +
                "193170145 1912748246\n" +
                "753156389 614113621\n" +
                "1824520917 53700559\n" +
                "1288077384 911939603\n" +
                "1939066598 1695763253\n" +
                "1905581606 1811712139\n" +
                "878644967 1090885451";
        this.output = "5 8 6 7 9 5 12";
    }

    @Test
    public void main() throws Exception {
        DoubleDiceRoll.main(null);
        check();
    }

}