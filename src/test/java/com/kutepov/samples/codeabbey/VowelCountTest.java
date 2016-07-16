package com.kutepov.samples.codeabbey;

import org.junit.Test;

/**
 * @author Igor Kutepov
 */
public class VowelCountTest extends BaseTest {

    public VowelCountTest() {
        this.input = "4\n" +
                "abracadabra\n" +
                "pear tree\n" +
                "o a kak ushakov lil vo kashu kakao\n" +
                "my pyx";
        this.output = "5 4 13 2";
    }

    @Test
    public void main() throws Exception {
        VowelCount.main(null);
        check();
    }

}