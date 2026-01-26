class Solution {
    public Node delPos(Node head, int pos) {

        if (head == null) return null;

        // Case 1: delete head (pos = 1)
        if (pos == 1) {
            Node newHead = head.next;
            if (newHead != null) {
                newHead.prev = null;
            }
            return newHead;
        }

        Node temp = head;

        // Move to the pos-th node
        for (int i = 1; i < pos && temp != null; i++) {
            temp = temp.next;
        }

        // If position is invalid
        if (temp == null) return head;

        // Fix links
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
        temp.prev.next = temp.next;

        return head;
    }
}
