package Arrays.TwoSumL1;
/*
You are given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
*/
import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[][] arr = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int sum = arr[start][0] + arr[end][0];
            if (sum == target) {
                return new int[] { arr[start][1], arr[end][1] };
            }
            if (sum > target) {
                end--;
            } else {
                start++;
            }
        }
        return new int[] {};
    }
}
