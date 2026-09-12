import java.util.*;

public class FindAllAnagrams {

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        if (s.length() < p.length())
            return result;

        int[] pCount = new int[26];
        int[] window = new int[26];

        for (char c : p.toCharArray())
            pCount[c - 'a']++;

        int k = p.length();

        for (int i = 0; i < s.length(); i++) {
            window[s.charAt(i) - 'a']++;

            if (i >= k)
                window[s.charAt(i - k) - 'a']--;

            if (Arrays.equals(pCount, window))
                result.add(i - k + 1);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String p = sc.nextLine();

        System.out.println(findAnagrams(s, p));
    }
}

Input

cbaebabacd
abc

Output

[0, 6]
