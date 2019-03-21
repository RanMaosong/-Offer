package com.offer;
/**
 * 矩形覆盖
 * 题目描述我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 */

public class Offer_10 {
    public int RectCover(int target) {
        if (target == 0)
            return 0;
        if (target == 1)
            return 1;
        return operation(target);

    }
    private int operation(int target) {
        if (target <= 1)
            return 0;

        return  2 + operation(target-1) + operation(target-2);
    }

    public int RectCover1(int target) {
        if (target == 0)
            return 0;
        if (target == 1)
            return 1;
        int first = 1, second = 1;
        for (int i=2; i <= target; ++i) {
            int num = first + second;
            first = second;
            second = num;
        }

        return second;

    }

    public static void main(String[] args) {

    }
}
