package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class CyclesDetectionTest extends BaseTest {

    public CyclesDetectionTest() {
        this.input = "29\n" +
                "14 I-S C-I G-I J-G D-C H-G B-G U-I E-D T-D M-E L-J Y-D K-C\n" +
                "21 U-L H-U I-U Z-U A-L V-L K-U J-I B-K G-U Q-I T-Q M-J Y-I O-Z D-G S-H N-U C-J F-C X-J\n" +
                "20 W-X O-X M-O E-W V-O S-W G-E A-E U-G Z-V D-Z B-S N-U P-O R-S C-G I-B H-Z Y-E K-A\n" +
                "23 B-A T-A U-A L-B X-A V-U R-T W-L O-U I-W H-L K-A E-T P-A M-R G-R Q-A S-P F-A C-H D-W Y-L S-A\n" +
                "19 O-M F-M P-O X-M R-F Y-F Q-M N-M T-P G-F W-Y J-R I-Y S-X U-J V-W K-G Z-G A-G\n" +
                "18 X-J G-J P-J H-J I-G E-G Z-E V-H S-H K-S L-K N-K U-P W-H O-E T-I C-X J-X\n" +
                "13 Q-M C-M A-C P-Q D-Q X-M U-C Z-A E-U O-Z L-O R-E B-Q\n" +
                "12 L-X G-L Z-X N-X S-N Y-G J-X K-X D-Z E-G B-G L-G\n" +
                "7 L-A Z-A U-L M-L C-Z D-A Z-C\n" +
                "15 T-S H-S N-H F-S O-S D-T K-N Q-D Y-D B-S G-Y L-G W-T Z-B U-H\n" +
                "19 X-F U-F N-X O-F T-O J-U L-U G-U A-J M-G S-L Z-U H-O K-F W-S V-N D-G C-D S-V\n" +
                "15 L-N Y-N R-N H-R O-H J-O B-Y F-O E-J U-Y Z-F A-R P-N Q-Y U-Y\n" +
                "17 B-O F-B G-O X-F W-X Q-X I-B Y-Q K-G P-I J-I R-F L-F H-X C-G N-O W-B\n" +
                "10 B-R P-B H-B Q-R G-H L-R N-R E-R M-Q S-G\n" +
                "17 Q-H I-Q C-H Z-I L-H W-H A-W P-I S-Z N-A J-W M-Z R-I V-A U-W B-Q X-A\n" +
                "7 W-O T-O U-O G-U A-G J-A O-U\n" +
                "18 A-O G-A L-A V-G W-O Z-O C-L F-A Q-F S-V E-Z H-A K-A N-K R-S X-E J-C Y-W\n" +
                "22 X-T D-X U-X J-D L-U G-D R-J E-J H-R C-X V-C M-L N-X O-U Q-M Z-C W-J Y-Q K-O B-N S-V U-W\n" +
                "18 D-J Q-J K-D P-D G-D I-G Z-J C-I X-D E-K M-J T-P Y-J S-M B-Y H-I O-G Z-G\n" +
                "13 X-F Y-X L-F V-Y C-V A-V Q-X P-X J-C M-X G-A S-C Q-Y\n" +
                "16 F-Y T-F D-F P-T A-P X-A H-T K-D O-P Z-A I-P U-Y L-T J-Z Q-U R-Z\n" +
                "6 S-B G-B M-G E-S Y-G K-Y\n" +
                "11 J-N G-J R-G S-G E-N C-R F-J O-N B-O K-S L-O\n" +
                "13 F-M G-F C-G O-G S-O P-S R-C W-O Y-M J-F D-M Z-D A-F\n" +
                "20 Z-E L-Z G-L X-E K-X A-X F-A O-K Y-K V-Z Q-K P-F J-F D-K C-L W-P N-L R-W M-X O-G\n" +
                "19 I-Y N-Y L-I P-N A-I Z-A V-I X-I R-P H-R Q-H T-H W-A S-A G-L K-R U-H M-Q H-U\n" +
                "19 I-M S-M Y-I E-M H-I D-E J-I A-D V-S U-H P-S K-H B-S F-H W-H G-M L-V Q-B Q-I\n" +
                "21 B-Q X-B J-B D-J G-Q Z-D Y-D R-Z U-Y K-Y I-J F-B L-F N-R P-X M-K O-Z T-U H-K V-K L-U\n" +
                "22 G-S U-G Z-G W-G I-G C-Z F-W D-C N-W K-F P-D H-F M-K O-P Y-P A-Z T-Y V-Y X-D Q-P J-T S-Z";
        this.output = "0 0 0 1 0 1 0 1 1 0 1 1 1 0 0 1 0 1 1 1 0 0 0 0 1 1 1 1 1";
    }

    @Test
    public void main() throws Exception {
        CyclesDetection.main(null);
        check();
    }

}