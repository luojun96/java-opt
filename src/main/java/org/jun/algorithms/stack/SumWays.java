package org.jun.algorithms.stack;

/**
 * https://leetcode-cn.com/problems/target-sum/
 */
public class SumWays {
    private int count = 0;
    public SumWays() {
    }

    public int findTargetSumWays(int[] nums, int target){
        dfs(nums, target, 0, 0);
        return count;
    }

    private void dfs(int[] nums, int target, int index, int sum){
        if (index == nums.length) {
            if (sum == target) {
                count++;
            }
        } else {
            dfs(nums, target, index + 1, sum + nums[index]);
            dfs(nums, target, index + 1, sum - nums[index]);
        }
    }
}
