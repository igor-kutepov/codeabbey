package com.kutepov.samples.codeabbey;

import java.util.Scanner;

public class JosephusProblem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt(), k = input.nextInt();

        int result = joseph(n, k);

        System.out.println(result);

    }

    private static int joseph(int n, int k) {
        if (n == 1)
            return 1;
        return (joseph(n - 1, k) + k - 1) % n + 1;
    }
}
