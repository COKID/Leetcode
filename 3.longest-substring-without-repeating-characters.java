import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 *
 * https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/description/
 *
 * algorithms
 * Medium (27.44%)
 * Total Accepted:    69.7K
 * Total Submissions: 253.9K
 * Testcase Example:  '"abcabcbb"'
 *
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * 
 * 示例 1:
 * 
 * 输入: "abcabcbb"
 * 输出: 3 
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 
 * 
 * 示例 2:
 * 
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 
 * 
 * 示例 3:
 * 
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 * 请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 * 
 * 
 */
class Solution {
    public int lengthOfLongestSubstring(String s) {
        ArrayList arrayList=new ArrayList<>();
        int max=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(arrayList.contains(c)){
                int index=arrayList.indexOf(c);
                max=max>arrayList.size()?max:arrayList.size();//先结算前面的长度
                for(int j=0;j<=index;j++){
                    arrayList.remove(0);
                }
                arrayList.add(c);
            }else{
                arrayList.add(c);
            }
        }
        return max>arrayList.size()?max:arrayList.size();
    }
}
