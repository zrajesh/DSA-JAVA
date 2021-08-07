// Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        MaximumSubarray maxArray = new MaximumSubarray();
        int maxSum = maxArray.maxSubArray(nums);
        System.out.println(maxSum);
    }
    public int maxSubArray(int[] nums) {
        int numsLength = nums.length;
        int maxSubArrayValue = Integer.MIN_VALUE;
        for(int i=0; i<numsLength; i++) {
            int sum = 0;
            for(int j=i; j<numsLength; j++) {
                // Adding sub array
                sum += nums[j];
                // Compairing with previous value
                maxSubArrayValue = Math.max(maxSubArrayValue, sum);
            }
        }
        return maxSubArrayValue;
    }
}
// Time Complexity: O(n2) Quadratic Time
