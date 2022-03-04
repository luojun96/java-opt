package org.jun.algorithms.dp;

// https://time.geekbang.org/column/article/75702
public class MinDist {
    // 状态转移表法
    public int minDistDP(int[][] matrix, int n){
        int[][] states = new int[n][n];
        int sum = 0;
        // 初始化states的第一行数据
        for (int j = 0; j < n; j++) {
            sum += matrix[0][j];
            states[0][j] = sum;
        }
        sum = 0;
        for (int i = 0; i < n; i++) {
            sum += matrix[i][0];
            states[i][0] = sum;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                states[i][j] = matrix[i][j] + Math.min(states[i][j-1], states[i-1][j]);
            }
        }
        return states[n-1][n-1];
    }

    private int[][] distMatrix;
    private int length;
    private int[][] mem;

    public MinDist(int[][] matrix, int length){
        this.distMatrix = matrix;
        this.length = length;
        this.mem = new int[length][length];
    }

    public MinDist(){}

    // 状态转移方程法
    public int minDist(int i, int j){
        if (i == 0 && j == 0) return distMatrix[0][0];

        if (mem[i][j] > 0) return mem[i][j];

        int minLeft = Integer.MAX_VALUE;
        if (j-1 >= 0){
            minLeft = minDist(i, j -1);
        }
        int minUp = Integer.MAX_VALUE;
        if (i-1 >= 0){
            minUp = minDist(i-1, j);
        }

        int currMinDist = distMatrix[i][j] + Math.min(minLeft,minUp);
        mem[i][j] = currMinDist;
        return currMinDist;
    }

}
