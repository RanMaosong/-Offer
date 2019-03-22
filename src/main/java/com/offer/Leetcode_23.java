package com.offer;

/**
 * 二叉搜索树的后序遍历序列
 * 题目描述
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 */
public class Leetcode_23 {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence == null || sequence.length == 0)
            return false;
        return operation(sequence, 0, sequence.length-1);

    }

    private boolean operation(int[] seq, int i, int j) {
        if (i > j)
            return true;
        int num = seq[j];
        int m = i;
        while (seq[m] < num) {
            ++m;
        }

        int n = m;
        while (n < j) {
            if (seq[n] < num)
                return false;
            ++n;
        }

        return operation(seq, i, m-1) && operation(seq, m, j-1);
    }

    public static void main(String[] args) {

    }
}
