package com.offer;

/**
 * 跳台阶
 * 题目描述
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 */
public class Offer_08 {
    public int JumpFloor(int n) {
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        int first = 1, second = 2;
        for (int i=3; i <=n ;++i) {
            int num = first + second;
            first = second;
            second = num;
        }

        return second;

    }

    public static void main(String[] args) {

    }
}
