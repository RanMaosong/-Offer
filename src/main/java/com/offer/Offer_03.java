package com.offer;

import java.util.ArrayList;
import java.util.List;

/**
 * 从尾到头打印链表
 * 题目描述
 * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 */

public class Offer_03 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        List<Integer> posetive = new ArrayList<Integer>();
        while (listNode != null) {
            posetive.add(listNode.val);
            listNode = listNode.next;
        }

        ArrayList<Integer> res = new ArrayList<Integer>();
        for (int i=posetive.size()-1; i >= 0; --i) {
            res.add(posetive.get(i));
        }

        return res;

    }

    public static void main(String[] args) {

    }
}
