/*
 * @lc app=leetcode.cn id=102 lang=java
 *
 * [102] 二叉树的层序遍历
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        if (root==null)return result;
        
        ArrayDeque<TreeNode> queue=new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()){
            int n=queue.size();
            ArrayList<Integer> tarray=new ArrayList<>();

            for(int i=0;i<n;i++){
                TreeNode node=queue.pop();
                tarray.add(node.val);
                if(node.left!=null)queue.add(node.left);
                if(node.right!=null)queue.add(node.right);
            }

            result.add(tarray);
        }

        return result;
    }
}
// @lc code=end

