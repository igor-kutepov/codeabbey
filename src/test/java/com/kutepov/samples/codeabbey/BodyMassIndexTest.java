package com.kutepov.samples.codeabbey;

import org.junit.Test;

/**
 * @author Igor Kutepov
 */
public class BodyMassIndexTest extends BaseTest {

    public BodyMassIndexTest() {
        this.input = "3\n" +
                "80 1.73\n" +
                "55 1.58\n" +
                "49 1.91\n";
        this.output = "over normal under";
    }

    @Test
    public void main() throws Exception {
        BodyMassIndex.main(null);
        check();
    }

}