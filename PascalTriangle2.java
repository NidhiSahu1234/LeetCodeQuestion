import java.util.*;

public class PascalTriangle2 {
    public List<Long> getNthRow(int N) {
        // function to generate the nth row of pascal's triangle
        List<Long> row = new ArrayList<>();
        // First value of the row is always 1
        long val = 1;
        row.add(val);

        // Compute remaining values using the relation:
        // C(n,k) = C(n,k-1)*(n-k)/k
        for (int k = 1; k < N; k++) {
            val = val * (N - k) / k;
            row.add(val);
        }
        return row;
    }

    public static void main(String[] args) {
        int N = 5;
        PascalTriangle2 pt = new PascalTriangle2();
        List<Long> result = pt.getNthRow(N);

        for (long num : result) {
            System.out.print(num + " ");
        }
    }
}
