package org.jun.algorithms.queue;

import java.util.LinkedList;
import java.util.Queue;

public class IslandsDFS {
    public IslandsDFS() {
    }

    public int numIslands(char[][] grid){
        // corner case
        if(grid == null || grid.length == 0)
            return 0;
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1'){
                    count++;
                    // use dfs to search the grid, and set found islands value to '0'
                    dfs(grid, new Node(i,j));
                }
            }
        }
        return count;
    }

    private void dfs(char[][] grid, Node cur){
        if (cur.i < 0 || cur.i >= grid.length || cur.j < 0 || cur.j >= grid[0].length || grid[cur.i][cur.j] == '0')
            return;
        grid[cur.i][cur.j] = '0';
        // up
        dfs(grid, new Node(cur.i - 1, cur.j));
        // down
        dfs(grid, new Node(cur.i + 1, cur.j));
        // left
        dfs(grid, new Node(cur.i, cur.j - 1));
        // right
        dfs(grid, new Node(cur.i, cur.j + 1));
    }

    private class Node{
        public int i;
        public int j;
        public Node(int i, int j){
            this.i = i;
            this.j = j;
        }
    }

}
