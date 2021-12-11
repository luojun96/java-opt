package org.jun.algorithms.array;

public class Matrix {
    public int[] findElementInMatrix(int[][] matrix, int target){
        for (int rowIndex = 0; rowIndex < matrix.length; rowIndex++){
            int columnIndex = search(matrix[rowIndex], target);
            if(columnIndex >= 0){
                return new int[]{rowIndex, columnIndex};
            }
        }
        return null;
    }

    private int search(int[] nums, int target){
        int low = 0, high = nums.length - 1;
        while ( low <= high){
            int mid = (high - low) / 2 + low;
            int num = nums[mid];
            if(num == target){
                return mid;
            } else if (num > target){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
