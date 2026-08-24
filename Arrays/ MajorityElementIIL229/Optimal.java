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
 
class Solution {
    public List<Integer> majorityElement(int[] nums) {

        List<Integer> res = new ArrayList<>();

        int candidate1 = 0;
        int candidate2 = 0;

        int count1 = 0;
        int count2 = 0;

        // Step 1: Find potential candidates
        for (int num : nums) {

            if (num == candidate1) {
                count1++;
            } 
            else if (num == candidate2) {
                count2++;
            } 
            else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } 
            else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } 
            else {
                count1--;
                count2--;
            }
        }

        // Step 2: Verify candidates
        count1 = 0;
        count2 = 0;

        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            }
            if (num == candidate2) {
                count2++;
            }
        }

        if (count1 > nums.length / 3) {
            res.add(candidate1);
        }

        if (candidate2 != candidate1 && count2 > nums.length / 3) {
            res.add(candidate2);
        }

        return res;
    }
}