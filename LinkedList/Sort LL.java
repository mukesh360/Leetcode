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
    public ListNode sortList(ListNode head) {
        ArrayList<Integer> els = new ArrayList<>();
        ListNode temp = head;

        while(temp != null){
            els.add(temp.val);
            temp = temp.next;
        }
        temp = head;
        int i = 0;

       Collections.sort(els);

        while(temp != null){
            temp.val = els.get(i);
            i++;
            temp = temp.next;
        }
        return head;

    }
}