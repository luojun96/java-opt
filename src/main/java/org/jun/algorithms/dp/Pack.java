package org.jun.algorithms.dp;

public class Pack {
    public int knapsack(int[] weight, int n, int w){
        boolean[][] states = new boolean[n][w+1];
        states[0][0] = true;
        if (weight[0] <= w){
            states[0][weight[0]] = true;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < w; j++) {
                if (states[i-1][j] == true){
                    states[i][j] = states[i-1][j];
                }
            }
            for (int j = 0; j <= w - weight[i] ; j++) {
                if (states[i-1][j] == true){
                    states[i][j+weight[i]] = true;
                }
            }
        }

        for (int i = w; i >= 0 ; i--) {
            if (states[n-1][i] == true){
                return i;
            }
        }

        return 0;
    }

    public int knapsack2(int[] items, int n, int w){
        boolean[] states = new boolean[w+1];
        states[0] = true;
        if(items[0] <= w) {
            states[items[0]] = true;
        }

        for (int i = 1; i < n; i++) {
            for (int j = w - items[i]; j >= 0; j--) {
                if (states[j] == true){
                    states[j+items[i]] = true;
                }
            }
        }

        for (int i = w; i >= 0 ; i--) {
            if (states[i] == true) {
                return i;
            }
        }
        return 0;
    }

    public static int knapsacks(int[] weight, int[] value, int n, int w){
        int[][] states = new int[n][w+1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < w+1; j++) {
                states[i][j] = -1;
            }
        }
        states[0][0] = 0;
        if (weight[0] <= w){
            states[0][weight[0]] = value[0];
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= w; j++) {
                if (states[i-1][j] >= 0) {
                    states[i][j] = states[i-1][j];
                }
            }
            for (int j = 0; j <= w-weight[i]; j++) {
                if (states[i-1][j] >= 0){
                    int v = states[i-1][j] + value[i];
                    if(v > states[i][j+weight[i]]){
                        states[i][j+weight[i]] = v;
                    }
                }
            }
        }
        int maxvalue = -1;
        for (int i = 0; i <= w ; i++) {
            if (states[n-1][i] > maxvalue) {
                maxvalue = states[n-1][i];
            }
        }
        return maxvalue;
    }


}
