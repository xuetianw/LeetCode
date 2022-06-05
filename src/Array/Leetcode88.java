package Array;

public class Leetcode88 {
    public void merge(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] temp = new int[m + n];
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                temp[k++] = nums1[i++];
            } else {
                temp[k++] = nums2[j++];
            }
        }
        if (i == m) {
            while (j < n) {
                temp[k++] = nums2[j++];
            }
        }
        if (j == n) {
            while (i < m) {
                temp[k++] = nums1[i++];
            }
        }
    }
}
