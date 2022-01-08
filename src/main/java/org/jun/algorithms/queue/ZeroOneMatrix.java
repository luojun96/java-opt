package org.jun.algorithms.queue;

import java.util.LinkedList;
import java.util.Queue;

public class ZeroOneMatrix {
    public int[][] updateMatrix(int[][] mat){
        if(mat == null || mat.length == 0) return new int[][]{};
        
        int[][] res = new int[mat.length][mat[0].length];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 0){
                    res[i][j] = 0;
                } else {
                    // use bfs to search the near 0
                    res[i][j] = findTheNearestZero(mat, i, j,0);
                }
            }
        }
        return res;
    }

    private int findTheNearestZero(int[][] mat, int i, int j, int target){
        Queue<Item> queue = new LinkedList<>();
        queue.add(new Item(i, j));
        int level = 0;
        while (!queue.isEmpty()){
            level++;
            int size = queue.size();
            for (int k = 0; k < size; k++) {
                Item item = queue.poll();
                // up
                if (item.i > 0){
                    if (mat[item.i - 1][item.j] == 0){
                        return level;
                    } else {
                        queue.offer(new Item(item.i - 1, item.j));
                    }
                }
                // down
                if (item.i < mat.length - 1 ){
                    if (mat[item.i + 1][item.j] == 0){
                        return level;
                    } else {
                        queue.offer(new Item(item.i + 1, item.j));
                    }
                }
                //left
                if (item.j > 0){
                    if (mat[item.i][item.j - 1] == 0){
                        return level;
                    } else {
                        queue.offer(new Item(item.i, item.j - 1));
                    }
                }
                //right
                if (item.j < mat[0].length - 1){
                    if (mat[item.i][item.j + 1] == 0){
                        return level;
                    } else {
                        queue.offer(new Item(item.i, item.j + 1));
                    }
                }
            }
        }
        return 0;
    }

    class Item{
        public int i,j;
        public Item(int i, int j){
            this.i = i;
            this.j = j;
        }
    }
}
