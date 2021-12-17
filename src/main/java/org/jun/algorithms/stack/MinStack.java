package org.jun.algorithms.stack;

import java.util.Comparator;
import java.util.EmptyStackException;
import java.util.PriorityQueue;
import java.util.Stack;

public class MinStack {
    private Stack<Integer> stack;
    private PriorityQueue<Integer> priorityQueue;

    public MinStack(){
        stack = new Stack<>();
        priorityQueue = new PriorityQueue<Integer>();
    }

    public void push(int value){
        stack.push(value);
        if (priorityQueue.isEmpty() || value < priorityQueue.peek())
            priorityQueue.offer(value);
    }

    public int pop(){
        if (stack.isEmpty()){
            throw new EmptyStackException();
        }
        if(stack.peek() == priorityQueue.peek())
            priorityQueue.poll();

        return stack.pop();
    }

    public int top(){
        return stack.peek();
    }

    public int getMin(){
        return priorityQueue.peek();
    }
}
