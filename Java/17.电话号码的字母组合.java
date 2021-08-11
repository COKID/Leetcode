/*
 * @lc app=leetcode.cn id=17 lang=java
 *
 * [17] 电话号码的字母组合
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// @lc code=start
class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.equals("")||digits==null){
            return new ArrayList<String>();
        }
        Map<Character,String> map=new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        List<String> result= new ArrayList<String>();
        result.add("");
        for(int i=0;i<digits.length();i++){
            String letterSeq=map.get(digits.charAt(i));
            int resultSize=result.size();
            for(int j=0;j<resultSize;j++){
                String topStr=result.remove(0);
                for(int k=0;k<letterSeq.length();k++){
                    result.add(topStr+letterSeq.charAt(k));
                }
            }

        }
        return result;
    }
}
// @lc code=end

