class Solution {

    public int subsetXORSum(int[] nums) {
        return backtrack(nums, 0, 0);
    }

    public int backtrack(int[] nums, int index, int xor) {

        // One subset is completed
        if (index == nums.length) {
            return xor;
        }

        // Include current element
        int include = backtrack(nums, index + 1, xor ^ nums[index]);

        // Exclude current element
        int exclude = backtrack(nums, index + 1, xor);

        return include + exclude;
    }
}