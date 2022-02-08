import java.util.List;

public class Main {
    public static void main(String[] args) {
        TreePrefixOrder.TreeNode root = new TreePrefixOrder.TreeNode();
        List<Integer> list = TreePrefixOrder.traverse(null);
        System.out.println(list);
    }
}
