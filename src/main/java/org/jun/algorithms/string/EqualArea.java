package org.jun.algorithms.string;

import java.util.Stack;

public class EqualArea {
    public boolean AreaEqual(String a, String b){
        if( (a == "" && b != "") || (a != "" && b == "") ) return false;
        if(isContainHashChar(a)){
            // rewrite the string
            a = decodeString(a);
        }

        if(isContainHashChar(b)){
            // rewrite the string
            b = decodeString(b);
        }
        return a == b;
    }

    private boolean isContainHashChar(String str){
        return str.contains("#");
    }

    // abc#d => abd
    private String decodeString(String str){
        String result = str;
        Stack<Character> stack = new Stack<Character>();
        int length = str.length();
        char[] array = str.toCharArray();

        for( int i = 0; i < length; i++ ){
            char item = array[i];
            if (item == '#'){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            } else {
                stack.push(item);
            }
        }
        result = stack.toString();
        return result;
    }
}
