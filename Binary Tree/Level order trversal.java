import java.util.*;

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Deque<TreeNode> que = new ArrayDeque<>();

        if (root == null) return ans;

        que.offer(root);

        while (!que.isEmpty()) {
            int size = que.size();  // FIX: must be inside loop
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode curr = que.poll(); // used to remove the front value of the que and store it into the  curr variable 
                level.add(curr.val); 

                if (curr.left != null) que.offer(curr.left);   // after add the curr.val check the curr val has left or right , if it is there added to que
                if (curr.right != null) que.offer(curr.right); 
            }

            ans.add(level);
        }

        return ans;
    }
}