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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) {
            return false;
        } else if (isSameTree(root, subRoot)) {
            return true;
        } else {
            return isSubtree(root.right, subRoot) || isSubtree(root.left, subRoot);
        }
    }
    
    public boolean isSameTree(TreeNode root, TreeNode subRoot) {
        if (root == null || subRoot == null) {
            return root == null && subRoot == null;
        } else if (root.val == subRoot.val) {
            return isSameTree(root.left, subRoot.left) && isSameTree(root.right, subRoot.right);
        } else {
            return false;
        }
    }
}