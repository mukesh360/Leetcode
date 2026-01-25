/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node reverseList(Node head) {
        // code here
        Node prev = null;
        Node current = head;
        Node next = head.next;
        
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            
        }
        head = prev;
        return head;
    }
}

// more cclean way
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return prev;
    }
}
