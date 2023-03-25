
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> answer = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if (root == null)
            return answer;

        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> currentLevelList = new ArrayList<>();

            int qSize = queue.size();
            while (qSize-- > 0) {
                TreeNode currentNode = queue.poll();

                if (currentNode.left != null)
                    queue.add(currentNode.left);

                if (currentNode.right != null)
                    queue.add(currentNode.right);

                currentLevelList.add(currentNode.val);
            }

            answer.add(currentLevelList);
        }


        return answer;
    }
}