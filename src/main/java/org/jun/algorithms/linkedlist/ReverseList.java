package org.jun.algorithms.linkedlist;

// https://leetcode-cn.com/problems/reverse-linked-list/
public class ReverseList {

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public ListNode reverseListWithRecursion(ListNode head){
        if (head == null || head.next == null)
            return head;
        ListNode newHead = reverseListWithRecursion(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }


    static class ListNode {
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
}
