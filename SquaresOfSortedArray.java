import java.util.Arrays;
public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] result = sortedSquares(nums);
        System.out.println(Arrays.toString(result));
    }
    static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int l = 0, r = n - 1, k = n - 1;
        while (l <= r) {
            if (nums[l] * nums[l] > nums[r] * nums[r]) {
                res[k--] = nums[l] * nums[l];
                l++;
            } else {
                res[k--] = nums[r] * nums[r];
                r--;
            }
        }
        return res;
    }
} 
