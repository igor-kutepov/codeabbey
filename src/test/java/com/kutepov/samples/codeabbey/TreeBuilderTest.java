package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class TreeBuilderTest extends BaseTest {

    public TreeBuilderTest() {
        this.input = "5\n" +
                "3 5 4 2 8";
        this.output = "((-,2,-),3,((-,4,-),5,(-,8,-)))";
    }

    @Test
    public void main() throws Exception {
        TreeBuilder.main(null);
        check();
    }

}