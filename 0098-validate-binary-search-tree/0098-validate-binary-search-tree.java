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
public class Solution {
    public boolean helper(TreeNode root,TreeNode min,TreeNode max){
        if(root==null){
            return true;
        }
        if(min!=null && root.val<=min.val){
            return false;
        } else if(max!=null && root.val >=max.val){
            return false;
        }
        return helper(root.left,min,root) && helper(root.right,root,max);
    }
    public boolean isValidBST(TreeNode root) {
        TreeNode min=null;
        TreeNode max=null;
        return helper(root,min,max);
    }
}    