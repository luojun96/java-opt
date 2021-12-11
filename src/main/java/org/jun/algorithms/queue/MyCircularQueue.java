package org.jun.algorithms.queue;

import java.util.ArrayList;
import java.util.List;

public class MyCircularQueue {
    private int[] array;
    private int capacity;
    private int p_head = -1;
    private int p_tail = -1;

    public MyCircularQueue(int k) {
        this.capacity = k;
        this.array = new int[k];
    }
    /** Insert an element into the circular queue. Return true if this operation is successful. */
    public boolean enQueue(int value) {
        if (isFull())
            return false;

        if (isEmpty())
            p_head = 0;

        p_tail = (p_tail + 1) % capacity;
        array[p_tail] = value;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty())
            return false;

        if(p_head == p_tail){
            p_head = -1;
            p_tail = -1;
            return true;
        }

        p_head = (p_head + 1) % capacity;
        return true;
    }

    public int Front() {
        if(isEmpty())
            return -1;
        return array[p_head];
    }

    public int Rear() {
        return array[p_tail];
    }

    public boolean isEmpty() {
        if (p_tail == -1 && p_head == -1)
            return true;

        return false;
    }

    public boolean isFull() {
        return (p_tail + 1) % capacity == p_head;
    }
}
