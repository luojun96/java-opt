package org.jun.algorithms.heap;

import java.util.PriorityQueue;

public class KthLargest {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(k);
        for (int item : nums) {
            if (queue.size() < k) {
                queue.offer(item);
            } else {
                if(item > queue.peek()){
                    queue.poll();
                    queue.offer(item);
                }
            }
        }
        return queue.peek();
    }
}
