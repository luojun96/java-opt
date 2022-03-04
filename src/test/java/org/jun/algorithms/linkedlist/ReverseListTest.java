package org.jun.algorithms.linkedlist;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseListTest {
    private ReverseList reverseList;

    @BeforeEach
    void setUp() {
        reverseList = new ReverseList();
    }

    @AfterEach
    void tearDown() {
        reverseList = null;
    }

    @Test
    void reverseList() {
        ReverseList.ListNode listNode = new ReverseList.ListNode(1, new ReverseList.ListNode(2, new ReverseList.ListNode(3, null)));
        ReverseList.ListNode listNode1 = reverseList.reverseList(listNode);
        Assertions.assertEquals(3, listNode1.val);
        Assertions.assertEquals(2, listNode1.next.val);
        Assertions.assertEquals(1, listNode1.next.next.val);
    }

    @Test
    void reverseListWithRecursion() {
    }
}