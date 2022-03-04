package org.jun.algorithms.linkedlist;

/**
 * https://leetcode-cn.com/problems/middle-of-the-linked-list/
 */
public class MiddleNode {

    public ListNode middleNodeByArray(ListNode head) {
        ListNode[] nodes = new ListNode[100];
        int index = 0;
        while (head != null){
            nodes[index++] = head;
            head = head.next;
        }
        return nodes[index/2];
    }

    public ListNode middleNodeByPointer(ListNode head) {
        int n = 0;
        ListNode cur = head;
        while (cur != null){
            n++;
            cur = cur.next;
        }
        int k = 0;
        cur = head;
        while (k < n/2){
            k++;
            cur = cur.next;
        }
        return cur;
    }

    public ListNode middleNodeByDoublePointers(ListNode head){
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
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
