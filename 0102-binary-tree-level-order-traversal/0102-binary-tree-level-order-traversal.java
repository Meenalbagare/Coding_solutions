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
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null); // Marker for the end of the current level

        List<Integer> currentLevel = new ArrayList<>();
        
        while (!q.isEmpty()) {
            TreeNode curr = q.remove();
            if (curr == null) {
                result.add(new ArrayList<>(currentLevel));
                currentLevel.clear();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null); // Add marker for the next level
                }
            } else {
                currentLevel.add(curr.val);
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }

        return result;
    }
}