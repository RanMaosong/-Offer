package com.offer;

/**
 * 链表中倒数第k个结点
 * 题目描述
 * 输入一个链表，输出该链表中倒数第k个结点。
 */

public class Leetcode_14 {
    public ListNode FindKthToTail(ListNode head,int k) {
        if (k == 0)
            return null;
        ListNode slow = head, fast = head;
        for (int i=1; i < k; ++ i) {
            if (fast == null)
                return null;
            fast = fast.next;
        }
        if (fast == null)
            return null;

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;

    }

    public static void main(String[] args) {

    }
}
