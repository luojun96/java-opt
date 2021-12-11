package org.jun.algorithms.array;

import java.util.Random;

public class QuickSort {
    public int[] sortArray(int[] numbers){
        randomizedQuicksort(numbers, 0, numbers.length - 1);
        return numbers;
    }

    private void randomizedQuicksort(int[] numbers, int left, int right){
        if(left < right){
            int position = randomizedPartition(numbers, left, right);
            randomizedQuicksort(numbers, left, position - 1);
            randomizedQuicksort(numbers, position + 1, right);
        }
    }

    private int randomizedPartition(int[] numbers, int left, int right){
        int index = new Random().nextInt(right - left + 1) + left;
        swap(numbers, right, index);
        return partition(numbers, left, right);
    }

    private int partition(int[] numbers, int left, int right){
        int pivot = numbers[right];
        int index = left - 1;
        for (int j = left; j <= right - 1; j++){
            if(numbers[j] <= pivot){
                index++;
                swap(numbers, index, j);
            }
        }
        swap(numbers, index + 1, right);
        return index + 1;
    }

    private void swap(int[] numbers, int i, int j){
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
}
