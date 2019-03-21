package com.offer;

import java.lang.annotation.Target;
import java.util.Arrays;

/**
 * 重建二叉树
 * 题目描述
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果
 * 中都不含重复的数字。例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，
 * 则重建二叉树并返回。
 */
public class Offer_04 {
    int start = 0;
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        return operation(pre, in, 0, in.length-1);
    }

    public TreeNode operation(int[] pre, int[] in, int i, int j) {
        if (i == j) {
            TreeNode node = new TreeNode(in[i]);
            ++start;
            return node;
        } else if ( i > j)
            return null;

        int index = binsearch(in, i, j, pre[start]);
        TreeNode root = new TreeNode(pre[start]);
        ++start;
        root.left = operation(pre, in, i, index-1);
        root.right = operation(pre, in, index+1, j);

        return root;

    }

    private int binsearch(int[] arr, int i, int j, int target) {
        while (i <= j) {
            if (arr[i] == target)
                break;
            ++i;
        }

        return i;
    }

    public static void main(String[] args) {
        int[] pre = new int[]{1, 2, 4, 7, 3, 5, 6, 8};
        int[] in = new int[]{4, 7, 2, 1, 5, 3, 8, 6};
        Util.layerIter(new Offer_04().reConstructBinaryTree(pre, in));
    }
}
