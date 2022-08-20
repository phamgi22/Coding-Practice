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
    public List<List<Integer>> levelOrder(TreeNode root) {
        // bfs: top to bottom, left to righ ==> return level by level of the tree
        // constraints: number of root in the tree can be 0
       
        // instantiate a list of nodes in each level to return later
        List<List<Integer>> levels = new ArrayList<>();
        
        // number of node can be 0, checking if there is no root
        if (root == null) return levels;
        
        // there will definitely node to processs
        // plan: adding each node of each level to the queue, if that node has children => add children to queue
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> currentLevel = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.remove();
                currentLevel.add(node.val);
                
                if (node.left != null) {
                    queue.offer(node.left);
                }
                
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            
            levels.add(currentLevel);
        }
        
        return levels;
    }
}