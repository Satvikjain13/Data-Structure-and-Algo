class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=0;
        int temp=num;
        for(int i=1;i<num;i++){
            if(num%i==0){
               sum=sum+i;
            }
        }
        if(sum==temp){
            return true;
        }
        return false;
    }
}