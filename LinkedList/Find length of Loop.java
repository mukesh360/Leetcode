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
    public int lengthOfLoop(Node head) {
        // code here
        Map<Node , Integer> map = new HashMap<>();
        
        int cnt = 1;
        
        Node temp = head;
        
        while(temp != null){
            if(map.containsKey(temp)){
                int value = map.get(temp);
                return cnt - value;
            }
            map.put(temp, cnt);
            cnt++;
            temp = temp.next;
        }
        return 0;
    }
}