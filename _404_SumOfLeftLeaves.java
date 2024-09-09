public class _404_SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        return helper(root);
    }

    public int helper(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.left != null && root.left.left == null && root.left.right == null) {
            return root.left.val + helper(root.right);
        }

        return helper(root.left) + helper(root.right);
    }
}
