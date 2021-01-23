/*
Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
The number of elements initialized in nums1 and nums2 are m and n respectively. You may assume that nums1 has a size equal to m + n such that it has enough space to hold additional elements from nums2.

Example 1:
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]

Example 2:
Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
 
Constraints:
nums1.length == m + n
nums2.length == n
0 <= m, n <= 200
1 <= m + n <= 200
-109 <= nums1[i], nums2[i] <= 109
*/

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