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
    public int sizeOfList(ListNode head){
        int count = 0;
        ListNode pTmp = head;
        while(pTmp != null){
            count ++;
            pTmp = pTmp.next;
        }
        return count;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pTmp = head;
        ListNode pPrevious = null;
        if(n == sizeOfList(head)){
            pTmp = pTmp.next;
            head.next = null;
            head = pTmp;
        }
        else{
            if(sizeOfList(head) == 1)
            return null;
            for(int i = 1; i < sizeOfList(head) - n + 1; i++){
                pPrevious = pTmp;
                pTmp = pTmp.next;
            }
            pPrevious.next = pTmp.next;
            pTmp.next = null;
        }
        
        return head;
    }
}