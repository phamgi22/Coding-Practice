class Trie {
    private Node root;
    public Trie() {
        root = new Node('\0');
    }
    
    public void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (curr.chi[c - 'a']  == null) curr.chi[c - 'a'] = new Node(c);
            curr = curr.chi[c - 'a'];
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
            if (curr.chi[c - 'a'] == null) return null;
            curr = curr.chi[c - 'a'];
        }
        
        return curr;
    }
    
    public class Node {
        public char c;
        public boolean isWord;
        public Node[] chi;
        public Node(char c) {
            this.c = c;
            isWord = false;
            chi = new Node[26];
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