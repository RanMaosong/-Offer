package com.offer;


/**
 * 反转链表
 * 题目描述
 * 输入一个链表，反转链表后，输出新链表的表头。
 */
public class Offer_21 {
    public ListNode ReverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode res = head;
        head = head.next;
        res.next = null;

        while (head != null) {
            ListNode tmp = head;
            head = head.next;
            tmp.next = res;
            res = tmp;
        }

        return res;
    }

    public static void main(String[] args) {

    }
}
