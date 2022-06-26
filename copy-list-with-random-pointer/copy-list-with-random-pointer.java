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
    public Node copyRandomList(Node head) {
        if (head == null) return null;
        
        Node curr = head;
        while (curr != null) {
            Node tempNode = curr.next;

            curr.next = new Node(curr.val);
            curr.next.next = tempNode;
            curr = tempNode;
        }
        
        
        curr = head;
        while (curr != null) {
            if (curr.random == null)
                curr.next.random = null;
            else
                curr.next.random = curr.random.next;
            
            curr = curr.next.next;
        }


        Node original = head;
        Node copyHead = head.next;
        Node copy = copyHead;
        while (original != null) {
            original.next = original.next.next;
            copy.next = (copy.next == null) ? null : copy.next.next;
            
            original = original.next;
            copy = copy.next;
        }
        
        return copyHead;
    }
}