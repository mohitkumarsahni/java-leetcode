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

        System.out.println("Is the binary tree symmetrical: "+isSymmetric(root));
    }

    public static boolean isSymmetric(TreeNode root) {
        return checkForSymmetry(root, root);
    }

    public static boolean checkForSymmetry(TreeNode root_1, TreeNode root_2) {
        if(root_1 == null && root_2 == null){
            return true;
        }
        else{
            if(root_1 != null && root_2 != null){
                if(root_1.val == root_2.val){
                    return checkForSymmetry(root_1.left, root_2.right) &&
                            checkForSymmetry(root_1.right, root_2.left);
                }
            }
            return false;
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
