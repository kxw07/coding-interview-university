package leetcode.easy.merge_sorted_array_88;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n == 0) {
            return;
        }

        if(m == 0) {
            // O(N)
            for(int i=0; i<n; i++) {
                // O(1)
                nums1[i] = nums2[i];
            }
        }

        // O(N)
        for(int i=0; i<n; i++) {
            // O(1)
            nums1[m+i] = nums2[i];
        }

        int totalLength = m + n;
        // O(N)
        for(int outsideIndex = 0; outsideIndex < totalLength; outsideIndex++) {
            // O(N)
            for(int insideIndex = outsideIndex; insideIndex < totalLength; insideIndex++) {
                // O(1)
                if (nums1[outsideIndex] > nums1[insideIndex]) {
                    int temp = nums1[outsideIndex];
                    nums1[outsideIndex] = nums1[insideIndex];
                    nums1[insideIndex] = temp;
                }
            }
        }

        // total: O(N) + O(N^2) = O(N^2)
    }
}
