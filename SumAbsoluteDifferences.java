import java.util.Arrays;
public class SumAbsoluteDifferences {
    public static void main(String[] args) {
        int[] nums = {1, 4, 6, 8, 10};
        System.out.println(Arrays.toString(getSumAbsoluteDifferences(nums)));
    }
    static int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int total = 0, left = 0;
        for (int x : nums) total += x;
        for (int i = 0; i < n; i++) {
            int right = total - left - nums[i];
            res[i] = nums[i] * i - left + right - nums[i] * (n - i - 1);
            left += nums[i];
        }
        return res;
    }
}
