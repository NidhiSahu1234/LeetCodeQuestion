import java.util.*;

public class PascalTriangle3 {
    public long findPascalElement(int r, int c) {
        int n = r - 1;
        int k = c - 1;

        long res = 1;

        for (int i = 0; i < k; i++) {
            res *= (n - i);
            res /= (i + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        PascalTriangle3 pt = new PascalTriangle3();
        int r = 5;
        int c = 3;
        System.out.println(pt.findPascalElement(r, c));
    }
}
