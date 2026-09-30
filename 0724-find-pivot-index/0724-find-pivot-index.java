class Solution {
    public int pivotIndex(int[] nums) {
        int totalsum = 0;
        int lsum = 0;
        for(int num:nums){
            totalsum+=num;
        }
        for(int i=0; i<nums.length; i++){
            int rsum = totalsum-lsum-nums[i];
            if(rsum == lsum){
                return i;
            }
            lsum+=nums[i];
        }
        return -1;
    }
}