class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length){
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }
        int n = nums1.length;
        int m = nums2.length;
        int low = 0;
        int high = n;
        while(low<=high){
            int i = low+(high-low)/2;
            int j = (m+n+1)/2-i;
            int left1 = (i==0) ? Integer.MIN_VALUE:nums1[i-1];
            int  right1 = (i==n) ? Integer.MAX_VALUE:nums1[i];
            int left2 = (j==0) ? Integer.MIN_VALUE:nums2[j-1];
            int right2 = (j==m) ? Integer.MAX_VALUE:nums2[j];

            if(left1<=right2 && left2<=right1){
                if((m+n)%2 == 1){
                return Math.max(left1,left2);
            }
            return (Math.max(left1,left2)+Math.min(right1,right2))/2.0;
            }
            else if(left1>right2){
                high = i-1;
            }
            else{
                low = i+1;
            }
        }
        return 0.0;
    }
}