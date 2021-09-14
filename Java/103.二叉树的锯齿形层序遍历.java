/*
 * @lc app=leetcode.cn id=103 lang=java
 *
 * [103] 二叉树的锯齿形层序遍历
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        boolean l2r=true;
        Stack<TreeNode> stack1=new Stack<>();
        Stack<TreeNode> stack2=new Stack<>();
        stack1.push(root);
        ArrayList<Integer> templist=new ArrayList<>();

        while (!stack1.empty()){
            TreeNode node=stack1.pop();
            if(node==null)continue;
            templist.add(node.val);

            if(l2r){
                if(node.left!=null)stack2.push(node.left);
                if(node.right!=null)stack2.push(node.right);
            }else{
                if(node.right!=null)stack2.push(node.right);
                if(node.left!=null)stack2.push(node.left);
            }

            if(stack1.empty()){//最后一个
                stack1=stack2;
                stack2=new Stack<TreeNode>();
                result.add(templist);
                templist=new ArrayList<>();
                l2r=!l2r;
            }
        }

//        if(!templist.isEmpty())result.add(templist);
        return result;
    }
}
// @lc code=end

