package org.jun.algorithms.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://leetcode-cn.com/leetbook/read/queue-stack/g02cj/
 */
public class Flood {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor){
        if (image == null || image.length == 0) return new int[][]{};
        int oldColor = image[sr][sc];
        if (oldColor == newColor) return image;
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(sr = sr, sc = sc));
        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Point point = queue.poll();
                image[point.sr][point.sc] = newColor;

                //up
                if (point.sr > 0 && image[point.sr - 1][point.sc] == oldColor){
                    queue.offer(new Point(point.sr - 1, point.sc));
                }
                //down
                if (point.sr < image.length - 1 && image[point.sr + 1][point.sc] == oldColor){
                    queue.offer(new Point(point.sr + 1, point.sc));
                }
                //left
                if (point.sc > 0 && image[point.sr][point.sc - 1] == oldColor){
                    queue.offer(new Point(point.sr, point.sc - 1));
                }
                //right
                if(point.sc < image[0].length - 1 && image[point.sr][point.sc + 1] == oldColor){
                    queue.offer(new Point(point.sr, point.sc + 1));
                }
            }
        }
        return image;
    }

    class Point {
        int sr;
        int sc;
        public Point(int sr, int sc){
            this.sr = sr;
            this.sc = sc;
        }
    }
}
