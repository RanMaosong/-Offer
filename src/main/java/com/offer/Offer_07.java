package com.offer;

/**
 * 斐波那契数列
 * 目描述
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。n<=39
 */

public class Offer_07 {
    public int Fibonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        int first = 0, second = 1;
        for (int i=2; i <=n ;++i) {
            int num = first + second;
            first = second;
            second = num;
        }

        return second;
    }

    public static void main(String[] args) {

    }
}
