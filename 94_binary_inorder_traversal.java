import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = null;
        root.right = new TreeNode(2);
        root.right.right = null;
        root.right.left = new TreeNode(3);
        System.out.println("PreOrder Traversal: "+inorderTraversal(root));
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        traverse(root, result);
        return result;
    }

    public static void traverse(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        traverse(node.left, result);
        result.add(node.val);
        traverse(node.right, result);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
