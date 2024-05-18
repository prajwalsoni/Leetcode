class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return;
        }

        // Step 1: Find the middle of the list
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half of the list
        ListNode secondHalf = slow.next;
        slow.next = null; // Split the list into two halves
        ListNode prev = null;
        while (secondHalf != null) {
            ListNode nextNode = secondHalf.next;
            secondHalf.next = prev;
            prev = secondHalf;
            secondHalf = nextNode;
        }
        
        // Step 3: Merge the two halves
        ListNode firstHalf = head;
        secondHalf = prev;
        while (secondHalf != null) {
            ListNode temp1 = firstHalf.next;
            ListNode temp2 = secondHalf.next;

            firstHalf.next = secondHalf;
            secondHalf.next = temp1;

            firstHalf = temp1;
            secondHalf = temp2;
        }
    }
}
