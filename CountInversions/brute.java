import java.util.*;

public class brute {
    static int numberOfInversions(int[] arr) {
        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };

        int inversions = numberOfInversions(arr);

        System.out.println("The number of inversions is: " + inversions);
    }
}