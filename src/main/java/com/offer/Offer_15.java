package com.offer;

/**
 * 合并两个排序的链表
 * 题目描述
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 */
public class Offer_15 {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if (list1 == null && list2 == null)
            return null;
        else if (list1 == null)
            return list2;
        else if (list2 == null)
            return list1;
        ListNode head, tail;
        if (list1.val < list2.val) {
            head = list1;
            tail = head;
            list1 = list1.next;
        } else {
            head = list2;
            tail = head;
            list2 = list2.next;
        }


        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                tail = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                tail = list2;
                list2 = list2.next;
            }
        }

        if (list1 != null)
            tail.next = list1;
        else
            tail.next = list2;

        return head;
    }

    public static void main(String[] args) {

    }
}
