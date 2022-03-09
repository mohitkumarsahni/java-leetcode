public class Main {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);

        TreeNode rootRightChild = new TreeNode(20);
        TreeNode rootLeftChild = new TreeNode(9);

        TreeNode leftChildToRootRightChild = new TreeNode(15);
        TreeNode rightChildToRootRightChild = new TreeNode(7);

        root.left = rootLeftChild;
        root.left.right = null;
        root.left.left = null;

        root.right = rootRightChild;
        root.right.right = rightChildToRootRightChild;
        root.right.left = leftChildToRootRightChild;

        int value = 7;

        System.out.println("Inserting the value in BST: "+insertIntoBST(root, value));
    }

    public static TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (val < root.val) {
            root.left = insertIntoBST(root.left, val);
        } else {
            root.right = insertIntoBST(root.right, val);
        }
        return root;
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
