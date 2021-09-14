/*
 * @lc app=leetcode.cn id=160 lang=java
 *
 * [160] 相交链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0;
        int lenB = 0;
        ListNode iterA = headA;
        ListNode iterB = headB;
        while (iterA!=null){
            lenA++;
            iterA=iterA.next;
        }
        while (iterB!=null){
            lenB++;
            iterB=iterB.next;
        }
        if(lenA<=lenB){
            iterA = headA;
            iterB = headB;
        }else{
            iterA = headB;
            iterB = headA;
        }
        int cnt=Math.abs(lenA-lenB);
        for(int i=0;i<cnt;i++){
            iterB=iterB.next;
        }
        while (iterA!=null&&iterB!=null){
            if (iterA==iterB)return iterA;
            else{
                iterA=iterA.next;
                iterB=iterB.next;
            }
        }
        return null;
    }
}
// @lc code=end

