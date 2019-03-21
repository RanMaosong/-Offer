package com.offer;

/**
 * 树的子结构
 * 题目描述
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 */
public class Offer_16 {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if (root1 == null || root2 == null)
            return false;
        return operation(root1, root2, false);
    }

    private boolean operation(TreeNode t1, TreeNode t2, boolean flag) {
        if (flag) {
            if (t2 == null)
                return true;

            if (t1 == null || t1.val != t2.val)
                return false;
            return operation(t1.left, t2.left, true) && operation(t1.right, t2.right, true);
        } else {
            if (t1 == null)
                return false;
            boolean res = false;
            if (t1.val == t2.val)
                res = operation(t1.left, t2.left, true) && operation(t1.right, t2.right, true);

            if (res)
                return res;
            res = operation(t1.left, t2, false);
            if (res)
                return res;

            res = operation(t1.right, t2, false);
            return res;
        }

    }

    public static void main(String[] args) {


    }
}
