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
    public void inorder(ArrayList<Integer> in,TreeNode root){
        if(root==null){
            return;
        }
        inorder(in,root.left);
        in.add(root.val);
        inorder(in,root.right);
       
    }
    public TreeNode balanced(ArrayList<Integer> in,int s,int e){
        if(s>e){
            return null;
        }
        int mid=(s+e)/2;
        TreeNode root=new TreeNode(in.get(mid));
        root.left=balanced(in,s,mid-1);
        root.right=balanced(in,mid+1,e);
        return root;
    }
    public TreeNode balanceBST(TreeNode root) {
        if(root==null){
            return null;
        }
        ArrayList<Integer> in=new ArrayList<>();
        inorder(in,root);
        root=balanced(in,0,in.size()-1);
        return root;
    }
}