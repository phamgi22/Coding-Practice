class Trie {
    private Node root;
    public Trie() {
        root = new Node('*');
    }
    
    public void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if(curr.child[c - 'a'] == null) curr.child[c - 'a'] = new Node(c);
            curr = curr.child[c - 'a'];
        }
        
        curr.isWord = true;
    }
    
    public boolean search(String word) {
        return get(word) != null && get(word).isWord == true;
    }
    
    public boolean startsWith(String prefix) {
        return get(prefix) != null;
    }
    
    private Node get(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (curr.child[c - 'a'] == null) return null;
            curr = curr.child[c - 'a'];
        }
        
        return curr;
    }
    
    public class Node {
        private char c;
        private boolean isWord;
        private Node[] child;
        public Node(char c) {
            this.c = c;
            isWord = false;
            child = new Node[26];
        } 
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */