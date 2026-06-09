class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int read1 = m - 1;
        int read2 = n - 1;
        int write = m + n - 1;

        while (write >= 0) {

            if (read1 >= 0 && read2 >= 0) {
                nums1[write] = nums1[read1] > nums2[read2]
                               ? nums1[read1--]
                               : nums2[read2--];
            }
            else if (read1 >= 0) {
                nums1[write] = nums1[read1--];
            }
            else {
                nums1[write] = nums2[read2--];
            }

            write--;   // ← MUST be inside loop
        }
    }
}