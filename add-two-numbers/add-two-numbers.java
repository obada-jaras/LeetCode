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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node1 = l1, node2 = l2;
        ListNode sumHead = new ListNode(0);
        ListNode sumCurrent = sumHead;
        
        int reminder = 0;
        while (node1 != null || node2 != null) {
            int tempSum;
            
            if (node1 == null) {
                tempSum = node2.val + reminder;
                node2 = node2.next;
            }

            else if (node2 == null) {
                tempSum = node1.val + reminder;
                node1 = node1.next;
            }
            
            else {
                tempSum = node1.val + node2.val + reminder;
                node1 = node1.next;
                node2 = node2.next;
            }

            reminder = tempSum / 10;
            tempSum = tempSum % 10;
            
            sumCurrent.val = tempSum;
            
            sumCurrent.next = new ListNode(0);
            sumCurrent = sumCurrent.next;
        }
        
        
        if (reminder != 0)
            sumCurrent.val = reminder;    
        
        
        //delete 0 at the end of Sum linkedlist
        sumCurrent = sumHead;
        while (sumCurrent.next.next != null) 
            sumCurrent = sumCurrent.next;
        
        
        if (sumCurrent.next.val == 0 && sumCurrent.next.next == null)
            sumCurrent.next = null;
        
        
        return sumHead;        
    }
}