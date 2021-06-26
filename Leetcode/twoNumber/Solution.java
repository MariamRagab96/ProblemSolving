package Leetcode.twoNumber;

import java.math.BigDecimal;

// Definition for singly-linked list.
class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = null;
        String first = "", second = "";
        while (l1 != null) { //O(n)
            first = l1.val + first;
            l1 = l1.next;
        }
        while (l2 != null) { //O(n)
            second = l2.val + second;
            l2 = l2.next;
        }
        BigDecimal num1 = new BigDecimal(first);
        BigDecimal num2 = new BigDecimal(second);
        String num12 = num1.add(num2).toString();
        System.out.println(num12);

        for (int i = 0; i < num12.length(); i++) { //insert first in linkedList
            ListNode node = new ListNode((Integer.parseInt(num12.substring(i, i + 1))));
            node.next = res;
            res = node;
        }
        return res;
    }
}
