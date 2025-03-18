package com.github.BrunoHenriqueOliveira.codingchallenges.LeetCode;

import java.lang.classfile.components.ClassPrinter;

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

public class AddTwoNumbers {
    public ClassPrinter.ListNode addTwoNumbers(ClassPrinter.ListNode l1, ClassPrinter.ListNode l2) {
        ClassPrinter.ListNode dummyHead = new ClassPrinter.ListNode(0);
        ClassPrinter.ListNode current = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = x + y + carry;

            carry = sum / 10;
            current.next = new ClassPrinter.ListNode(sum % 10);
            current = current.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        if (carry > 0) {
            current.next = new ClassPrinter.ListNode(carry);
        }

        return dummyHead.next; // Retorna a lista sem o nó fictício
    }
}
