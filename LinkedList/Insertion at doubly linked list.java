class Solution {
    Node insertAtPos(Node head, int p, int x) {

        Node newNode = new Node(x);
        Node temp = head;

        // move to p-th node
        for (int i = 0; i < p; i++) {
            temp = temp.next;
        }

        // insert after temp
        newNode.next = temp.next;
        newNode.prev = temp;

        if (temp.next != null) {
            temp.next.prev = newNode;
        }

        temp.next = newNode;

        return head;
    }
}
