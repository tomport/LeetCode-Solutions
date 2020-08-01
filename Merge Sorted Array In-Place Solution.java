class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int mCount = m - 1;
        int nCount = n - 1;
        
        for(int i = n + m - 1; i >= 0; i--){
            if(mCount >= 0 && nCount >= 0){
                if(nums1[mCount] >= nums2[nCount]){
                    nums1[i] = nums1[mCount];
                    mCount--;
                }
                else{
                    nums1[i] = nums2[nCount];
                    nCount--;
                }
            }
            else if(mCount >= 0){
                nums1[i] = nums1[mCount];
                mCount--;
            }
            else{
                nums1[i] = nums2[nCount];
                nCount--;
            }
        }

    }
}