import java.util.*;

public class brute {
    public double myPow(double x, int n) {
        if (n == 0 || x == 1.0) {
            return 1;
        }

        long temp = n;

        if (n < 0) {
            x = 1 / x;
            temp = -1L * n;
        }

        double ans = 1;

        for (long i = 0; i < temp; i++) {
            ans *= x;
        }
        return ans;
    }

    public static void main(String[] args) {
        brute obj = new brute();

        System.out.printf("%.4f\n", obj.myPow(2.000, 10));
        System.out.printf("%.4f\n", obj.myPow(2.000, -2));
    }
}
