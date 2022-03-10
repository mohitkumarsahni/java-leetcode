import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
    }

    public static boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> set = new HashSet<>();
        return helper(root, k, set);
    }

    public static boolean helper(TreeNode root, int k, HashSet<Integer> set){
        if(root == null){
            return false;
        }
        int currentNodeValue = root.val;
        if(set.contains(k - currentNodeValue)){
            return true;
        }
        else{
            set.add(currentNodeValue);
        }
        boolean isPresentInLeftSubTree = helper(root.left, k, set);
        if(isPresentInLeftSubTree){
            return true;
        }
        return helper(root.right, k, set);
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
