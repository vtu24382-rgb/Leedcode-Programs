class Solution {
    int count = 0;

    public int kthSmallest(TreeNode root, int k) {
        return helper(root, k);
    }

    private int helper(TreeNode root, int k) {
        if (root == null) return -1;

        int left = helper(root.left, k);
        if (left != -1) return left;

        count++;
        if (count == k) return root.val;

        return helper(root.right, k);
    }
}