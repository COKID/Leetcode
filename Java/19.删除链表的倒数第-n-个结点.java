/*
 * @lc app=leetcode.cn id=19 lang=java
 *
 * [19] 删除链表的倒数第 N 个结点
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ArrayList<ListNode> list= new ArrayList<ListNode>();
        ListNode t=head;
       
        while(t!=null){
            list.add(t);
            t=t.next;
        }
        int listLen= list.size();
        if(n==listLen){
            if(listLen!=1){
                return list.get(1);
            }else{
                return null;
            } 
        }else if(n==1){
            t=list.get(listLen-n-1);
            t.next=null;
            return head;
        }else{
            t = list.get(listLen-n-1);
            t.next=list.get(listLen-n).next;
            return head;
        }
    }
}
// @lc code=end

