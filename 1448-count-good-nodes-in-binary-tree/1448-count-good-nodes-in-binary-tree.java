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
    
    private int count(TreeNode node, int max) {
        int count = 0;
        if (node != null) {
            if (node.val >= max) {
                max = node.val;
                count++;
            }
            count += count(node.left, max);
            count += count(node.right, max);
        }
        
        return count;
    }
}