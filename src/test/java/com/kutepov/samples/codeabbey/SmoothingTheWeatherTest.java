package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class SmoothingTheWeatherTest extends BaseTest {

    public SmoothingTheWeatherTest() {
        this.input = "7\n" +
                "32.6 31.2 35.2 37.4 44.9 42.1 44.1";
        this.output = "32.6 33.0 34.6 39.166666666666664 41.46666666666667 43.699999999999996 44.1";
    }

    @Test
    public void main() throws Exception {
        SmoothingTheWeather.main(null);
        check();
    }

}