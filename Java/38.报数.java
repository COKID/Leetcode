/*
 * @lc app=leetcode.cn id=38 lang=java
 *
 * [38] 报数
 *
 * https://leetcode-cn.com/problems/count-and-say/description/
 *
 * algorithms
 * Easy (47.35%)
 * Total Accepted:    23.9K
 * Total Submissions: 49.1K
 * Testcase Example:  '1'
 *
 * 报数序列是一个整数序列，按照其中的整数的顺序进行报数，得到下一个数。其前五项如下：
 * 
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 
 * 
 * 1 被读作  "one 1"  ("一个一") , 即 11。
 * 11 被读作 "two 1s" ("两个一"）, 即 21。
 * 21 被读作 "one 2",  "one 1" （"一个二" ,  "一个一") , 即 1211。
 * 
 * 给定一个正整数 n（1 ≤ n ≤ 30），输出报数序列的第 n 项。
 * 
 * 注意：整数顺序将表示为一个字符串。
 * 
 * 
 * 
 * 示例 1:
 * 
 * 输入: 1
 * 输出: "1"
 * 
 * 
 * 示例 2:
 * 
 * 输入: 4
 * 输出: "1211"
 * 
 * 
 */
class Solution {
    public String countAndSay(int n) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("1");
        for(int i=0;i<n;i++){
            String s=arrayList.get(i);
            char c=s.charAt(0);//新字符
            int flag=1;//字符数量
            StringBuilder temp=new StringBuilder();
            for(int j=1;j<s.length();j++){
                if(s.charAt(j)==c){
                    flag++;
                }else{
                    temp.append(Integer.toString(flag)).append(Character.toString(c));
                    c=s.charAt(j);
                    flag=1;
                }
            }
            temp.append(Integer.toString(flag)).append(Character.toString(c));
            arrayList.add(temp.toString());
        }
        return arrayList.get(n-1);
    }
}

