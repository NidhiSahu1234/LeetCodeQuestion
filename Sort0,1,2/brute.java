import java.util.*;

public class brute {
    public void sortZeroOneTwo(int[] nums) {
        int count0 = 0, count1 = 0, count2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count0++;
            } else if (nums[i] == 1) {
                count1++;
            } else {
                count2++;
            }
        }

        int index = 0;

        while (count0 > 0) {
            nums[index++] = 0;
            count0--;
        }

        while (count1 > 0) {
            nums[index++] = 1;
            count1--;
        }

        while (count2 > 0) {
            nums[index++] = 2;
            count2--;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 2, 0, 2, 1, 1, 0 };

        brute obj = new brute();

        obj.sortZeroOneTwo(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
