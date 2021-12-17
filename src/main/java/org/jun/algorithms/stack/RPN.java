package org.jun.algorithms.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class RPN {
    private Stack<Integer> stack;
    private List<String> operations;

    public RPN() {
        this.stack = new Stack<>();
        this.operations = new ArrayList<String>();
        operations.add("+");
        operations.add("-");
        operations.add("/");
        operations.add("*");
    }

    public int evalRPN(String[] tokens){
        for (String token : tokens){
            if (operations.contains(token)){
                if (!stack.isEmpty() && stack.size() >= 2){
                    int result = 0;
                    int right = stack.pop();
                    int left = stack.pop();
                    switch (token){
                        case "+":
                            result = left + right;
                            break;
                        case "-":
                            result = left - right;
                            break;
                        case "*":
                            result = left * right;
                            break;
                        case "/":
                            result = left / right;
                            break;
                        default:
                            return 0;
                    }
                    stack.push(result);
                }
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        if (!stack.isEmpty() && stack.size() == 1)
            return stack.peek();
        return 0;
    }
}
