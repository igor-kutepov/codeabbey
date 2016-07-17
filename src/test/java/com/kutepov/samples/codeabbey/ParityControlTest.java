package com.kutepov.samples.codeabbey;

import org.junit.Test;

/**
 * @author Igor Kutepov
 */
public class ParityControlTest extends BaseTest {


    public ParityControlTest() {
        this.input = "65 238 236 225 46";
        this.output = "Ana.";
    }

    @Test
    public void main() throws Exception {
        ParityControl.main(null);
        check();
    }

}