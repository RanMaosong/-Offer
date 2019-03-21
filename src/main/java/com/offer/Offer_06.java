package com.offer;

import java.util.Arrays;

/**
 * 旋转数组的最小数字
 * 题目描述
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。 输入一个非减排序的数组的一个旋转，
 * 输出旋转数组的最小元素。 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。 NOTE：给出的所有元素都大于0，
 * 若数组大小为0，请返回0。
 */

public class Offer_06 {
    public int minNumberInRotateArray(int [] array) {
        int i=0,  j = array.length - 1;
        while (i <= j) {
            int m = (i + j) / 2;
            if (array[m] >= array[i] && (array[m+1] <= array[j])) {
                return array[m+1];
            } else if (array[m-1] >= array[i] && (array[m] <= array[j])) {
                return array[m];
            } else if (array[m] >= array[i]) {
                i = m + 1;
            } else {
                j = m - 1;
            }
        }
        return 0;
    }

    public int minNumberInRotateArray1(int [] array) {
        for (int i = array.length-1; i > 0; --i) {
            if (array[i] < array[i-1])
                return array[i];
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(new Offer_06().minNumberInRotateArray(new int[]{3, 4, 5, 6, 7, 2}));
    }
}
