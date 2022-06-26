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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode node1 = list1, node2 = list2;
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        
        
        while (node1 != null && node2 != null && node2.val < node1.val) {
            ListNode temp = node2.next;
            node2.next = node1;
            
            list1 = node2;
            node1 = list1;
            node2 = temp;
        }
        
        while (node1.next != null && node2 != null) {
            ListNode temp;
            
            if (node2.val >= node1.val && node2.val < node1.next.val) {
                temp = node2.next;
                node2.next = node1.next;
                node1.next = node2;
                
                node2 = temp;
            }
            
            
            else {
                node1 = node1.next;
            }
        }
        
        if (node1.next == null && node2 != null) {
            node1.next = node2;
        }
        
            
        return list1;
    }
}