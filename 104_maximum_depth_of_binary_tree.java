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

        System.out.println("Maximum depth of tree: "+height(root));
    }

    public static int height(TreeNode root) {
        if (root == null)
            return 0;
        else
        {
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);

            if (leftHeight > rightHeight)
                return (leftHeight + 1);
            else
                return(rightHeight + 1);
        }
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
