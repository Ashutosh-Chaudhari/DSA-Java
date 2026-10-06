class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int [] arr = new int[n+m];
        System.arraycopy(nums1,0,arr,0,n);
        System.arraycopy(nums2,0,arr,n,m);
        Arrays.sort(arr);
        int x = arr.length;
        if(x%2 == 1){
            return arr[x/2];
        }
        return (arr[x/2-1]+arr[x/2])/2.0;
    }
}