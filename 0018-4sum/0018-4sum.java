import java.util.*;
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> result = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                Set<Long> seen = new HashSet<>();
                for(int k=j+1; k<nums.length; k++){
                    long required = (long)target-nums[i]-nums[j]-nums[k];
                    if(seen.contains(required)){
                        List<Integer> quad = Arrays.asList(nums[i], nums[j], nums[k], (int)required);
                        Collections.sort(quad);
                        result.add(quad);
                    }
                    seen.add((long)nums[k]);
                }
            }
        }
        return new ArrayList<>(result);
    }
}