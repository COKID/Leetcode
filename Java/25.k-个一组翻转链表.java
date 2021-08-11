/*
 * @lc app=leetcode.cn id=25 lang=java
 *
 * [25] K 个一组翻转链表
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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null)return head;
        int n=0;
        ListNode nhead=head;
        while (nhead!=null){
            n++;
            nhead=nhead.next;
        }
        if(k==1||n<k)return head;

        ListNode[] headpack;
        ListNode rhead,rtail,ohead;

        headpack=reverseList(head,k);
        rhead=headpack[0];
        rtail=headpack[1];
        ohead=headpack[2];
        n-=k;
        while (n>=k){
            headpack=reverseList(ohead,k);
            rtail.next=headpack[0];//接上
            rtail=headpack[1];
            ohead=headpack[2];
            n-=k;
        }
        rtail.next=ohead;
        return rhead;
    }
    public ListNode[] reverseList(ListNode head, int k) {
        ListNode[] result=new ListNode[3];
        result[1]=head;

        ListNode newHead=null;
        ListNode oldHead=head;

        while (k-->0){
            ListNode t=oldHead.next;//先把下一个头拿出来
            oldHead.next=newHead;//当前节点头插

            newHead=oldHead;//更新新链表的头
            oldHead=t;//老链表的头
        }
        result[0]=newHead;
        result[2]=oldHead;
        return result;
    }
}
// @lc code=end

