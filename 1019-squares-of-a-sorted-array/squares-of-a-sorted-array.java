class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] arr=new int[nums.length];
        for(int i=0;i<arr.length;i++){
            arr[i]=(int)Math.pow(nums[i],2);
        }
        Arrays.sort(arr);
        return arr;
    }
}
