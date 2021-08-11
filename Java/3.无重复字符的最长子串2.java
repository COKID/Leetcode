/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] m = new int[128];
        int len = 0;
        for(int i = 0, j = 0; j < s.length(); j++){
            i = Math.max(m[s.charAt(j)], i);
            len = Math.max(len, j - i + 1);
            m[s.charAt(j)] = j + 1;
        }
        return len;
    }  
}
// @lc code=end

