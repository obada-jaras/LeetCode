class Solution {
    public Node connect(Node root) {
        if (root == null) return null;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            int qSize = queue.size();

            for (int i = 0; i < qSize; i++) {
                Node node = queue.poll();

                if (i < qSize - 1)
                    node.next = queue.peek();

                if (node.left != null)
                    queue.add(node.left);

                if (node.right != null)
                    queue.add(node.right);
            }
        }

        return root;
    }
}