import java.util.*;

public class printSubarray {
    public int maxSubarray(int[] nums) {
        long maxi = Long.MIN_VALUE;

        long sum = 0;

        int start = 0;

        int ansStart = -1, ansEnd = -1;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (sum == 0) {
                start = i;
            }

            if (sum > maxi) {
                maxi = sum;
                ansStart = start;
                ansEnd = i;
            }

            if (sum < 0) {
                sum = 0;
            }
        }
        return (int) maxi;
    }

    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        printSubarray b = new printSubarray();

        int maxSum = b.maxSubarray(arr);

        System.out.println("The maximum subarray sum is: " + maxSum);
    }
}
