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
public class Better {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        List<Integer> result = new ArrayList<>();
        System.out.println(majorityElement(nums, result));
    }

    public static List<Integer> majorityElement(int[] nums, List<Integer> res) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 1)+1);
            int value = map.get(nums[i]);
            if(value > n/3 && !res.contains(nums[i])){
                res.add(nums[i]);
            }
        }
        return res;
    }
}
