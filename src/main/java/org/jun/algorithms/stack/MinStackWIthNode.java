package org.jun.algorithms.stack;

import java.util.Stack;

public class MinStackWIthNode {
    private Stack<Node> stack;

    public MinStackWIthNode() {
        this.stack = new Stack<Node>();
    }

    public void push(int value){
        if (stack.isEmpty()){
            stack.push(new Node(value, value));
        } else {
            int min = value < stack.peek().min ? value : stack.peek().min;
            stack.push(new Node(value, min));
        }
    }

    public int pop(){
        return stack.pop().val;
    }

    public int top(){
        return stack.peek().val;
    }

    public int getMin(){
        return stack.peek().min;
    }

    private class Node{
        public int val;
        public int min;

        public Node(int val, int min){
            this.val = val;
            this.min = min;
        }
    }
}
