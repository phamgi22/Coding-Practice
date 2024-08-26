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
    public int closestValue(TreeNode root, double target) {
        int closest = root.val;
        int val = root.val;
        
        while (root != null) {
            val = root.val;
            
            boolean smaller_val_diff = Math.abs(target - val) < Math.abs(target - closest);
            boolean equal_val_diff = Math.abs(target - val) == Math.abs(target - closest);
            
            if (smaller_val_diff == true || (equal_val_diff && val < closest)) {
                closest = val;
            }
            
            if (target < root.val) {
                root = root.left;
            } else {
                root = root.right;
            }
        }
        
        return closest;
    }
}