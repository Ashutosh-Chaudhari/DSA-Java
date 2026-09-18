class Solution {
    public int maxProduct(int[] nums) {
        int ans = nums[0];
        for(int i=0; i<nums.length; i++){
            int product = 1;
            for(int j=i; j<nums.length; j++){
                product*= nums[j];
                ans = Math.max(product, ans);
            }
        }
        return ans;
    }
}