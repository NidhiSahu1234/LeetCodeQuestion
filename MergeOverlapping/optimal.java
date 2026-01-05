import java.util.*;

public class optimal {
    public List<List<Integer>> merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<List<Integer>> result = new ArrayList<>();

        for (int[] interval : intervals) {
            if (result.isEmpty() || result.get(result.size() - 1).get(1) <= interval[0]) {
                result.add(Arrays.asList(interval[0], interval[1]));
            } else {
                result.get(result.size() - 1).set(1, Math.max(result.get(result.size() - 1).get(1), interval[1]));
            }
        }
        return result;
    }
}
