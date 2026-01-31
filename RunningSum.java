import java.util.Arrays;
public class RunningSum {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        runningSum(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
    }
}
