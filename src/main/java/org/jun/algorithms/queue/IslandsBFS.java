package org.jun.algorithms.queue;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class IslandsBFS {
    public IslandsBFS() {
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
                    // use bfs to search the grid, and set found islands value to '0'
                    bfs(grid, i, j);
                }
            }
        }
        return count;
    }

    private void bfs(char[][] grid, int row, int column){
        grid[row][column] = 0;
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(new Node(row, column));

        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                // up
                if(node.i > 0 && grid[node.i - 1][node.j] == '1'){
                    grid[node.i - 1][node.j] = '0';
                    queue.add(new Node(node.i - 1, node.j));
                }
                // down
                if(node.i < grid.length - 1 && grid[node.i + 1][node.j] == '1'){
                    grid[node.i + 1][node.j] = '0';
                    queue.add(new Node(node.i + 1, node.j ));
                }
                // left
                if(node.j > 0 && grid[node.i][node.j - 1] == '1'){
                    grid[node.i][node.j - 1] = '0';
                    queue.add(new Node(node.i, node.j - 1));
                }
                // right
                if(node.j < grid[0].length - 1 && grid[node.i][node.j + 1] == '1'){
                    grid[node.i][node.j + 1] = '0';
                    queue.add(new Node(node.i, node.j + 1));
                }
            }
        }

    }

    class Node{
        public int i;
        public int j;
        public Node(int i, int j){
            this.i = i;
            this.j = j;
        }
    }
}
