class Solution {
    public void moveZeroes(int[] nums) {
        int insertPointer = 0;
        for(int i=0; i<nums.length;i++){
            if(nums[i] != 0){
                nums[insertPointer]=nums[i];
                insertPointer++;
            }
        }
        for(int i= insertPointer; i<nums.length;i++){
            nums[i]=0;
        }
    }
}