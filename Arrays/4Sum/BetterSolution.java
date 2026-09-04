import java.util.*;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> list = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                Set<Long> set = new HashSet<>();
                for (int k = j + 1; k < n; k++) {
                    long temp = (long) target - nums[i] - nums[j] - nums[k];
                    if (set.contains(temp)) {
                        List<Integer> arr = Arrays.asList(
                            nums[i],
                            nums[j],
                            (int) temp,
                            nums[k]
                        );
                        Collections.sort(arr);
                        if (!list.contains(arr)) {
                            list.add(arr);
                        }
                    }
                    set.add((long) nums[k]);
                }
            }
        }

        return list;
    }
}