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
    public int maxAncestorDiff(TreeNode root) {
        return dfs(root, root.val, root.val);
    }
    
    private int dfs(TreeNode root, int min, int max) {
        if (root == null) {
            return max - min;
        }
        
        min = Math.min(min, root.val);
        max = Math.max(max, root.val);
        
        int left = dfs(root.left, min, max);
        int right = dfs(root.right, min, max);
        
        return Math.max(left, right);
    }
}