package org.jun.algorithms.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * https://leetcode-cn.com/leetbook/read/queue-stack/g02cj/
 */
public class Flood {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (image == null || image.length == 0)
            return new int[][]{};
        int oldColor = image[sr][sc];
        if (oldColor == newColor)
            return image;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{sr, sc});
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] point = queue.poll();
                image[point[0]][point[1]] = newColor;

                //up
                if (point[0] > 0 && image[point[0] - 1][point[1]] == oldColor) {
                    queue.offer(new int[]{point[0] - 1, point[1]});
                }
                //down
                if (point[0] < image.length - 1 && image[point[0] + 1][point[1]] == oldColor) {
                    queue.offer(new int[]{point[0] + 1, point[1]});
                }
                //left
                if (point[1] > 0 && image[point[0]][point[1] - 1] == oldColor) {
                    queue.offer(new int[]{point[0], point[1] - 1});
                }
                //right
                if (point[1] < image[0].length - 1 && image[point[0]][point[1] + 1] == oldColor) {
                    queue.offer(new int[]{point[0], point[1] + 1});
                }
            }
        }
        return image;
    }

    public int[][] floodFillDfs(int[][] image, int sr, int sc, int newColor) {
        int k = image[sr][sc];
        if (k == newColor)
            return image;

        dfs(image, sr, sc, k, newColor);
        return image;
    }

    private void dfs(int[][] image, int x, int y, int k, int newColor) {
        if (x < 0 || x >= image.length || y < 0 || y >= image.length || image[x][y] != k)
            return;
        image[x][y] = newColor;

        dfs(image, x - 1, y, k, newColor);
        dfs(image, x + 1, y, k, newColor);
        dfs(image, x, y - 1, k, newColor);
        dfs(image, x, y + 1, k, newColor);

    }
}
