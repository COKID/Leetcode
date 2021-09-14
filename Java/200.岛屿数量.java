/*
 * @lc app=leetcode.cn id=200 lang=java
 *
 * [200] 岛屿数量
 */

// @lc code=start
class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int cnt=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(grid[i][j]=='1'){
                    cnt++;
                    search(grid,i,j);
                }
            }
        }
        return cnt;
    }
    public void search(char[][]grid,int i,int j){
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length||grid[i][j]!='1'){
            return;
        }
        grid[i][j]='2';
        search(grid,i,j-1);
        search(grid,i,j+1);
        search(grid,i-1,j);
        search(grid,i+1,j);
    }
}
// @lc code=end

