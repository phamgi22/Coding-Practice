/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

/*
Undirected graph: each node is connected both way
Node 1, [2 3]
Node 2, [1 4]
Node 3, [1 4]
Node 4, [2 3]

As we travel thru each node we make copy
*/

class Solution {
    public Node cloneGraph(Node node) {
        if (node == null) return null;
        Map<Integer, Node> map = new HashMap<>();
        return clone(node, map);
    }
    
    private Node clone(Node node, Map<Integer, Node> map) {
        if (map.containsKey(node.val)) return map.get(node.val);
        Node copy = new Node(node.val);
        map.put(node.val, copy);
        for (Node nei : node.neighbors) {
            copy.neighbors.add(clone(nei, map));
        }
        
        return copy;
    }
}