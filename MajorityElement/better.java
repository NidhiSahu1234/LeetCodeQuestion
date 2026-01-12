import java.util.*;

public class better {
    public int majorityElement(int[] nums) {
        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n / 2) {
                return entry.getKey();
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        better obj = new better();

        int[] nums = { 2, 2, 1, 1, 1, 2, 2 };

        int ans = obj.majorityElement(nums);

        System.out.println(ans);
    }
}
