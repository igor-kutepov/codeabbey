package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class DijkstraInTheNetworkTest extends BaseTest {

    public DijkstraInTheNetworkTest() {
        this.input = "10 0 1";
        this.output = "0 1 2 2 5 9 4 3 16 3";
    }

    @Test
    public void main() throws Exception {
        DijkstraInTheNetwork.main(null);
        check();
    }

}