class Solution {

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        if (root == null) {
            return false;
        }

        // Check if current subtree matches
        if (isSameTree(root, subRoot)) {
            return true;
        }

        // Otherwise search left or right
        return isSubtree(root.left, subRoot)
                || isSubtree(root.right, subRoot);
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {

        // Both trees ended
        if (p == null && q == null) {
            return true;
        }

        // One ended but the other didn't
        if (p == null || q == null) {
            return false;
        }

        // Values don't match
        if (p.val != q.val) {
            return false;
        }

        // Compare left and right
        return isSameTree(p.left, q.left)
                && isSameTree(p.right, q.right);
    }
}