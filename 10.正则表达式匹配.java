/*
 * @lc app=leetcode.cn id=10 lang=java
 *
 * [10] 正则表达式匹配
 *
 * https://leetcode-cn.com/problems/regular-expression-matching/description/
 *
 * algorithms
 * Hard (20.50%)
 * Total Accepted:    9.6K
 * Total Submissions: 45.5K
 * Testcase Example:  '"aa"\n"a"'
 *
 * 给定一个字符串 (s) 和一个字符模式 (p)。实现支持 '.' 和 '*' 的正则表达式匹配。
 * 
 * '.' 匹配任意单个字符。
 * '*' 匹配零个或多个前面的元素。
 * 
 * 
 * 匹配应该覆盖整个字符串 (s) ，而不是部分字符串。
 * 
 * 说明:
 * 
 * 
 * s 可能为空，且只包含从 a-z 的小写字母。
 * p 可能为空，且只包含从 a-z 的小写字母，以及字符 . 和 *。
 * 
 * 
 * 示例 1:
 * 
 * 输入:
 * s = "aa"
 * p = "a"
 * 输出: false
 * 解释: "a" 无法匹配 "aa" 整个字符串。
 * 
 * 
 * 示例 2:
 * 
 * 输入:
 * s = "aa"
 * p = "a*"
 * 输出: true
 * 解释: '*' 代表可匹配零个或多个前面的元素, 即可以匹配 'a' 。因此, 重复 'a' 一次, 字符串可变为 "aa"。
 * 
 * 
 * 示例 3:
 * 
 * 输入:
 * s = "ab"
 * p = ".*"
 * 输出: true
 * 解释: ".*" 表示可匹配零个或多个('*')任意字符('.')。
 * 
 * 
 * 示例 4:
 * 
 * 输入:
 * s = "aab"
 * p = "c*a*b"
 * 输出: true
 * 解释: 'c' 可以不被重复, 'a' 可以被重复一次。因此可以匹配字符串 "aab"。
 * 
 * 
 * 示例 5:
 * 
 * 输入:
 * s = "mississippi"
 * p = "mis*is*p*."
 * 输出: false
 * 
 */
class Solution {
    public boolean isMatch(String s, String p) {
        return java.util.regex.Pattern.matches(p,s);
        // if(s==null||p==null||s.equals("")||p.equals(""))return false;
        // int i=0;
        // for(i=0;i<s.length();i++){
        //     if(p.equals(""))return false;
        //     if(p.charAt(0)=='.'||(s.charAt(i)==p.charAt(0))){//开头是 .或者是相同字母
        //         if(p.length()>=2){
        //             if(p.charAt(1)!='*')p=p.substring(1);//消耗
        //         }else{p=p.substring(1);}//消耗
        //         continue;
        //     }
        //     if(p.charAt(0)>='a'&&p.charAt(0)<='z'){//开头是字母但是不相同
        //             if(p.length()>=2){//长度大于2
        //                 if(p.charAt(1)=='*'){
        //                     p=p.substring(2);
        //                     i--;
        //                     continue;
        //                 }else return false;
        //             }else return false;
        //     }
        //     return false;
        // }//匹配完成
        // if(p.length()>=4){//解决a*c*b*
        //     for(int j=2;j<p.length()-1;j++){
        //         if(p.charAt(j)>='a'&&p.charAt(j)<='z'&&p.charAt(j+1)=='*'){
        //             p=p.substring(0,j)+p.substring(j+2);
        //             j-=2;
        //         }
        //     }
        // }
        // while(p.length()>=3&&s.charAt(s.length()-1)==p.charAt(2)&&(p.charAt(0)==p.charAt(2)||p.charAt(0)=='.')&&p.charAt(1)=='*'){//化简a*a .*c
        //     p=p.substring(0,2)+p.substring(3);
        // }
        // if(p.length()==0)return true;
        // if(p.length()==2){
        //     if(p.charAt(1)=='*')return true;
        // }
        // return false;
    }
}

