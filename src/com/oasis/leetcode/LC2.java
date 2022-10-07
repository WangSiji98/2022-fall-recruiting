package com.oasis.leetcode;

import com.oasis.datastructure.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */


class SolutionLC2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(9);
        ListNode l = dummy;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int v1 = l1 == null? 0 : l1.val;
            int v2 = l2 == null? 0 : l2.val;
            int sum = (v1 + v2 + carry) % 10;
            carry = (v1 + v2 + carry) / 10;
            l.next = new ListNode(sum);
            l = l.next;

            l1 = l1 != null? l1.next : null;
            l2 = l2 != null? l2.next : null;
        }
        if (carry > 0) {
            l1.next = new ListNode(carry);
        }
        return dummy.next;
    }
}

public class LC2 {

}
