class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;

        Deque<TreeNode> que = new ArrayDeque<>();
        que.offer(root);

        boolean leftToRight = true; // 🔥 key

        while (!que.isEmpty()) {
            int size = que.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode curr = que.poll();

                if (leftToRight) {
                    level.add(curr.val);           // normal
                } else {
                    level.add(0, curr.val);        // reverse insert
                }

                if (curr.left != null) que.offer(curr.left);
                if (curr.right != null) que.offer(curr.right);
            }

            ans.add(level);
            leftToRight = !leftToRight; // 🔥 flip direction
        }

        return ans;
    }
}