import java.util.*;

public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();

            int n = s.length();

            int countZero = 0;
            int countOne = 0;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '0') {
                    countZero++;
                } else {
                    countOne++;
                }
            }

            int operations = Math.min(countZero, countOne);

            if (operations % 2 != 0) {
                System.out.println("DA");
            } else {
                System.out.println("NET");
            }
        }
    }
}
