package Arrays.PascalTriangleL118;

/* Pascal's Triangle
    Given an integer n, return the first n rows of Pascal's triangle.
    In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
    Example 1:
    Input: n = 5
    Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
    Example 2:
    Input: n = 1
    Output: [[1]] */
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
