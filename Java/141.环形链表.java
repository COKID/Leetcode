/*
 * @lc app=leetcode.cn id=141 lang=java
 *
 * [141] 环形链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null||head.next==null)return false;

        ListNode fast=head.next;
        ListNode slow=head;
        
        while(fast!=slow){
            if (fast.next==null||fast.next.next==null)return false;
            slow=slow.next;
            fast=fast.next.next;
        }
        return true;
    }
}
// @lc code=end

