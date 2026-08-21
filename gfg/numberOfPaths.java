class Solution {
    public int numberOfPaths(int m, int n) {
        // code here
        if(m==1 || n==1){
            return 1;
        }
        return numberOfPaths(m,n-1)+numberOfPaths(m-1,n);
    }
}

/* 
Count Paths from Top Left to Bottom Right
Difficulty: MediumAccuracy: 67.64%Submissions: 166K+Points: 4
Given two integers m and n representing the number of rows and columns of a grid, respectively, find the number of distinct paths from the top-left cell (0, 0) to the bottom-right cell (m - 1, n - 1). From any cell, you can move only right or down.

Note: The answer is guaranteed to fit within a 32-bit integer.

Examples:

Input: m = 2, n = 3
Output: 3
Explanation: There are three distinct paths from the top-left cell to the bottom-right cell.
 
Input: m = 1, n = 4
Output: 1
Explanation: There is only one possible path from the top-left cell to the bottom-right cell.

Constraints:
1 ≤ m ≤ 100
1 ≤ n ≤ 100
*/
