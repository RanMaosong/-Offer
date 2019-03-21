package com.offer;

import java.util.Arrays;

public class offer_01 {

    public boolean Find(int target, int [][] array) {
        int m = array.length, n = array[0].length;
        int i=0, j = n-1;
        while (i < m && 0 <= j) {
            if (target < array[i][j])
                --j;
            else if (target > array[i][j])
                ++i;
            else
                return true;
        }

        return false;
    }



    public static void main(String[] args) {
        int[][] num = new int[][]{{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
        Util.showMatrix(num);
        System.out.print(new offer_01().Find(7, num));
    }
}
