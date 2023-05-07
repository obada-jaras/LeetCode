class ListNode {
    public int key;
    public int val;
    public ListNode next;
    
    public ListNode() {
        this.key = -1;
        this.val = -1;
        this.next = null;
    }
}

class MyHashMap {
    private final int ARR_SIZE = 1000;
    private ListNode[] map;

    public MyHashMap() {
        this.map = new ListNode[ARR_SIZE];
        
        for (int i = 0; i < ARR_SIZE; i++) {
            map[i] = new ListNode();
        }
    }
    
    private int hash(int key) {
        return key % ARR_SIZE;
    }
    
    public void put(int key, int value) {
        ListNode currNode = map[hash(key)];
        
        while (currNode.next != null) {
            if (currNode.next.key == key) {
                currNode.next.val = value;
                return;
            }
            
            currNode = currNode.next;
        }
        
        ListNode node = new ListNode();
        node.key = key;
        node.val = value;

        currNode.next = node;
    }
    
    public int get(int key) {
        ListNode currNode = map[hash(key)];
        
        while (currNode.next != null) {
            if (currNode.next.key == key) {
                return currNode.next.val;
            }
            
            currNode = currNode.next;
        }
        
        return -1;
    }
    
    public void remove(int key) {
        ListNode currNode = map[hash(key)];
        
        while (currNode != null && currNode.next != null) {
            if (currNode.next.key == key) {
                currNode.next = currNode.next.next;
                return;
            }
            
            currNode = currNode.next;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */