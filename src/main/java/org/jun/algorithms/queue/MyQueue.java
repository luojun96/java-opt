package org.jun.algorithms.queue;

import java.util.ArrayList;
import java.util.List;

public class MyQueue {
    private List<Integer> array;
    private int p_start;

    public MyQueue(){
        array = new ArrayList<Integer>();
        p_start = 0;
    }
    public boolean enQueue(int item){
        array.add(item);
        return true;
    }

    public boolean deQueue(){
        if(isEmpty()){
            return false;
        }
        p_start++;
        return true;
    }

    public int getFront(){
        if(!isEmpty()){
            return array.get(p_start);
        }
        return 0;
    }

    private boolean isEmpty(){
        if(p_start >= array.size()){
            return true;
        }
        return false;
    }
}
