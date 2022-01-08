package org.jun.algorithms.queue;

import java.util.Stack;

public class DecodeString {
    public DecodeString() {
    }

    public String decodeString(String s){
        int num = 0;
        StringBuilder res = new StringBuilder();
        Stack<StringBuilder> resStack = new Stack<>();
        Stack<Integer> numStack = new Stack<>();

        for (char c : s.toCharArray()){
            if (Character.isDigit(c)){
                num = num * 10 + c - '0';
            } else if (c == '['){
                resStack.push(res);
                numStack.push(num);
                res = new StringBuilder();
                num = 0;
            } else if (c == ']'){
                StringBuilder pre = resStack.pop();
                int n = numStack.pop();
                for (int i = 0; i < n; i++) {
                    pre.append(res);
                }
                res = pre;
            } else {
                res.append(c);
            }
        }
        return res.toString();
    }
}
