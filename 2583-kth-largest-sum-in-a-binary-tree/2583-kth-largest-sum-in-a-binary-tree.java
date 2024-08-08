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
    long max=0;
    long s=0;
    List<Long> levelS=new ArrayList<>();
    public void helper(TreeNode root,int level){
        if(root==null){
            return;
        }
        if(levelS.size()<level){
            levelS.add(0L);
        }
        levelS.set(level-1,levelS.get(level-1)+root.val);
        helper(root.left,level+1);
        helper(root.right,level+1);
    }
    public long kthLargestLevelSum(TreeNode root, int k) {
        helper(root,1);
        if(levelS.size()<k){
            return -1;
        }
        Collections.sort(levelS,Collections.reverseOrder());
        return levelS.get(k-1);
        
    }
}