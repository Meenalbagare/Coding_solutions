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
    public void helper(TreeNode root,List<String> pth,StringBuilder a){
        int temp=a.length();
        if(root.left==null && root.right==null){
            a.append(root.val);
            pth.add(a.toString());
        } else{
            a.append(root.val);
            a.append("->");
            if(root.right!=null){
                helper(root.right,pth,a);
            }
            if(root.left!=null){
                helper(root.left,pth,a);
            }
        }
        a.setLength(a.length() - (a.length() - temp));
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> pth=new ArrayList<>();
        helper(root,pth,new StringBuilder());
        return pth;
        
    }
}

