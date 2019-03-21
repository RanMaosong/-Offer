package com.offer;


import java.util.ArrayList;

/**
 * 顺时针打印矩阵
 * 题目描述
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，如果输入如下4 X 4矩阵：
 * 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 */
public class Offer_18 {
    ArrayList<Integer> res = new ArrayList<Integer>();
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        operation(matrix, 0, matrix[0].length-1, matrix.length-1, 0);
        return res;
    }

    private void operation(int[][] matrix, int t, int r, int b, int l) {
        if ( t > b || l > r)
            return;
        if (t == b) {
            while (l <= r)
                res.add(matrix[t][l++]);
            return;
        }

        if (l == r) {
            while (t <= b)
                res.add(matrix[t++][l]);
            return;
        }

//        System.out.println("==" + res);
        for (int i=l; i < r; ++i)
            res.add(matrix[t][i]);

        for (int i=t; i < b; ++i)
            res.add(matrix[i][r]);

        for (int i=r; i > l; --i)
            res.add(matrix[b][i]);
        for (int i=b; i > t; --i)
            res.add(matrix[i][l]);


        operation(matrix, t+1, r-1, b -1, l+1);

    }

    public ArrayList<Integer> printMatrix1(int [][] matrix) {
        int t = 0, r = matrix[0].length - 1, b = matrix.length-1, l = 0;

        while (true) {
            if ( t > b || l > r)
                return res;
            if (t == b) {
                while (l <= r)
                    res.add(matrix[t][l++]);
                return res;
            }

            if (l == r) {
                while (t <= b)
                    res.add(matrix[t++][l]);
                return res;
            }

            for (int i=l; i < r; ++i)
                res.add(matrix[t][i]);

            for (int i=t; i < b; ++i)
                res.add(matrix[i][r]);

            for (int i=r; i > l; --i)
                res.add(matrix[b][i]);
            for (int i=b; i > t; --i)
                res.add(matrix[i][l]);

            ++t;
            --r;
            --b;
            ++l;
        }



    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 2}, {3, 4}};
        System.out.println(new Offer_18().printMatrix(matrix));

    }
}
