/*
 * @lc app=leetcode.cn id=206 lang=java
 *
 * [206] 反转链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head==null)return null;
        ListNode newHead=null;

        while (head!=null){
            ListNode t=head.next;//先把下一个头拿出来
            head.next=newHead;//当前节点头插

            newHead=head;//更新新链表的头
            head=t;//老链表的头
        }
        return newHead;
    }
}
// @lc code=end

