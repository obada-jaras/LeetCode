
class MyLinkedList {
    Node head;
    Node tail;
    int size;
    
    public MyLinkedList() {

    }

    public int get(int index) {
        if (index >= size) return -1;
        
        Node node = head;
        for (int i = 0; i < index; i++){
            node = node.next;
        }
        
        return node.val;
    }
    
    
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        
        if (size == 0) {
            head = newNode;
            tail = newNode;
        }
        
        else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        
        size++;
    }    
    
    
    public void addAtTail(int val) {
        Node newNode = new Node(val);
        
        if (size == 0) {
            head = newNode;
            tail = newNode;
        }
        
        
        else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        
        size++;
    }
    
    
    public void addAtIndex(int index, int val) {
        if (index == size) {
        	addAtTail(val);
        	return;
        }
        
        if (index == 0) {
        	addAtHead(val);
        	return;
        }
        
        if (index < size) {
            Node newNode = new Node(val);
            Node tempNode = head;

            for (int i = 0; i < index-1; i++) {
                tempNode = tempNode.next;
            }
            
            newNode.next = tempNode.next;
            tempNode.next = newNode;
            
            newNode.prev = tempNode;
            newNode.next.prev = newNode;

            size++;
        }
    }
    
    public void deleteAtIndex(int index) {
    	if (index >= size) return;
    	
    	if (size == 1) {
    		head = null;
            tail = null;
            size--;
    		return;
    	}
    	
    	if (index == 0) {
    		head = head.next;
            head.prev = null;
    		size--;
    		return;
    	}
        
        if (index == size-1) {
            tail = tail.prev;
            tail.next = null;
            size--;
            return;
        }
    	
        Node tempNode = head;
        for (int i = 0; i < index-1; i++) {
            tempNode = tempNode.next;
        }
        
        tempNode.next = tempNode.next.next;
        tempNode.next.prev = tempNode;
        size--;
    }
    
    
    
    public String toString() {
    	Node tempNode = head;
    	String str = "";
    	
    	if (size == 0) return str;
    	
    	
    	while (tempNode != null) {
    		str += tempNode.val + ", ";
    		tempNode = tempNode.next;
    	}
    	
		return str;
    }
}

class Node {
    public int val;
    public Node next, prev;
    
    public Node(int x) {
        val = x;
    }
}

