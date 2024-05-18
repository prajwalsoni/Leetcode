class Solution {
    // Method to merge k sorted linked lists
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        while (true) {
            int p = -1;
            for (int i = 0; i < lists.length; i++) {
                if (lists[i] != null) {
                    if (p == -1 || lists[i].val < lists[p].val) {
                        p = i;
                    }
                }
            }

            if (p == -1) {
                break;
            }

            temp.next = lists[p];
            temp = temp.next;
            lists[p] = lists[p].next;
        }

        return dummy.next;
    }

    // Method to remove the nth node from the end of the list
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }

        // First pass to count the number of nodes
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        // Calculate the position from the beginning
        int steps = count - n;

        // If we need to remove the first node
        if (steps == 0) {
            return head.next;
        }

        // Second pass to reach the node before the one to be removed
        temp = head;
        for (int i = 1; i < steps; i++) {
            temp = temp.next;
        }

        // Remove the nth node from the end
        if (temp.next != null) {
            temp.next = temp.next.next;
        }

        return head;
    }
}
