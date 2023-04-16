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
        ListNode merged = new ListNode(0);
        
        ListNode p1 = list1, p2 = list2, pM = merged;
        while (p1 != null && p2 != null) {
            if (p1.val < p2.val) {
                pM.next = p1;
                p1 = p1.next;
            }
            
            else {
                pM.next = p2;
                p2 = p2.next;
            }
            
            pM = pM.next;
        }
        
        
        ListNode pR = (p1 != null) ? p1 : p2;
        while (pR != null) {
            pM.next = pR;
            pR = pR.next;
            pM = pM.next;
        }
        
        return merged.next;
    }
}