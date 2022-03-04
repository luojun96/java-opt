package org.jun.algorithms.sort;

public class MergeSort {
    public void sort(int[] a, int n){
        if (n <= 1) return;;
        mergeSort(a, 0, n -1);
    }

    private void mergeSort(int[] a, int begin, int end){
        if (begin >= end) return;
        int mid = (begin + end) / 2;

        mergeSort(a, begin, mid);
        mergeSort(a, mid + 1, end);
        merge(a, begin, mid, end);
    }

    private void merge(int[] a, int begin, int mid, int end){
        int i = begin, j = mid + 1, k = 0;
        int[] tmp = new int[end - begin + 1];
        while (i <= mid && j <= end){
            if (a[i] <= a[j]){
                tmp[k++] = a[i++];
            } else {
                tmp[k++] = a[j++];
            }
        }

        int s = i, e = mid;
        if (j <= end){
            s = j;
            e = end;
        }
        while (s <= e){
            tmp[k++] = a[s++];
        }

        for (int l = 0; l < end - begin + 1; l++) {
            a[begin+l] = tmp[l];
        }
    }
}
