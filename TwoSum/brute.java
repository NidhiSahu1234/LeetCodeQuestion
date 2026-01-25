import java.util.*;

class brute {
    public String twoSumExists(int[] arr, int target) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    return "YES";
                }
            }
        }

        return "NO";
    }

    public int[] twoSumIndices(int[] arr, int target) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        brute obj = new brute();

        int[] arr = { 2, 6, 5, 8, 11 };
        int target = 14;

        System.out.println(obj.twoSumExists(arr, target));

        int[] res = obj.twoSumIndices(arr, target);
        System.out.println("[" + res[0] + "," + res[1] + "]");
    }
}