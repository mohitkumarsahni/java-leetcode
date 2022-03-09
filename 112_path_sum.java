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

        int target = 30;

        System.out.println("Inverted tree node: "+hasPathSum(root, target));
    }

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) {
            return false;
        }
        if (root.val == targetSum && root.left == null && root.right == null) {
            return true;
        }
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
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
