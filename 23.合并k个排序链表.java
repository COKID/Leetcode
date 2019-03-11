/*
 * @lc app=leetcode.cn id=23 lang=java
 *
 * [23] 合并K个排序链表
 *
 * https://leetcode-cn.com/problems/merge-k-sorted-lists/description/
 *
 * algorithms
 * Hard (42.40%)
 * Total Accepted:    15.6K
 * Total Submissions: 35.6K
 * Testcase Example:  '[[1,4,5],[1,3,4],[2,6]]'
 *
 * 合并 k 个排序链表，返回合并后的排序链表。请分析和描述算法的复杂度。
 * 
 * 示例:
 * 
 * 输入:
 * [
 * 1->4->5,
 * 1->3->4,
 * 2->6
 * ]
 * 输出: 1->1->2->3->4->4->5->6
 * 
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class Solution {//Not Accept
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList arrayList=new ArrayList<>();
        for(ListNode l:lists){
            while(l!=null){
                arrayList.add(l.val);
            }
        }
        Collections.sort(arrayList);
        ListNode temp=new ListNode(666);
        ListNode head=temp;
        Iterator iterator=arrayList.iterator();
        while(iterator.hasNext()){
            temp.next=new ListNode((int)iterator.next());
        }
        return head.next;
    }
}

