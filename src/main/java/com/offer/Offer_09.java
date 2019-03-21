package com.offer;

/**
 * 变态跳台阶
 * 题目描述
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 *
 */

public class Offer_09
{
    public int JumpFloorII(int target) {
        if (target == 1)
            return 1;
        int res = 1;
        for (int i=2; i <= target; ++i) {
            res = 2 * res;
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Offer_09().JumpFloorII(4));

    }
}
