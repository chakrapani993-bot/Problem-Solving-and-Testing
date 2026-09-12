import java.util.*;

public class TwoStrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            String a = sc.next();
            String b = sc.next();

            boolean[] present = new boolean[26];

            for (char c : a.toCharArray()) {
                present[c - 'a'] = true;
            }

            boolean found = false;

            for (char c : b.toCharArray()) {
                if (present[c - 'a']) {
                    found = true;
                    break;
                }
            }

            System.out.println(found ? "YES" : "NO");
        }
    }
}

Input

2
hello
world
hi
world

Output

YES
YES
