/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 */

// @lc code=start
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
// @lc code=end

