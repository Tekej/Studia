import java.util.ArrayList;
import java.util.List;

public class TreePrefixOrder {

    public static class TreeNode {
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
    public static List<Integer> traverse(TreeNode root) {
        if (root==null)return new ArrayList<>();
        List<Integer> lista = new ArrayList<>();
        if (-1000<=root.val && root.val<=1000){
            lista.add(root.val);
        }
        if(root.left != null){
            lista.addAll(traverse(root.left));
        }
        if(root.right != null){
            lista.addAll(traverse(root.right));
        }
        if(lista.size() > 1001)return null;
        return lista;
    }
}
