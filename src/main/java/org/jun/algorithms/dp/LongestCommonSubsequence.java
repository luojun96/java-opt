package org.jun.algorithms.dp;

// https://www.geeksforgeeks.org/longest-common-subsequence-dp-4/
public class LongestCommonSubsequence {
    public int lcs(char[] x, char[] y, int m, int n){
        // corner case
        if(m == 0 || n == 0) return 0;
        if(x[m-1] == y[n-1]){
            return 1 + lcs(x, y, m-1, n-1);
        } else {
            return Math.max(lcs(x, y, m, n-1), lcs(x, y, m-1, n));
        }
    }
}
