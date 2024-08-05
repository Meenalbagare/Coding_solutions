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
    public TreeNode insertInto(TreeNode root,int value){
        if(root==null){
            return new TreeNode(value);
        }
        else if(root.val<value){
            root.right=insertInto(root.right,value);
        } else {
            root.left=insertInto(root.left,value);
        } 
        return root;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root=new TreeNode(preorder[0]);
        for(int i=1;i<preorder.length;i++){
            root=insertInto(root,preorder[i]);
        }
        return root;
    }
}
