package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class CardsShufflingTest extends BaseTest {

    public CardsShufflingTest() {
        this.input = "5814 1316 2080 2712 0 647 8098 315 44 6354 7867 100 61 763 6731 685 42 9309 569 92 701 562\n" +
                "        85 8311 698 220 929 71 684 518 113 61 19 168 745 16 655 9548 6018 2686 25 785 81 721\n" +
                "        964 85 44 614 4 509 8708 19";
        this.output = "C5 D5 S4 C8 CQ S3 HK C9 H3 H6 D3 ST DT HT C6 CK DA H9 SJ SK DK C2 DQ S5 H4 D7 S7 S2 C4 D9 CT " +
                "HJ HQ D2 SA CA H5 H2 C7 D4 CJ D6 S9 HA S8 D8 S6 SQ C3 DJ H8 H7";
    }

    @Test
    public void main() throws Exception {
        CardsShuffling.main(null);
        check();
    }

}