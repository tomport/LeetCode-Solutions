class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] merged = new int[m + n];
        int mCount = 0;
        int nCount = 0;
        
        for(int i = 0; i < n + m; i++){
            if(mCount < m && nCount < n){
                if(nums1[mCount] <= nums2[nCount]){
                    merged[i] = nums1[mCount];
                    mCount++;
                }
                else{
                    merged[i] = nums2[nCount];
                    nCount++;
                }
            }
            else if(mCount < m){
                merged[i] = nums1[mCount];
                mCount++;
            }
            else if(nCount < n){
                merged[i] = nums2[nCount];
                nCount++;
            }
        }
        for(int i = 0; i < m + n; i++){
            nums1[i] = merged[i];
        }
    }
}