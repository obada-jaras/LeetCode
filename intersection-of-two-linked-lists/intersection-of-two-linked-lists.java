/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode nodeA = headA;
        ListNode nodeB = headB;
        int countA = 0, countB = 0;
        
        while (nodeA != null) {
            nodeA = nodeA.next;
            countA++;
        }
        
        while (nodeB != null) {
            nodeB = nodeB.next;
            countB++;
        }
        
        
        nodeA = headA;
        nodeB = headB;
        
        if (countA > countB) {
            for (int i = 0; i < countA-countB; i++) 
                nodeA = nodeA.next;
        }
        
        else {
           for (int i = 0; i < countB-countA; i++) 
                nodeB = nodeB.next;
        }
        
         while (nodeA != null) {
            if (nodeA == nodeB) return nodeA;
            nodeA = nodeA.next;
            nodeB = nodeB.next;
        }
        
        return null;
    }
}