package com.kutepov.samples.codeabbey;

import java.util.Locale;
import java.util.Scanner;

public class InstrumentTuner {

    private static final String[] NOTES = {"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B"};
    private static final double BASE_FREQUENCY = 440 / Math.pow(2, (3 + 10 / 12.0));


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        int size = input.nextInt();
        for (; size > 0; size--) {
            double freq = input.nextDouble();

            double pow = Math.log(freq / BASE_FREQUENCY) / Math.log(2);
            int octave = (int) Math.floor(pow);
            double notePart = (pow - octave) * 12;
            //find a note closest to the original frequency
            int note = (int) Math.round(notePart);
            //normalize values (if note is 0 - means last note in previous octave and don't increase octave)
            if (note == 0)
                note = 12;
            else
                octave++;

            System.out.print(NOTES[--note] + octave + " ");
        }
    }
}
