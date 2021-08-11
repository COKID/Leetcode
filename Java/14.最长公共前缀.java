/*
 * @lc app=leetcode.cn id=14 lang=java
 *
 * [14] 最长公共前缀
 *
 * https://leetcode-cn.com/problems/longest-common-prefix/description/
 *
 * algorithms
 * Easy (31.35%)
 * Total Accepted:    56.7K
 * Total Submissions: 175.8K
 * Testcase Example:  '["flower","flow","flight"]'
 *
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 
 * 如果不存在公共前缀，返回空字符串 ""。
 * 
 * 示例 1:
 * 
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 
 * 
 * 示例 2:
 * 
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 
 * 
 * 说明:
 * 
 * 所有输入只包含小写字母 a-z 。
 * 
 */
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null||strs.length==0)return "";
        String temp=new String(strs[0]);
        for(int i=1;i<strs.length;i++){
            int flag=-1;
            for(int j=0;j<strs[i].length()&&j<temp.length();j++){
                if(temp.charAt(j)==strs[i].charAt(j)){
                    flag=j;
                }else{
                    break;
                }
            }
            if(flag==-1){
                return "";
            }else{
                temp=temp.substring(0, flag+1);
            }
        }
        return temp;
    }
}

