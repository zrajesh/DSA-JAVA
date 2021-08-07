// Given an array of integers nums and an integer target, return indices
// of the two numbers such that they add up to target.

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] indices = new int[2];
        for (int i = 0; i < nums.length; i++) {
            indices[0] = i;
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    indices[1] = j;
                    return indices;
                }
            }
        }
        return null;
    }
}
