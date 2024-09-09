public class _100_SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return helper(p, q);
    }

    public boolean helper(TreeNode p, TreeNode q) {
        if (q == null && p == null) {
            return true;
        }

        if (q == null || p == null) {
            return false;
        }

        return (q.val == p.val) && (helper(p.left, q.left)) && helper(p.right, q.right);
    }
}
