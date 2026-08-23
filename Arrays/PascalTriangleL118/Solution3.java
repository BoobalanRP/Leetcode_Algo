package Arrays.PascalTriangleL118;

import java.util.*;

    public class Solution3 {
    
        public static List<Integer> generate(int n) {
            List<Integer> arr = new ArrayList<>();
            int ans = 1;
            arr.add(ans);
            for(int i=1; i<n; i++){
                ans *= n - i;
                ans /=i;
                arr.add(ans);
            }
            return arr;
        }
    
        public static void main(String[] args) {
    
            List<List<Integer>> ans = new ArrayList<>();
            int n=6;
            for(int i=1; i<=n; i++){
                List<Integer> result = generate(i);
                ans.add(result);
            }

            System.out.println(ans);
        }
    }
