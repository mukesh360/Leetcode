class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode fast = head, slow = head;

        // Move fast n steps ahead
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        // If deleting the head
        if (fast == null) {
            return head.next;
        }

        // Move both until fast reaches last node
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // Delete nth node from end
        slow.next = slow.next.next;

        return head;
    }
}
