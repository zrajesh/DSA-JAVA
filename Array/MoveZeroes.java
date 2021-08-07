//Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        MoveZeroes move = new MoveZeroes();
        move.moveZeroes(nums);
    }
    public void moveZeroes(int[] nums) {
        int pos=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
                nums[pos++]=nums[i];
        }
        for(int i=pos;i<nums.length;i++)
            nums[i]=0;
        for(int j=0;j<nums.length;j++)
            System.out.print(nums[j] + " ");
    }
}
