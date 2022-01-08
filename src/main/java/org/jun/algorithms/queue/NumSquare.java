package org.jun.algorithms.queue;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class NumSquare {

    public int numSquaresWithDP(int n){
        int[] f = new int[n+1];
        for (int i = 1; i < n; i++) {
            int minn = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; j++) {
                minn = Math.min(minn, f[i - j * j]);
            }
            f[i] = minn + 1;
        }
        return f[n];
    }

    public int numSquares(int n){
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        queue.offer(0);
        visited.add(0);

        int level = 0;

        while (!queue.isEmpty()){
            int size = queue.size();
            level++;
            for (int i = 0; i < size; i++) {
                int digit = queue.poll();
                for (int j = 1; j <= n; j++) {
                    int nodeValue = digit + j * j;
                    if (nodeValue == n)
                        return level;

                    if (nodeValue > n)
                        break;

                    if (!visited.contains(nodeValue)){
                        queue.offer(nodeValue);
                        queue.add(nodeValue);
                    }
                }
            }
        }
        return level;
    }
}
