import java.util.*;

public class StringSimilarity {

    public static int[] computeLPS(String s) {
        int n = s.length();
        int[] lps = new int[n];
        int len = 0;

        for (int i = 1; i < n; ) {
            if (s.charAt(i) == s.charAt(len)) {
                lps[i++] = ++len;
            } else if (len > 0) {
                len = lps[len - 1];
            } else {
                lps[i++] = 0;
            }
        }
        return lps;
    }

    public static int similarity(String s) {
        int n = s.length();
        int[] z = new int[n];
        int left = 0, right = 0;
        int sum = n;

        for (int i = 1; i < n; i++) {
            if (i <= right)
                z[i] = Math.min(right - i + 1, z[i - left]);

            while (i + z[i] < n &&
                   s.charAt(z[i]) == s.charAt(i + z[i])) {
                z[i]++;
            }

            if (i + z[i] - 1 > right) {
                left = i;
                right = i + z[i] - 1;
            }

            sum += z[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(similarity(s));
    }
}


Input

ababaa

Output

11
