package org.jun.algorithms.array;

public class MergeSortedArray {
    public static int[] merge(int[] a, int[] b){
        int[] res = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]){
                res[k] = a[i];
                i++;
            } else {
                res[k] = b[j];
                j++;
            }
            k++;
        }
        int start = i, end = a.length - 1;
        if (j <= b.length - 1) {
            start = j;
            end = b.length - 1;
            while (start <= end){
                res[k] = b[start];
                k++;
                start++;
            }
        } else {
            while (start <= end){
                res[k] = a[start];
                k++;
                start++;
            }
        }

        return res;
    }
}
