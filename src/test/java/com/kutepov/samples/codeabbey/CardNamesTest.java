package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class CardNamesTest extends BaseTest {

    public CardNamesTest() {
        this.input = "5\n" +
                "25 32 51 20 6";
        this.output = "Ace-of-Spades 8-of-Diamonds Ace-of-Hearts 9-of-Spades 8-of-Clubs";
    }

    @Test
    public void main() throws Exception {
        CardNames.main(null);
        check();
    }

}