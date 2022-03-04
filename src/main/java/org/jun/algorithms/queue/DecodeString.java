package org.jun.algorithms.queue;

import java.util.Collections;
import java.util.LinkedList;
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

    int ptr;

    public String decodeString01(String s){
        LinkedList<String> stk = new LinkedList<>();
        ptr = 0;
        while (ptr < s.length()){
            char cur = s.charAt(ptr);
            if (Character.isDigit(cur)){
                String digits = getDigits(s);
                stk.addLast(digits);
            } else if (Character.isLetter(cur) || cur == '['){
                stk.addLast(String.valueOf(s.charAt(ptr++)));
            } else {
                ptr++;
                LinkedList<String> sub = new LinkedList<>();
                while (!stk.peekLast().equals("[")){
                    sub.addLast(stk.removeLast());
                }
                Collections.reverse(sub);
                stk.removeLast();
                int repTime = Integer.parseInt(stk.removeLast());
                StringBuilder t = new StringBuilder();
                String o = getString(sub);
                while (repTime-- > 0){
                    t.append(o);
                }
                stk.addLast(t.toString());
            }
        }
        return getString(stk);
    }

    private String getDigits(String s){
        StringBuilder ret = new StringBuilder();
        while (Character.isDigit(s.charAt(ptr))){
            ret.append(s.charAt(ptr++));
        }
        return ret.toString();
    }

    private String getString(LinkedList<String> v){
        StringBuilder ret = new StringBuilder();
        for (String s : v){
            ret.append(s);
        }
        return ret.toString();
    }
}
