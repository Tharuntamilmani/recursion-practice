class Solution {
    public int findpath(int i, int j, int[][]grid){
        if(i>=grid.length || j>=grid[0].length || i<0 || j<0 || grid[i][j]==1){
            return 0;
        }
        if(i==grid.length-1 && j==grid[0].length-1){
            return 1;
        }
        return findpath(i+1,j,grid) + findpath(i,j+1,grid);
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        return findpath(0,0,obstacleGrid);
    }
}
