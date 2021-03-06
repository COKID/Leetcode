/*
 * @lc app=leetcode.cn id=2 lang=java
 *
 * [2] 两数相加
 *
 * https://leetcode-cn.com/problems/add-two-numbers/description/
 *
 * algorithms
 * Medium (31.82%)
 * Total Accepted:    74.8K
 * Total Submissions: 235K
 * Testcase Example:  '[2,4,3]\n[5,6,4]'
 *
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * 
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * 
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * 
 * 示例：
 * 
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 * 
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
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int flag=0;//进位标志位
        ListNode result=new ListNode(-1);//头指针
        ListNode rear=result;//尾指针
        int a;
        while(l1!=null&&l2!=null){
            a=l1.val+l2.val+flag;
            ListNode temp=new ListNode(a%10);
            rear.next=temp;
            rear=rear.next;
            flag=a/10;
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null){
            a=l1.val+flag;
            ListNode temp=new ListNode(a%10);
            rear.next=temp;
            rear=rear.next;
            flag=a/10;
            l1=l1.next;
        }
        while(l2!=null){
            a=l2.val+flag;
            ListNode temp=new ListNode(a%10);
            rear.next=temp;
            rear=rear.next;
            flag=a/10;
            l2=l2.next;
        }
        if(flag==1){
            ListNode temp=new ListNode(1);
            rear.next=temp;
            rear=rear.next;
        }
        result=result.next;
        return result;
    }
}
