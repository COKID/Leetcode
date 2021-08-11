/*
 * @lc app=leetcode.cn id=66 lang=java
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
