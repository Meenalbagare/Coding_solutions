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
    public boolean isValidBST(TreeNode root) {
        return validate(root,Double.NEGATIVE_INFINITY,Double.POSITIVE_INFINITY);
    }
    private boolean validate(TreeNode root, double minval,double maxval){
        if(root==null) {
            return true;
        }
        if(root.val<=minval || root.val>=maxval){
            return false;
        }
        return validate(root.left, minval, root.val) && validate(root.right, root.val, maxval);
    }
}