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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;
        
        ListNode curr = head;
        int size = 1;
        
        while (curr.next != null) {
            size++;
            curr = curr.next;
        }
        
        if (k == size) 
            return head;

        else if (k > size) 
            k = k % size;
        k = size - k;
        

        curr.next = head;

        

        curr = head;
        for (int i = 0; i < k; i++) 
            curr = curr.next;
        head = curr;
        
        
        for (int i = 0; i < size-1; i++) 
            curr = curr.next;
        curr.next = null;
        
        
        return head;
    }
}