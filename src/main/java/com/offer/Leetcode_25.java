package com.offer;

/**
 * 复杂链表的复制
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），
 * 返回结果为复制后复杂链表的head。（注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 */

public class Leetcode_25 {
    public RandomListNode Clone(RandomListNode pHead) {
        if (pHead == null)
            return null;
        RandomListNode p  = pHead;
        while (p != null) {
            RandomListNode node = new RandomListNode(p.label);
            node.next = p.next;
            p.next = node;
            p = p.next.next;
        }

        p = pHead;
        while (p != null) {
            if (p.random != null) {
                p.next.random = p.random.next;
            }

            p = p.next.next;
        }

        RandomListNode res = pHead.next;
        p = res;
        while (p.next != null) {
            pHead.next = p.next;
            pHead = pHead.next;
            p.next = p.next.next;
            p = p.next;
        }

        pHead.next = null;
        p.next = null;

        return res;


    }

    public static void main(String[] args) {

    }
}
