import java.util.*;

class brute {
    static int findDuplicate(int[] arr) {
        int n = arr.length;

        Arrays.sort(arr);

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 3, 4, 2, 2 };
        System.out.println("The duplicate element is: " + brute.findDuplicate(arr));
    }
}