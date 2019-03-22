package com.offer;

import java.util.ArrayList;

/**
 * 二叉树中和为某一值的路径
 * 题目描述
 * 输入一颗二叉树的跟节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 * (注意: 在返回值的list中，数组长度大的数组靠前)
 */

public class Offer_24 {

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if (target == 0)
            return res;
        ArrayList<Integer> list = new ArrayList<Integer>();
        operation(root, target, res, list);

        return res;
    }

    private void operation(TreeNode node, int target, ArrayList<ArrayList<Integer>> res, ArrayList<Integer> list) {
        ArrayList<Integer> tmp = new ArrayList<Integer>(list);
        tmp.add(node.val);
        if (node.left != null)
            operation(node.left, target - node.val, res, tmp);
        if (node.right != null)
            operation(node.right, target - node.val, res, new ArrayList<Integer>(tmp));

        if (node.left == null && node.right == null && target -node.val == 0) {
            list.add(target);
            res.add(list);
        }

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(12);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(7);

        ArrayList<ArrayList<Integer>> res = new Offer_24().FindPath(root, 22);
        for (ArrayList<Integer> node : res) {
            System.out.println(node);
        }

    }
}
