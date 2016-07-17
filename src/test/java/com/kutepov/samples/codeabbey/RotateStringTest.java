package com.kutepov.samples.codeabbey;

import org.junit.Test;

/**
 * @author Igor Kutepov
 */
public class RotateStringTest extends BaseTest {

    public RotateStringTest() {
        this.input = "13\n" +
                "-1 cziofuzaioolnubyfa\n" +
                "4 tmannuvoqaqjimpffjdafpnzq\n" +
                "-5 qciepireuhlnhuwqif\n" +
                "2 youhooyjnezqmeyvoerw\n" +
                "2 evnmodakuiieemenzbgjnejct\n" +
                "5 ptgtiuadxonudmyiyv\n" +
                "4 uudbfgumaeonepwyqaqlie\n" +
                "4 ynsoyilommbtannijocyrail\n" +
                "-5 qeinuvykuivqvbricivah\n" +
                "-4 cejojeczbkgiygi\n" +
                "5 edyvmcucdutguvegendghfqne\n" +
                "-1 eckjgkysntuqqhxneot\n" +
                "-7 hqeyibirontzwzdvmqjabzi";
        this.output = "acziofuzaioolnubyf nuvoqaqjimpffjdafpnzqtman uwqifqciepireuhlnh uhooyjnezqmeyvoerwyo nmodakuiieemenzbgjnejctev uadxonudmyiyvptgti fgumaeonepwyqaqlieuudb yilommbtannijocyrailynso civahqeinuvykuivqvbri iygicejojeczbkg cucdutguvegendghfqneedyvm teckjgkysntuqqhxneo mqjabzihqeyibirontzwzdv";
    }

    @Test
    public void main() throws Exception {
        RotateString.main(null);
        check();

    }

}