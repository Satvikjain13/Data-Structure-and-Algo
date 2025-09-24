class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int element : nums){
            if(isEven(element))
                count++;
        }return count;
    }
    boolean isEven(int nums){
      int num=digit(nums);
      if(num%2==0){
        return true;
      }
      return false;
    }

    int digit(int nums){
        int count=0;
        while(nums>0){
            nums=nums/10;
            count++;
        }
        return count;
    }
}