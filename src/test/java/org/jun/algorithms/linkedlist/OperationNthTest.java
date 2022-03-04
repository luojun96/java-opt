package org.jun.algorithms.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperationNthTest {

    @Test
    void removeNthFromEnd() {
        OperationNth.ListNode head = new OperationNth.ListNode(1, new OperationNth.ListNode(2, new OperationNth.ListNode(3, new OperationNth.ListNode(4, null))));
        OperationNth.ListNode result = new OperationNth().removeNthFromEnd(head, 2);
        Assertions.assertEquals(4, head.next.next.val);
    }

    @Test
    void removeNthFromEndByStack() {
        OperationNth.ListNode head = new OperationNth.ListNode(1, new OperationNth.ListNode(2, new OperationNth.ListNode(3, new OperationNth.ListNode(4, null))));
        OperationNth.ListNode result = new OperationNth().removeNthFromEndByStack(head, 2);
        Assertions.assertEquals(4, head.next.next.val);
    }


}