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
    int i1=0,i2=0;
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        TreeNode root=new TreeNode(preorder[i1++]);
        if(root.val!=postorder[i2]){
            root.left=constructFromPrePost(preorder,postorder);
        }
        if(root.val!=postorder[i2]){
            root.right=constructFromPrePost(preorder,postorder);
        }
        i2++;
        return root;
    }
}

