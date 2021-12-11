package org.jun.algorithms.queue;

import java.util.LinkedList;
import java.util.Queue;

public class StandardQueue {
    public static void testRun(){
        Queue<Integer> queue = new LinkedList<Integer>();
        System.out.println("First element in the queue is " + queue.peek());

        queue.offer(1);
        queue.offer(2);
        queue.poll();
        System.out.println("First element in the queue is " + queue.peek());

        queue.offer(4);
        System.out.println("The size of this queue is " + queue.size());


    }
}
