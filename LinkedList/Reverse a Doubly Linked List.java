class Solution {
    public Node reverse(Node head) {

        if (head == null) return null;

        Node curr = head;
        Node temp = null;

        while (curr != null) {
            // swap prev and next
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;

            // move to next node (which is previous before swap)
            curr = curr.prev;
        }

        // temp will be at the node before new head
        if (temp != null) {
            head = temp.prev;
        }

        return head;
    }
}
