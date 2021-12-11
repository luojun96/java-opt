package org.jun.algorithms.dp;

public class GFG {
    public int findMin(int[] arr, int n){
        int sumTotal = 0;
        for(int i = 0; i < n; i++){
            sumTotal += arr[i];
        }
        return findMinRec(arr, n, 0, sumTotal);
    }

    private int findMinRec(int[] arr, int i, int sumCalculated, int sumTotal){
        if(i == 0){
            return Math.abs((sumTotal - sumCalculated) - sumCalculated);
        }

        return Math.min(findMinRec(arr, i - 1, sumCalculated + arr[i - 1], sumTotal),
                        findMinRec(arr, i - 1, sumCalculated, sumTotal));
    }
}
