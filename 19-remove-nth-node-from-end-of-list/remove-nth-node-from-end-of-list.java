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
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;

        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return dummy.next;
    }
}
