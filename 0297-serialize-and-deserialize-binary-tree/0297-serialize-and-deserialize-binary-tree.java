/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) return "";
        
        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()) {
            TreeNode node = q.poll();

            if (node == null) sb.append("#,");
            else {
                sb.append(node.val + ",");

                q.add(node.left);
                q.add(node.right);
            }
        }
        
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data == "" || data == null) return null;
        
        String[] nodeVals = data.split(",");
        
        TreeNode root = new TreeNode(Integer.parseInt(nodeVals[0]));
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        for (int i = 1; i < nodeVals.length; i++) {
            TreeNode currentNode = q.poll();
            
            if (!nodeVals[i].equals("#")) {
                TreeNode leftNode = new TreeNode(Integer.parseInt(nodeVals[i]));
                currentNode.left = leftNode;
                q.add(leftNode);
            }
            
            if (!nodeVals[++i].equals("#")) {
                TreeNode rightNode = new TreeNode(Integer.parseInt(nodeVals[i]));
                currentNode.right = rightNode;
                q.add(rightNode);
            }
        }
        
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));


















