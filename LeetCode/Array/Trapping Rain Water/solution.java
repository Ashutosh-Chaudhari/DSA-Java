class Solution {
    public int trap(int[] height) {
        int watertrapped = 0;
        int[] LMB = new int[height.length];
        LMB[0] = height[0];
        for(int i=1; i<height.length; i++){
            LMB[i] = Math.max(LMB[i-1], height[i]);
        }
        int[] RMB = new int[height.length];
        RMB[height.length-1] = height[height.length-1];
        for(int i=height.length-2; i>=0; i--){
            RMB[i] = Math.max(RMB[i+1], height[i]);
        }

        for(int i=0; i<height.length; i++){
            int water = Math.min(LMB[i],RMB[i]);
            watertrapped+=water-height[i];
        }
        return watertrapped;
    }
}