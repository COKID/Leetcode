/*
 * @lc app=leetcode.cn id=67 lang=java
 *
 * [67] 二进制求和
 *
 * https://leetcode-cn.com/problems/add-binary/description/
 *
 * algorithms
 * Easy (45.54%)
 * Total Accepted:    19K
 * Total Submissions: 40.3K
 * Testcase Example:  '"11"\n"1"'
 *
 * 给定两个二进制字符串，返回他们的和（用二进制表示）。
 * 
 * 输入为非空字符串且只包含数字 1 和 0。
 * 
 * 示例 1:
 * 
 * 输入: a = "11", b = "1"
 * 输出: "100"
 * 
 * 示例 2:
 * 
 * 输入: a = "1010", b = "1011"
 * 输出: "10101"
 * 
 */
class Solution {
    public String addBinary(String a, String b) {
        int i=a.length();int j=b.length();
        int flag=0;//进位
        String result="";
        while(i>0&&j>0){
            i--;
            j--;
            char ca=a.charAt(i);
            char cb=b.charAt(j);
            int t=Integer.valueOf(ca-'0')+Integer.valueOf(cb-'0')+flag;
            flag=t/2;
            result=Integer.toString(t%2)+result;
        }
        while(i>0){
            i--;
            char ca=a.charAt(i);
            int t=Integer.valueOf(ca-'0')+flag;
            flag=t/2;
            result=Integer.toString(t%2)+result;
        }
        while(j>0){
            j--;
            char cb=b.charAt(j);
            int t=Integer.valueOf(cb-'0')+flag;
            flag=t/2;
            result=Integer.toString(t%2)+result;
        }
        while(flag>0){
            result=Integer.toString(flag%2)+result;
            flag/=2;
        }
        return result;
    }
}


