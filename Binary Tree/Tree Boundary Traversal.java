class Solution {

    public boolean isLeaf(Node node){
        return (node.left == null && node.right == null);
    }

    public void addLeft(Node root , List<Integer> ans){
        Node curr = root.left;  // start from left child
        
        while(curr != null){
            if(!isLeaf(curr)) ans.add(curr.data);

            if(curr.left != null) curr = curr.left;
            else curr = curr.right;
        }
    }
    
    public void addLeafNodes(Node root , List<Integer> ans){
        if(root == null) return;

        if(isLeaf(root)){
            ans.add(root.data);
            return;
        }
        
        addLeafNodes(root.left , ans);
        addLeafNodes(root.right , ans);
    }
    
    public void addRight(Node root , List<Integer> ans){
        Node curr = root.right; // start from right child
        
        List<Integer> temp = new ArrayList<>();
        
        while(curr != null){
            if(!isLeaf(curr)) temp.add(curr.data);

            if(curr.right != null) curr = curr.right;
            else curr = curr.left;
        }
        
        // reverse
        for(int i = temp.size() - 1; i >= 0; i--){
            ans.add(temp.get(i));
        }
    }
    
    ArrayList<Integer> boundaryTraversal(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        
        if(root == null) return ans;

        if(!isLeaf(root)) ans.add(root.data);

        addLeft(root , ans);
        addLeafNodes(root , ans);
        addRight(root , ans);
        
        return ans;
    }
}