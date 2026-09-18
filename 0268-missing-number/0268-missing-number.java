class Solution {
    public int missingNumber(int[] nums) {
        int n =nums.length;
        boolean[] seen = new boolean[n+1];
        for(int num:nums){
            seen[num] = true;
        }
        for(int i=0; i<=n; i++){
            if(seen[i] == false){
                return i;
            }
        }
        return -1;
    }
}