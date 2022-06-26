/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if (head == null) return null;
        
        Node dummyHead = new Node(0);
        dummyHead.child = head;
        
        recursiveFlatten(dummyHead);
         
        head.prev = null;
        return head;
    }
    
    
    public Node recursiveFlatten (Node curr) {

        Node tail = null;
        Node upHead = curr;
        curr = curr.child;

        while (curr != null) {

            if (curr.child != null) {
                recursiveFlatten(curr);
            }
            
            if (curr.next == null) {
                tail = curr;
                
                Node afterTail = upHead.next;
                if (afterTail != null)
                    afterTail.prev = tail;
                tail.next = afterTail;
            
                Node child = upHead.child;
                upHead.next = child;
                child.prev = upHead;
                upHead.child = null;

                break;
            }
            
            curr = curr.next;
        }
        
        return upHead;
    }
}