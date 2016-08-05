package com.kutepov.samples.codeabbey;

import org.junit.Test;

public class SimpleLinearRegressionTest extends BaseTest {

    public SimpleLinearRegressionTest() {
        this.input = "1925 1947\n" +
                "1925: 89 257\n" +
                "1926: 75 226\n" +
                "1927: 83 235\n" +
                "1928: 52 173\n" +
                "1929: 148 332\n" +
                "1930: 109 268\n" +
                "1931: 129 306\n" +
                "1932: 115 289\n" +
                "1933: 102 265\n" +
                "1934: 99 269\n" +
                "1935: 50 228\n" +
                "1936: 102 265\n" +
                "1937: 91 256\n" +
                "1938: 79 238\n" +
                "1939: 118 298\n" +
                "1940: 134 311\n" +
                "1941: 61 155\n" +
                "1942: 146 340\n" +
                "1943: 108 274\n" +
                "1944: 96 242\n" +
                "1945: 89 232\n" +
                "1946: 143 328\n" +
                "1947: 133 303";
        this.output = "1.5405377931602005 107.31285427305951";
    }

    @Test
    public void main() throws Exception {
        SimpleLinearRegression.main(null);
        check();
    }

}