import java.util.ArrayList;
import java.util.List;


public class _94_BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<Integer>();
        if (root == null) {
            return l;
        }
        
        return helper(root, l);
    }

    public List<Integer> helper(TreeNode node, List<Integer> l) {
        if (node == null) {
            return l;
        }

        l = helper(node.left, l);
        l.add(node.val);
        l = helper(node.right, l);
        return l;
    }
}
