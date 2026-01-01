import java.util.*;

public class better {
    public int maxSubarray(int[] nums) {
        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                maxi = Math.max(sum, maxi);
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        better b = new better();

        int maxSum = b.maxSubarray(arr);

        System.out.println("The maximum subarray sum is: " + maxSum);
    }
}
