class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int ans = nums[0];
        for(int i=1; i<nums.length; i++){
            int current = nums[i];
            if(current<0){
                int temp = max;
                max = min;
                min = temp;
            }
            max = Math.max(current, current*max);
            min = Math.min(current, current*min);
            ans = Math.max(ans, max);
        }
        return ans;
    }
}