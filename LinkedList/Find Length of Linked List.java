/*
class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}*/

class Solution {
    public int getCount(Node head) {
        
        if(head == null){
            return 0;
        }        
        Node temp = head;
        int cnt = 0;
        while(temp != null){
            temp = temp.next;
            cnt++;
        }
        return cnt;
    }
}