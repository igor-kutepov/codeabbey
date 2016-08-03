package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class InstrumentTunerTest extends BaseTest {

    public InstrumentTunerTest() {
        this.input = "16\n" +
                "185.4 115.3 203.9 55.2 52.7 86.6 932.3 229.8 61.8 66.1 363.7 771.4 594.4 48.2 102.6 222.4";
        this.output = "F#3 A#2 G#3 A1 G#1 F2 A#5 A#3 B1 C2 F#4 G5 D5 G1 G#2 A3";
    }

    @Test
    public void main() throws Exception {
        InstrumentTuner.main(null);
        check();
    }

}