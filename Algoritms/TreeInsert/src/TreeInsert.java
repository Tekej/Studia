import java.util.ArrayList;
import java.util.List;

public class TreeInsert {
    private static int counter=0;
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static TreeNode insert(TreeNode root, int value) {
        if(root == null){ return new TreeNode(value);}
        if (root.left != null) {
            counter++;
            insert(root.left, value);
        }
        if (root.right != null) {
            counter++;
            insert(root.right, value);
        }
        if (-1000 <= value && value <= 1000) {
            if (root.left != null && root.right == null) {
                if (root.right != null) {
                    insert(root.right, value);
                } else {
                    return root.right = new TreeNode(value);
                }
            } else {
                return root.left = new TreeNode(value);
            }
        }
        return null;
    }
}