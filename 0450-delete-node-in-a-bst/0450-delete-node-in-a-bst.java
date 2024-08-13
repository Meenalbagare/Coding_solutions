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
    public TreeNode inorderSucc(TreeNode root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null){
            return null;
        }
        if(key<root.val){
            root.left=deleteNode(root.left,key);
        }
        else if(key>root.val){
            root.right=deleteNode(root.right,key);
            
        }
        //case1 -leaf node
        else{
        if(root.left==null && root.right==null){
            return null;
        }
        //case2- one child
        if(root.left==null){
            return root.right;
        } else if(root.right==null){
            return root.left;
        }
        //case 3
        TreeNode IS=inorderSucc(root.right);
        root.val=IS.val;
        root.right=deleteNode(root.right,IS.val);
    }
        return root;
    }
    
}