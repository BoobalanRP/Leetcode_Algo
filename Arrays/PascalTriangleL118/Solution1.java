package Arrays.PascalTriangleL118;
/* Pascal's Triangle
    Given an integer numRows, return the specific column and row of Pascal's triangle.
    In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
    Example 1:
    Input: numRows = 6
    6th row 4th column = 10
    Output: 10
    Example 2:
    Input: numRows = 6
    6th row 6th column = 1
    Output: 1  */
        // formula going to use nCr = n! / (r! * (n-r)!) 
        // here we know n-r is part of n. so we can exclude n-r! from the n! only need to n! upto r! range.
        // let say r = 3 and n = 10 means only we need 10 * 9 * 8 / (3 * 2 * 1) = 120 / 6 = 20

public class Solution1 {

    public static int generate(int row, int column) {

        int res = 1;

        for (int i = 0; i < column; i++) {
            res *= (row - i);
            res /= (i + 1);
        }

        return res;
    }

    public static void main(String[] args) {

        int row = 5;
        int column = 2;

        int result = generate(row, column);

        System.out.println(result);
    }
}