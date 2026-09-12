import java.util.*;

public class CircularPalindromes {

    public static int longestPalindrome(String s) {
        int n = s.length();
        String doubled = s + s;

        int max = 1;

        for (int start = 0; start < n; start++) {

            int left = start;
            int right = start + n - 1;

            // Odd length palindromes
            for (int center = start; center <= right; center++) {

                int l = center;
                int r = center;

                while (l >= start && r <= right &&
                       doubled.charAt(l) == doubled.charAt(r)) {

                    max = Math.max(max, r - l + 1);

                    l--;
                    r++;
                }
            }

            // Even length palindromes
            for (int center = start; center < right; center++) {

                int l = center;
                int r = center + 1;

                while (l >= start && r <= right &&
                       doubled.charAt(l) == doubled.charAt(r)) {

                    max = Math.max(max, r - l + 1);

                    l--;
                    r++;
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(longestPalindrome(s));
    }
}

Input

aaaa

Output

4
