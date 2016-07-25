package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class TransitiveClosureOnCandyStatesTest extends BaseTest {

    public TransitiveClosureOnCandyStatesTest() {
        this.input = "11\n" +
                "Cowsome - Honepy\n" +
                "Bawnty - Cowsome\n" +
                "Lacry - Bawnty\n" +
                "Honepy - Maycorn\n" +
                "Maycorn - Bawnty\n" +
                "Mikliday - Cowsome\n" +
                "Mausse - Lednec\n" +
                "Maycorn - Mausse\n" +
                "Bawnty - Mausse\n" +
                "Mikliday - Maycorn\n" +
                "Lednec - Maycorn\n" +
                "6\n" +
                "Cowsome - Mausse\n" +
                "Lacry - Honepy\n" +
                "Bawnty - Honepy\n" +
                "Mikliday - Mausse\n" +
                "Honepy - Lednec\n" +
                "Mikliday - Lacry";

        this.output = "2 3 2 2 2 3";
    }

    @Test
    public void main() throws Exception {
        TransitiveClosureOnCandyStates.main(null);
        check();
    }

}