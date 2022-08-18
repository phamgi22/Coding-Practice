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
    List arr = new ArrayList ();
    
    public List getLonelyNodes(TreeNode root) {
        
        getNode(root);
        return arr;
    }
    
    private void getNode(TreeNode root) {
        if(root == null) {
            return;
        } else {
           if(root.left == null && root.right != null) { //if we look at the children and there is only one right child
               arr.add(root.right.val);
               getNode(root.right); 
           } else if (root.left != null && root.right == null) { ////if we look at the children and there is only one right child
               arr.add(root.left.val);
               getNode(root.left);
           } else { //call the function on both subtrees
               getNode(root.left);
               getNode(root.right);
           }
        }
    }
}