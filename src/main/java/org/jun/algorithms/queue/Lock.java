package org.jun.algorithms.queue;

import java.util.*;

public class Lock {
    public Lock() {
    }

    public int openLock(String[] deadends, String target){
        Set<String> deadendsSet = new HashSet<>(Arrays.asList(deadends));
        if (deadendsSet.contains(target) || deadendsSet.contains("0000")) {
            return -1;
        }
        Queue<String> queue = new LinkedList<>();
        queue.offer("0000");
        Set<String> visited = new HashSet<>();
        visited.add("0000");
        int level = 0;
        while (!queue.isEmpty()){
            int size = queue.size();
            while (size > 0){
                size--;
                String lockStr = queue.poll();
                if (lockStr.equals(target)) {
                    return level;
                }
                for (int i = 0; i < 4; i++) {
                    char ch = lockStr.charAt(i);
                    String AddStr = lockStr.substring(0, i) + (ch == '9' ? 0 : ch - '0' + 1) + lockStr.substring(i+1);
                    String subStr = lockStr.substring(0, i) + (ch == '0' ? 9 : ch - '0' - 1) + lockStr.substring(i+1);
                    if (!visited.contains(AddStr) && !deadendsSet.contains(AddStr)){
                        queue.offer(AddStr);
                        visited.add(AddStr);
                    }
                    if(!visited.contains(subStr) && !deadendsSet.contains(subStr)){
                        queue.offer(subStr);
                        visited.add(subStr);
                    }
                }
            }
            level++;
        }
        return -1;
    }
}
