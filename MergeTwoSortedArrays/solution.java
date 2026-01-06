import java.util.*;

class solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;

        int j = n - 1;

        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }

    public static void main(String[] args) {
        solution sol = new solution();

        int[] nums1 = { 1, 3, 5, 0, 0, 0 };

        int m = 3;

        int[] nums2 = { 2, 4, 6 };

        int n = 3;

        sol.merge(nums1, m, nums2, n);

        for (int nums : nums1) {
            System.out.print(nums + " ");
        }
    }
}