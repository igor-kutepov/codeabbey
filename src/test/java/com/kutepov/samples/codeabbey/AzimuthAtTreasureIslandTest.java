package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class AzimuthAtTreasureIslandTest extends BaseTest {

    public AzimuthAtTreasureIslandTest() {
        this.input = "Stand at the pole with the plaque START\n" +
                "go 140 feet by azimuth 332\n" +
                "go 460 feet by azimuth 78\n" +
                "Dig here!";
        this.output = "384 219";
    }

    @Test
    public void main() throws Exception {
        AzimuthAtTreasureIsland.main(null);
        check();
    }

}