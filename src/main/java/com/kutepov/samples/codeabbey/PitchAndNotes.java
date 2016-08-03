package com.kutepov.samples.codeabbey;

import java.util.Scanner;

public class PitchAndNotes {

    private static final String[] NOTES = {"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B"};
    private static final double BASE_FREQUENCY = 440 / Math.pow(2, (3 + 10 / 12.0));

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.nextLine();

        String notes[] = input.nextLine().split(" ");
        for (String note : notes) {
            String[] tokens = note.replaceAll("([A-G]{1}#?)(\\d)", "$1 $2").split(" ");
            for (int j = 0; j < NOTES.length; j++) {
                if (NOTES[j].equals(tokens[0])) {
                    double noteIndex = j + 1;
                    int octave = Integer.valueOf(tokens[1]);
                    int freq = (int) Math.round(BASE_FREQUENCY * Math.pow(2, octave - 1 + noteIndex / 12));

                    System.out.print(freq + " ");
                    break;
                }
            }
        }

    }
}
