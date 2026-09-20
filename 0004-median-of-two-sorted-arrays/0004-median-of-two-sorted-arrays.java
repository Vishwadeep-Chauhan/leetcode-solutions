public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int totalLength = m + n;
        
        int targetIndex2 = totalLength / 2;
        int targetIndex1 = targetIndex2 - 1;
        
        int val1 = 0, val2 = 0;
        int p1 = 0, p2 = 0;
        
        for (int i = 0; i <= targetIndex2; i++) {
            int currentVal;
            
            if (p1 < m && (p2 >= n || nums1[p1] <= nums2[p2])) {
                currentVal = nums1[p1];
                p1++;
            } else {
                currentVal = nums2[p2];
                p2++;
            }
            
            if (i == targetIndex1) {
                val1 = currentVal;
            }
            if (i == targetIndex2) {
                val2 = currentVal;
            }
        }
        
        if (totalLength % 2 != 0) {
            return val2;
        }
        
        return (val1 + val2) / 2.0;
    }
}
