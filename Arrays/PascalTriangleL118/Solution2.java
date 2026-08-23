package Arrays.PascalTriangleL118;

import java.util.*;
/* Pascal's Triangle
    Given an integer numRows, return the nth row of Pascal's triangle.
    In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
    Example 1:
    Input: numRows = 6
    Output: [1,5,10,10,5,1]
    Example 2:
    Input: numRows = 1
    Output: [1] 
    Example 3:
    Input: numRows = 2
    Output: [1,1] */

    public class Solution2 {
    
        public static List<Integer> generate(int row) {
            List<Integer> res = new ArrayList<>();
    
            int ans = 1;
            res.add(ans);
    
            for (int i = 1; i < row; i++) {
                ans *= row - i;
                ans /= i;
                res.add(ans);
            }
    
            return res;
        }
    
        public static void main(String[] args) {
    
            int row = 6;
    
            List<Integer> result = generate(row);
    
            System.out.println(result);
        }
    }
