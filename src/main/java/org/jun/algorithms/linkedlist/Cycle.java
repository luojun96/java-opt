package org.jun.algorithms.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class Cycle {

    public boolean hasCycle(ListNode head){
        Set<ListNode> set = new HashSet<ListNode>();
        while (head != null){
            if (!set.add(head)){
                return true;
            }
            head = head.next;
        }
        return false;
    }

    private static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
            next = null;
        }
    }

}
