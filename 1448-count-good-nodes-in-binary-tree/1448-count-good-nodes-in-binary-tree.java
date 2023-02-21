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
    public int goodNodes(TreeNode root) {
        return count(root, root.val);
    }
    
    private int count(TreeNode root, int max) {
        int count = 0;
        if (root != null) {
            if (root.val >= max) {
                max = root.val;
                count++;
            }
            
            count += count(root.left, max);
            count += count(root.right, max);
        }
        
        return count;
    }
}