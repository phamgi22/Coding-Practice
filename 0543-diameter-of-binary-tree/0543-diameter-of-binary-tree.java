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
    
    int res = -1;
    public int diameterOfBinaryTree(TreeNode root) {
        /*
        Question:
        - find the longest distance between two nodes
        
        Solving:
        - brute force: for every node, traverse left and right to find the distance beween the lowest node on both side
        - bottom up
        */
        
        dfs(root);
        return res;
    }
    
    
    private int dfs(TreeNode curr) {
        if (curr == null) return -1;
        
        int left = 1 + dfs(curr.left);
        int right = 1 + dfs(curr.right);
        res = Math.max(res, left + right);
        return Math.max(left,right);
    }
}