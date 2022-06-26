/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) return head;
        
        ListNode head2 = head.next;
        ListNode node1 = head, node2 = head2;
        ListNode temp;
        
        while (node2 != null) {
            temp = node2.next;
            
            if (temp == null)
                node2.next = null;
            else 
                node2.next = node2.next.next;
            
            node1.next = temp;
            
            node1 = node1.next;
            node2 = node2.next;
        }
        
        node1 = head;
        while (node1.next != null) {
            node1 = node1.next;
        }
        
        node1.next = head2;
        
        ListNode n = head;
        while (n.next != null) {
            System.out.println(n.val);
            n = n.next;
        }
        return head;
    }
}