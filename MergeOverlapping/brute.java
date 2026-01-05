import java.util.*;

class brute {
    public List<List<Integer>> merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<List<Integer>> result = new ArrayList<>();

        int n = intervals.length;
        int i = 0;

        while (i < n) {
            int start = intervals[i][0];
            int end = intervals[i][1];

            int j = i + 1;

            while (j < n && intervals[j][0] <= end) {
                end = Math.max(end, intervals[j][1]);
                j++;
            }

            result.add(Arrays.asList(start, end));
            i = j;
        }

        return result;
    }

    public static void main(String[] args) {
        brute obj = new brute();

        int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        List<List<Integer>> result = obj.merge(intervals);

        for (List<Integer> interval : result) {
            System.out.print(interval + " ");
        }
    }
}