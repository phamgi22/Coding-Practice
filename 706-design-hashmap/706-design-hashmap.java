class MyHashMap {
    int[] map;
    public MyHashMap() {
        this.map = new int[1000001];
        for (int i = 0; i < map.length; i++) map[i] = -1;
    }
    
    public void put(int key, int value) {
        this.map[key] = value;
    }
    
    public int get(int key) {
        return this.map[key];
    }
    
    public void remove(int key) {
        this.map[key] = -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */