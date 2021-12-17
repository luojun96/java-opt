package org.jun.algorithms.stack;

import java.util.Hashtable;
import java.util.Stack;

public class DecodeString {

    private Stack<Character> stack;
    private Hashtable<Character, Character> hashtable;
    public DecodeString() {
        stack = new Stack<>();

        hashtable = new Hashtable<Character, Character>(){};
        hashtable.put('(', ')');
        hashtable.put('[', ']');
        hashtable.put('{', '}');
    }

    public boolean isValid(String s){
        if(s == null || s.length() % 2 != 0) return false;
        char[] arr = s.toCharArray();
        for (char ch : arr){
            if(hashtable.containsKey(ch)){
                stack.push(ch);
            }else if(hashtable.containsValue(ch)){
                if(stack.isEmpty() == false && hashtable.get(stack.peek()) == ch){
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return stack.isEmpty();
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == '(' || arr[i] == '[' || arr[i] == '{' ){
//                stack.push(arr[i]);
//            } else if( arr[i] == ')' || arr[i] == ']' || arr[i] == '}' ){
//                if (stack.isEmpty())
//                    return false;
//                char preChar = stack.peek();
//                switch (arr[i]){
//                    case ')':
//                        if (preChar == '('){
//                            stack.pop();
//                        } else {
//                            return false;
//                        }
//                        break;
//                    case ']':
//                        if (preChar == '['){
//                            stack.pop();
//                        } else {
//                            return false;
//                        }
//                        break;
//                    case '}':
//                        if(preChar == '{'){
//                            stack.pop();
//                        } else {
//                            return false;
//                        }
//                        break;
//                    default:
//                        return false;
//                }
//            } else {
//                return false;
//            }
//        }
//        if (stack.size() > 0)
//            return false;
//
//        return true;
    }
}
