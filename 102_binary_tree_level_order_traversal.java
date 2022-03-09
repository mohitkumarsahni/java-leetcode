import java.util.ArrayList;
import java.util.List;

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

        System.out.println("Level Traversal: "+levelOrder(root));
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levelOrderList = new ArrayList<>();
        int h = height(root);
        for (int l = 0; l < h; l = l + 1) {
            List<Integer> integerList = new ArrayList<>();
            processCurrentLevel(root, l, integerList);
            levelOrderList.add(integerList);
        }
        return levelOrderList;
    }

    public static void processCurrentLevel(TreeNode root, int l, List<Integer> list)
    {
        if (root == null)
            return;
        if (l == 0)
            list.add(root.val);
        else if (l > 0)
        {
            processCurrentLevel(root.left, l - 1, list);
            processCurrentLevel(root.right, l - 1, list);
        }
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
