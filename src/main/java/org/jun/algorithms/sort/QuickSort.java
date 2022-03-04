package org.jun.algorithms.sort;

import java.util.Random;

public class QuickSort {
    public void sort(int[] a, int n){
        randomizedQuicksort(a, 0, n - 1);
    }

    private void randomizedQuicksort(int[] a, int left, int right){
        if(left < right){
            int position = randomizedPartition(a, left, right);
            randomizedQuicksort(a, left, position - 1);
            randomizedQuicksort(a, position + 1, right);
        }
    }

    private int randomizedPartition(int[] a, int left, int right){
        int index = new Random().nextInt(right - left + 1) + left;
        swap(a, right, index);
        return partition(a, left, right);
    }

    private int partition(int[] a, int left, int right){
        int pivot = a[right];
        int index = left - 1;
        for (int i = left; i < right - 1; i++) {
            if(a[i] <= pivot){
                index++;
                swap(a, index, i);
            }
        }
        swap(a, index + 1, right);
        return index + 1;
    }

    private void swap(int[] a, int i, int j){
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}
