import java.util.*;

public class better {
    public boolean binarySearch(int[] nums, int target) {
        int n = nums.length;

        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                return true;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;

        int m = matrix[0].length;

        for (int i = 0; i < n; i++) {
            if (matrix[i][0] <= target && matrix[i][m - 1] >= target) {
                return binarySearch(matrix[i], target);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        };

        better obj = new better();

        if (obj.searchMatrix(matrix, 8)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
