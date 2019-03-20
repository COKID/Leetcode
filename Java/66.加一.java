import com.sun.org.apache.regexp.internal.recompile;

/*
 * @lc app=leetcode.cn id=66 lang=java
 *
 * [66] 加一
 *
 * https://leetcode-cn.com/problems/plus-one/description/
 *
 * algorithms
 * Easy (36.91%)
 * Total Accepted:    41.6K
 * Total Submissions: 109.9K
 * Testcase Example:  '[1,2,3]'
 *
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 * 
 * 最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
 * 
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 * 
 * 示例 1:
 * 
 * 输入: [1,2,3]
 * 输出: [1,2,4]
 * 解释: 输入数组表示数字 123。
 * 
 * 
 * 示例 2:
 * 
 * 输入: [4,3,2,1]
 * 输出: [4,3,2,2]
 * 解释: 输入数组表示数字 4321。
 * 
 * 
 */
class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        int flag=0;//进位标志
        digits[n-1]++;//先加一
        if(digits[n-1]==10){//有进位
            digits[n-1]=0;
            flag=1;
            for(int i=n-2;i>=0&&flag==1;i--){
                digits[i]=digits[i]+flag;
                if(digits[i]==10){
                    digits[i]=0;
                    flag=1;
                }else{
                    flag=0;
                }
            }
            if(flag==1){
                int copy[]=new int[n+1];
                copy[0]=1;
                System.arraycopy(digits, 0, copy, 1, n);
                return copy;
            }else{
                return digits;
            }
        }else{
            return digits;
        } 
    }
}

