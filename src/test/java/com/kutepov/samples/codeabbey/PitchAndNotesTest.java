package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class PitchAndNotesTest extends BaseTest {

    public PitchAndNotesTest() {
        this.input = "22\n" +
                "G#4 F#1 G#2 A#1 E5 A4 A#3 E1 A3 A2 D#5 G#5 B2 A1 F2 D5 F4 C#3 D1 B3 F#2 C#5";
        this.output = "415 46 104 58 659 440 233 41 220 110 622 831 123 55 87 587 349 139 37 247 92 554";
    }

    @Test
    public void main() throws Exception {
        PitchAndNotes.main(null);
        check();
    }

}