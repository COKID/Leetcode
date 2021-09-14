/*
 * @lc app=leetcode.cn id=415 lang=java
 *
 * [415] 字符串相加
 */

// @lc code=start
class Solution {
    public String addStrings(String num1, String num2) {
        int i=num1.length()-1;
        int j=num2.length()-1;
        StringBuilder sb=new StringBuilder();
        int flag=0;
        while(i>=0&&j>=0){
            char c1=num1.charAt(i);
            char c2=num2.charAt(j);
            char x= (char) ((c1-'0'+c2-'0'+flag)%10+'0');
            flag=(c1-'0'+c2-'0'+flag)/10;
            sb.append(x);
            i--;
            j--;
        }
        while (i>=0){
            char c1=num1.charAt(i);
            char x= (char) ((c1-'0'+flag)%10+'0');
            flag=(c1-'0'+flag)/10;
            sb.append(x);
            i--;
        }
        while (j>=0){
            char c2=num2.charAt(j);
            char x= (char) ((c2-'0'+flag)%10+'0');
            flag=(c2-'0'+flag)/10;
            sb.append(x);
            j--;
        }
        if(flag==1)sb.append(flag);

        return sb.reverse().toString();
    }
}
// @lc code=end

