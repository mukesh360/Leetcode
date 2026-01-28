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
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;

        int cnt = 0;
        while(temp != null){
            cnt++;
            temp = temp.next;
        }
        int middle = (cnt / 2) + 1;

        temp = head;
        while(temp != null){
            middle -= 1;
            if(middle == 0){
                break;
            }
            temp = temp.next;
        }
        return temp;
    }
}


// most optimized  [TortoiseHare Method] algo
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head , fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}