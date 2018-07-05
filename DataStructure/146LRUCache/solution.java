class LRUCache {
    private class Node {
        int v;
        int k;
        Node prev;
        Node next;
        Node(int k, int v) {
            this.k = k;
            this.v = v;
        }
        Node() {
            this(0, 0);
        }
    }
    
    Map<Integer, Node> map;
    Node head, tail;
    int capacity, count;
    
    private void addNode(Node n) {
        n.prev = head;
        n.next = head.next;
        head.next = n;
        n.next.prev = n;
    }
    
    private void removeNode(Node n) {
        n.prev.next = n.next;
        n.next.prev = n.prev;
    }
    public LRUCache(int capacity) {
        map = new HashMap<>();
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.prev = head;
        this.capacity = capacity;
        this.count = 0;
    }
    
    public int get(int key) {
        Node n = map.get(key);
        if (n == null) {
            return -1;
        }
        removeNode(n);
        addNode(n);
        return n.v;
    }
    
    public void put(int key, int value) {
        Node n = map.get(key);
        
        if (n == null) {
            n = new Node(key, value);
            map.put(key, n);
            count++;
            addNode(n);
        } else {
            n.v = value;
            removeNode(n);
            addNode(n);
        }
        if (count > capacity) {
            map.remove(tail.prev.k);
            removeNode(tail.prev);
            
            count--;
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */