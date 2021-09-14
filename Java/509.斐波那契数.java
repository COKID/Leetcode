/*
 * @lc app=leetcode.cn id=509 lang=java
 *
 * [509] 斐波那契数
 */

// @lc code=start
class Solution {
    public int fib(int n){
        int a[]=new int[n+2];
        a[0]=0;
        a[1]=1;
        for(int i=2; i<=n; i++){
            a[i]=a[i-1]+a[i-2];
        }
        return a[n];
    }
}
// @lc code=end

