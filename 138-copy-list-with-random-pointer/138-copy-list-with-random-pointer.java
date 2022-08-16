/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/
class Solution {
    Map<Node,Node> map = new HashMap<Node,Node>();
    
    // param: node from original linked list
    // do : link the original node to a copy node in the map
    // return: copy node
    public Node getClonedNode(Node node) {
        if (node != null) {
            if (map.containsKey(node)) {
                return this.map.get(node);
            } else {
                map.put(node, new Node(node.val, null, null));
                return this.map.get(node);
            }
        }
        return null;
    }
    
    // param: head node of original linked list
    // do : idicate next and random pointer on copy list
    // return head node of copy linked list
    public Node copyRandomList(Node head) {
        if (head == null) return null;
        
        Node origin = head;
        Node copy = new Node(origin.val);
        this.map.put(origin, copy);
        
        while(origin != null) {
            copy.next = this.getClonedNode(origin.next);
            copy.random = this.getClonedNode(origin.random);
            copy = copy.next;
            origin = origin.next;
        }
        
        return this.map.get(head);
    }
}