import java.util.*;
/*
There are actually two common approaches:

HashSet → O(n²) — no sorting required
Sorting + Two Pointers → O(n²) — usually preferred for LeetCode 3Sum
This solution is first approach hashing.

Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.


Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.
 */
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {

            Set<Integer> set = new HashSet<>();

            for (int j = i + 1; j < nums.length; j++) {

                int required = -(nums[i] + nums[j]);

                if (set.contains(required)) {

                    List<Integer> triplet = Arrays.asList(
                        nums[i],
                        nums[j],
                        required
                    );

                    // Need to handle duplicate triplets
                    if (!result.contains(triplet)) {
                        result.add(triplet);
                    }
                }

                set.add(nums[j]);
            }
        }

        return result;
    }
}