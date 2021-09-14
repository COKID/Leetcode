/*
 * @lc app=leetcode.cn id=169 lang=java
 *
 * [169] 多数元素
 */

// @lc code=start
class Solution {
    public int majorityElement(int[] nums) {
        int res=0;
        int cnt=0;
        for (int num : nums) {
            if (cnt == 0) {
                res = num;
                cnt++;
            } else {
                if (res == num) {
                    cnt++;
                } else {
                    cnt--;
                }
            }
        }
        return res;
    }
}
// @lc code=end

