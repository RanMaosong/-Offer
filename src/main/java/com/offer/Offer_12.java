package com.offer;

/**
 * 数值的整数次方
 * 题目描述
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 *
 */
public class Offer_12 {
    public double Power(double base, int exponent) {
        double res = operation(base, Math.abs(exponent));
        return exponent > 0 ? res : 1 / res;

    }
    private double operation(double base, int exponent) {
        if (base == 0)
            return 0;
        if (exponent == 0 || base == 1)
            return 1;
        if (exponent == 1)
            return base;
        double res = base;
        int i;
        for (i=2; i <= exponent; i *= 2) {
            res *= res;
        }

        return Power(base, exponent-i/2) * res;
    }
    public static void main(String[] args) {
        System.out.println(new Offer_12().Power(2.0, -10));
    }
}
