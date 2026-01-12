import java.util.*;

class brute {
    public int majorityElement(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int cnt = 0;

            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) {
                    cnt++;
                }
            }

            if (cnt > n / 2) {
                return nums[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        brute obj = new brute();

        int[] nums = { 2, 2, 1, 1, 1, 2, 2 };

        int ans = obj.majorityElement(nums);

        System.out.println(ans);
    }
}