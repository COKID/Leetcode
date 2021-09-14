/*
 * @lc app=leetcode.cn id=704 lang=java
 *
 * [704] 二分查找
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        int min=0;
        int max=nums.length;
        while (min!=max){
            int n=(min+max)/2;
            if(target==nums[n])return n;
            else if(target>nums[n]){
                min=n+1;
            }else {
                max=n;
            }
        }
        return -1;
    }
}
// @lc code=end

