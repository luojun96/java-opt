package org.jun.algorithms.search;

public class SearchRange {
    public int[] searchRange(int[] nums, int target){
        int leftIndex = binarySearch(nums, target, true);
        int rightIndex = binarySearch(nums, target, false);
        return new int[]{leftIndex, rightIndex};
    }

    private int binarySearch(int[] nums, int target, boolean lower){
        int low = 0;
        int high = nums.length - 1;
        while (low <= high){
            int mid = low + ((high - low)>>1);
            if (nums[mid] < target ){
                low = mid + 1;
            } else if(nums[mid] > target){
                high = mid - 1;
            } else {
                if (lower){
                    if ((mid == 0) || nums[mid - 1] != target){
                        return mid;
                    } else {
                        high = mid - 1;
                    }
                } else {
                    if ((mid == nums.length - 1) || nums[mid + 1] != target){
                        return mid;
                    } else {
                        low = mid + 1;
                    }
                }
            }
        }
        return -1;
    }

}
