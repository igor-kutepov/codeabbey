package com.kutepov.samples.codeabbey;

import org.junit.Test;

@SuppressWarnings("SpellCheckingInspection")
public class HexagonalGridTest extends BaseTest {

    public HexagonalGridTest() {
        this.input = "3\n" +
                "AABF\n" +
                "FEDCBA\n" +
                "BCB";
        this.output = "3.0 0.0 2.64575131";
    }

    @Test
    public void main() throws Exception {
        HexagonalGrid.main(null);
        check();
    }

}