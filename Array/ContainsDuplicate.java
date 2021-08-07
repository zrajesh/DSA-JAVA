//Given an array of integers, find if the array contains any duplicates.

import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        ContainsDuplicate duplicate = new ContainsDuplicate();
        int[] nums = {1,2,3,4};
        boolean result = duplicate.containsDuplicate(nums);
        System.out.println(result);
    }
    public boolean containsDuplicate(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
// Better Solution
class Solutions {
    public boolean containsDuplicate(int[] nums) {
        if(nums==null || nums.length==0)
            return false;

        HashSet<Integer> set = new HashSet<Integer>();
        for(int i: nums){
            if(!set.add(i)){
                return true;
            }
        }

        return false;
    }
}
