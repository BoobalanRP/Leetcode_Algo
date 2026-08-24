import java.util.*;
/*
Given an integer array of size n, find all elements that appear more than ⌊n / 3⌋ times.

 

Example 1:

Input: nums = [3,2,3]
Output: [3]
Example 2:

Input: nums = [1]
Output: [1]
Example 3:

Input: nums = [1,2]
Output: [1,2]
 
*/
public class BruteForce {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        List<Integer> result = new ArrayList<>();
        System.out.println(majorityElement(nums, result));
    }

    public static List<Integer> majorityElement(int[] nums, List<Integer> res) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if(res.contains(nums[i])){
                continue;
            }
            int count = 0;
            for (int j = 0; j < n; j++) {
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count >n/3){
                res.add(nums[i]);
            }
        }
        return res;
    }
}
