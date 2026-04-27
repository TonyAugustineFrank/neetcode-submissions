class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        if (l1 > l2) {
            return findMedianSortedArrays(nums2, nums1); 
        }
        int halfLen = (l1 + l2 + 1) / 2;
        int low = 0;
        int high = l1;
        
        while (low <= high) {
            int i = low + (high - low) / 2; 
            int j = halfLen - i;             
            int A_left  = (i == 0) ? Integer.MIN_VALUE : nums1[i - 1];
            int A_right = (i == l1) ? Integer.MAX_VALUE : nums1[i];
            
            int B_left  = (j == 0) ? Integer.MIN_VALUE : nums2[j - 1];
            int B_right = (j == l2) ? Integer.MAX_VALUE : nums2[j];
            if (A_left <= B_right && B_left <= A_right) {
                int Lmax = Math.max(A_left, B_left);

                if ((l1 + l2) % 2 == 1) { 
                    return Lmax; 
                } else { 
                   
                    int Rmin = Math.min(A_right, B_right);
                    return (Lmax + Rmin) / 2.0;
                }
            } 
            else if (A_left > B_right) {     
                high = i - 1; 
            } else { 
                
                low = i + 1;
            }
        }
        return 0.0;
    }
}