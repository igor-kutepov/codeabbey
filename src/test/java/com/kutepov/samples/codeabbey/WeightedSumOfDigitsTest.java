package com.kutepov.samples.codeabbey;

import org.junit.Test;

/**
 * @author Igor Kutepov
 */
public class WeightedSumOfDigitsTest extends BaseTest {

    public WeightedSumOfDigitsTest() {
        this.input = "3\n" +
                "9 15 1776";
        this.output = "9 11 60";
    }

    @Test
    public void main() throws Exception {
        WeightedSumOfDigits.main(null);
        check();
    }

}