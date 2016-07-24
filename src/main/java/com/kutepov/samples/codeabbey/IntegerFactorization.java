package com.kutepov.samples.codeabbey;

import java.util.*;

@SuppressWarnings("SuspiciousNameCombination")
public class IntegerFactorization {

    private static boolean[] isPrime;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = input.nextInt();
        long[] numbers = new long[count], tmp = new long[count];
        for (int i = 0; i < count; i++) {
            numbers[i] = tmp[i] = input.nextLong();
        }

        //find max value in input data
        Arrays.sort(tmp);
        long maxValue = (long) Math.ceil(Math.sqrt(tmp[tmp.length - 1]));

        //build array with primes in range[0..maxValue];
        isPrime = new boolean[(int) maxValue];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i * i < maxValue; i++) {
            if (isPrime[i])
                for (int j = i * i; j < maxValue; j += i)
                    isPrime[j] = false;
        }


        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            List<Long> divisors = new ArrayList<>();
            long number = numbers[i];

            findPrimeDivisors(divisors, number, 1);
            Collections.sort(divisors);

            for (long div : divisors) {
                sb.append(div).append('*');
            }

            int idx = sb.lastIndexOf("*");
            sb.replace(idx, idx + 1, " ");
        }

        System.out.println(sb.toString());
    }


    private static void findPrimeDivisors(List<Long> divisors, long n, int start) {
        long a = n % 2 == 0 ? 2 : findDivisor(n, start);
        long b = n / a;
        if ((b == 1 && a >= isPrime.length) || isPrime[(int) a]) {
            divisors.add(a);
        } else {
            //try another start value
            start++;
            findPrimeDivisors(divisors, a, start);
        }
        if (b > 1) {
            findPrimeDivisors(divisors, b, start);
        }
    }

    //Pollard's rho algorithm
    private static long findDivisor(long n, int start) {
        long x = start, y = 1, stage = 2, factor = 1;
        while (factor == 1) {
            for (int i = 1; i <= stage && factor <= 1; i++) {
                x = (x * x + 1) % n;
                factor = gcd(Math.abs(x - y), n);
            }
            stage *= 2;
            y = x;
        }

        return factor;
    }

    private static long gcd(long x, long y) {
        long reminder;
        while (y != 0) {
            reminder = x % y;
            x = y;
            y = reminder;
        }
        return x;
    }

}
