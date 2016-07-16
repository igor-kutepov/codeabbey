package com.kutepov.samples.codeabbey;

import org.junit.Test;

/**
 * @author Igor Kutepov
 */
public class TwoPrintersTest extends BaseTest {

    public TwoPrintersTest() {
        this.input = "16\n" +
                "44639 22047 22170\n" +
                "11 10 74668189\n" +
                "58587755 118370892 6\n" +
                "1288146 1126864 645\n" +
                "63097494 1358850 9\n" +
                "10956469 62360735 10\n" +
                "1283706 18622649 53\n" +
                "1 1 601036622\n" +
                "55 44 16044378\n" +
                "1 1 713205609\n" +
                "77238758 46046014 9\n" +
                "26847 86456 5261\n" +
                "657854 520551 710\n" +
                "1723 1336 576642\n" +
                "252453271 331204348 3\n" +
                "412 523 928157";
        this.output = "327199527 391119090 236741784 387731946 12229650 98608221 64185300 300518311 392195925 356602805 276276084 107790705 206566156 433928935 504906542 213899155";
    }

    @Test
    public void main() throws Exception {
        TwoPrinters.main(null);
        check();
    }

}