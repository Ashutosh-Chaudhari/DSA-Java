class Solution {
    public int pivotIndex(int[] nums) {
        for(int i=0; i<nums.length; i++){
            int lsum = 0;
            int rsum = 0;
            for(int j=0; j<i; j++){
                lsum+=nums[j];
            }
            for(int j=i+1; j<nums.length; j++){
                rsum+=nums[j];
            }
            if(lsum==rsum){
                return i;
            }
        }
        return -1;
    }
}