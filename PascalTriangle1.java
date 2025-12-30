import java.util.*;

public class PascalTriangle1 {
    // Function to generate pascal's triangle up to numRows.
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        // this above is a result list to hold all rows
        // loop for each row

        for (int i = 0; i < numRows; i++) {
            // create a row with size (i+1)
            List<Integer> row = new ArrayList<>(Collections.nCopies(i + 1, 1));

            // Fill elements from index 1 to i-1(middle values)
            for (int j = 1; j < i; j++) {
                row.set(j, triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
            }

            triangle.add(row);
        }
        return triangle;
    }

    public static void main(String[] args) {
        PascalTriangle1 pt = new PascalTriangle1();
        int n = 5;

        // Generate and print pascal's triangle
        List<List<Integer>> result = pt.generate(n);
        for (List<Integer> row : result) {
            for (Integer val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

    }
}
