package com.offer;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Util {
    public static void showMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void layerIter(TreeNode root) {
        if (root != null) {
            Queue<TreeNode> q = new LinkedList<TreeNode>();
            q.offer(root);
            while (!q.isEmpty()) {
                TreeNode node = q.poll();
                System.out.print(node.val + " ");
                if (node.left != null) {
                    q.offer(node.left);
                }

                if (node.right != null)
                    q.offer(node.right);
            }
        }
    }

    public static void main(String[] args) {

    }
}
