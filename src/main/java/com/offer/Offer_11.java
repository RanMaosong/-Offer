package com.offer;
/**
 * 二进制中1的个数
 * 题目描述
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 */
public class Offer_11 {
    public int NumberOf1(int n) {
        int m = Math.abs(n);
        int res = 0;
        for (int i=0; i < 32; ++i) {
            int j = n >> 1;
            if (n != (j << 1))
                ++res;
            n >>= 1;
        }

        return res;
    }
    public static void main(String[] args) {
        System.out.println(new Offer_11().NumberOf1(0));
    }
}
