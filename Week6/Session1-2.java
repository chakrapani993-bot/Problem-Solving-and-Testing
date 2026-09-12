import java.util.*;

public class RepeatedSubstringPattern {

    public static boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        int[] lps = new int[n];

        for (int i = 1, len = 0; i < n; ) {
            if (s.charAt(i) == s.charAt(len)) {
                lps[i++] = ++len;
            } else if (len > 0) {
                len = lps[len - 1];
            } else {
                lps[i++] = 0;
            }
        }

        int longestPrefixSuffix = lps[n - 1];

        return longestPrefixSuffix > 0 &&
               n % (n - longestPrefixSuffix) == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(repeatedSubstringPattern(s));
    }
}

Input

abab

Output

true
