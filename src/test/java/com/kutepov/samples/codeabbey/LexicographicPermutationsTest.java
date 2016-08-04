package com.kutepov.samples.codeabbey;

import org.junit.Test;

@SuppressWarnings("SpellCheckingInspection")
public class LexicographicPermutationsTest extends BaseTest {


    public LexicographicPermutationsTest() {
        this.input = "19\n" +
                "292605621\n" +
                "181737488\n" +
                "472144980\n" +
                "164384063\n" +
                "258093938\n" +
                "230361611\n" +
                "3466794\n" +
                "207006418\n" +
                "329803711\n" +
                "228244516\n" +
                "269539368\n" +
                "416064428\n" +
                "22456266\n" +
                "130389862\n" +
                "22980949\n" +
                "31744927\n" +
                "116211041\n" +
                "177410863\n" +
                "280095254";
        this.output = "HDIEAJKBLFGC EHAKFBDCIJGL LJBAKFIEGCDH EBDLKJCAIHGF GFBDCAKLEIHJ FJEKCHIADLGB ABLGKIJHFCDE FCAHBJLGEKDI ICKJGBHDEALF FIKLHEBGAJCD GJCKABEHDFIL KEHGAFCILDBJ AHCKLGDFJBEI DCLEKABFJIGH AHEDLIKJFBGC AJIFDHCBGELK CLAEDJFGIKHB EFKLAGJICBHD HACKJFDBIGEL";
    }

    @Test
    public void main() throws Exception {
        LexicographicPermutations.main(null);
        check();
    }

}