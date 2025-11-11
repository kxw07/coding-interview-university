package leetcode.easy.merge_sorted_array_88;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }

        if (m == 0) {
            // O(N)
            for (int i = 0; i < n; i++) {
                // O(1)
                nums1[i] = nums2[i];
            }
            return;
        }

        int totalLength = m + n;
        int nums2Pointer = 0;

        for (int indexOfNums1 = 0; indexOfNums1 < totalLength; indexOfNums1++) {
            // O(n)
            for (int indexOfNums2 = nums2Pointer; indexOfNums2 < n; indexOfNums2++) {

                if (nums1[indexOfNums1] > nums2[indexOfNums2]) {
                    // O(m + n - n) = O(m)
                    for (int i = totalLength - 1; i > indexOfNums1; i--) {
                        nums1[i] = nums1[i - 1];
                    }
                    nums1[indexOfNums1] = nums2[indexOfNums2];
                    nums2Pointer++;
                } else {
                    break;
                }
            }
        }

        if (nums2Pointer < n) {
            for (int i = nums2Pointer; i < n; i++) {
                nums1[m + i] = nums2[i];
            }
        }
    }
}
