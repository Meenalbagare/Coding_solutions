# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    # def maxValue(self,root):
    #     if root is None:
    #         return 0
    #     leftMax=self.maxValue(root.left)
    #     rightMax=self.maxValue(root.right)
    #     maxi=0
    #     if leftMax>rightMax:
    #         maxi=leftMax
    #     else:
    #         maxi=rightMax
    #     if maxi<root.val:
    #         maxi=root.val
    #     return maxi
    # def minValue(self,root):
    #     if root is None:
    #         return 1000000000
    #     leftMax=self.minValue(root.left)
    #     rightMax=self.minValue(root.right)
    #     mini=0
    #     if leftMax<rightMax:
    #         mini=leftMax
    #     else:
    #         mini=rightMax
    #     if mini>root.val:
    #         mini=root.val
    #     return mini
        
    def isValidBST(self, root: Optional[TreeNode]) -> bool:
        def validate(node, min_val, max_val):
            if not node:
                return True
            
            # Check if the current node's value is within the valid range
            if node.val <= min_val or node.val >= max_val:
                return False
            
            # Recursively validate the left and right subtrees
            # For the left subtree, the maximum value should be the current node's value
            # For the right subtree, the minimum value should be the current node's value
            return (validate(node.left, min_val, node.val) and
                    validate(node.right, node.val, max_val))
        
        # Start validating the entire tree with initial range of negative/positive infinity
        return validate(root, float('-inf'), float('inf'))