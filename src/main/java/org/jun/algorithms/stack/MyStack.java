package org.jun.algorithms.stack;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class MyStack {
    private List<Integer> data;

    public MyStack(){
        data = new ArrayList<Integer>();
    }

    public void push(int x){
        data.add(x);
    }

    public int pop(){
        int value;
        int len = data.size();
        value = peek();
        data.remove(len - 1);
        return value;
    }

    public int peek(){
        if(isEmpty())
            throw new EmptyStackException();
        int index = data.size() - 1;
        int value = data.get(index);
        return value;
    }

    public boolean isEmpty(){
        return data.isEmpty();
    }
}
