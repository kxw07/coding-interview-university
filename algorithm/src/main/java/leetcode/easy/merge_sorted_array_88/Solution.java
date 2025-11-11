package leetcode.easy.merge_sorted_array_88;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // O(1)
        if (n == 0) {
            return;
        }

        if (m == 0) {
            // O(n) -> O(N)
            for (int i = 0; i < n; i++) {
                // O(1)
                nums1[i] = nums2[i];
            }
            return;
        }

        int mergedArrayPointer = m + n - 1;
        int nums1Pointer = m - 1;
        int nums2Pointer = n - 1;

        // O(m+n) -> O(2N) -> O(N)
        while (nums1Pointer >= 0 && nums2Pointer >= 0) {
            // O(1)
            if (nums1[nums1Pointer] > nums2[nums2Pointer]) {
                nums1[mergedArrayPointer] = nums1[nums1Pointer];
                nums1Pointer--;
            } else {
                nums1[mergedArrayPointer] = nums2[nums2Pointer];
                nums2Pointer--;
            }

            mergedArrayPointer--;
        }

        if (nums2Pointer >= 0) {
            // O(n) -> O(N)
            for (int i = nums2Pointer; i >= 0; i--) {
                nums1[mergedArrayPointer] = nums2[i];
                mergedArrayPointer--;
            }
        }

        // total: O(N) + O(N) -> O(N)
    }
}
