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
    public boolean isSubtree(TreeNode root, TreeNode sub) {
        if (root == null) {
            return false;
        } else if (isSameTree(root, sub)) {
            return true;
        } else {
            return isSubtree(root.right, sub) || isSubtree(root.left, sub);
        }
    }
    
    public boolean isSameTree(TreeNode root, TreeNode sub) {
        if (root == null || sub == null) {
            return root == null && sub == null;
        } else if (root.val == sub.val) {
            return isSameTree(root.right, sub.right) && isSameTree(root.left, sub.left);
        } else  {
            return false;
        }
    }
}