package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class TravellingSalesmanTest extends BaseTest {

    public TravellingSalesmanTest() {
        this.input = "0 1:90 2:42 3:90 5:29 \n" +
                "1 0:90 3:98 2:70 4:65 \n" +
                "2 0:42 1:70 5:30 3:36 4:97 6:46 \n" +
                "3 1:98 2:36 0:90 5:77 \n" +
                "4 1:65 2:97 6:68 \n" +
                "5 2:30 3:77 0:29 6:90 \n" +
                "6 5:90 2:46 4:68 ";
        this.output = "0 5 3 2 6 4 1";
    }

    @Test
    public void main() throws Exception {
        TravellingSalesman.main(null);
        check();
    }

}