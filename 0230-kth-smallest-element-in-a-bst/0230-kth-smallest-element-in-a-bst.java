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
    public int kthSmallest(TreeNode root, int k) {
        // we rememeber what element we are on, which smallest element we are
        // we remember the result that we want to return
        int[] nums = new int[2];
        inorder(root, nums, k);
        
        return nums[1];
    }
    
    
    private void inorder(TreeNode root, int[] nums, int k) {
        if (root == null) return;
        
        inorder(root.left, nums, k);
        if (++nums[0] == k) {
            nums[1] = root.val;
            return;
        } 
        
        inorder(root.right, nums, k);
    }
}