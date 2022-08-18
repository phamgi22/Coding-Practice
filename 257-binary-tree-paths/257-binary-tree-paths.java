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
    public List<String> binaryTreePaths(TreeNode root) {
        // store the list of path
        List<String> listPath = new ArrayList<>();
        
        if (root == null) return listPath;
        
        String path = Integer.toString(root.val);

        if (root.left == null && root.right == null) {
            listPath.add(path);
            return listPath;
        }
        
        if (root.left != null) dfs(root.left, path, listPath);
        if (root.right != null) dfs(root.right, path, listPath);
        return listPath;
    }
    
    // dfs()
    // input: a node, a String path, a list of paths
    // do: add no until reach leaf --- left to right
    // output: none
    private void dfs(TreeNode node, String path, List<String> listPath) {
        path += "->" + node.val;
        
        if (node.left == null && node.right == null) {
            listPath.add(path);
            return;
        }
        
        if (node.left != null) dfs(node.left, path, listPath);
        if (node.right != null) dfs(node.right, path, listPath);
    }
}