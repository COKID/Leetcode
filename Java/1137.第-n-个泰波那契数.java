/*
 * @lc app=leetcode.cn id=1137 lang=java
 *
 * [1137] 第 N 个泰波那契数
 */

// @lc code=start
class Solution {
    public int tribonacci(int n){
        int a[]=new int[n+3];
        a[0]=0;
        a[1]=1;
        a[2]=1;
        for(int i=3; i<=n; i++){
            a[i]=a[i-1]+a[i-2]+a[i-3];
        }
        return a[n];
    }
}
// @lc code=end

