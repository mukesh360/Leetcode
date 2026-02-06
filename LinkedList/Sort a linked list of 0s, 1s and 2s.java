/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        // code here
        int cnt0 = 0;
        int cnt1 = 0;
        Node temp = head;
        
        while(temp != null){
            if(temp.data == 0) cnt0++;
            else if(temp.data == 1) cnt1++;
            
            temp = temp.next;
        }
        
        temp = head;
        
        int i = 0;
        while(temp != null){
            if(i < cnt0){
                temp.data = 0; 
            }
            else if(i < cnt0 + cnt1){
                temp.data = 1;
            }
            else{
                temp.data = 2;
            }
            i++;
            temp = temp.next;
        }
        return head;
        
        
    }
}