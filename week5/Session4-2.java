import java.util.*;

class Main {

    static boolean match(String word, String pattern) {

        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> used = new HashSet<>();

        for (int i = 0; i < word.length(); i++) {

            char w = word.charAt(i);
            char p = pattern.charAt(i);

            if (map.containsKey(w)) {

                if (map.get(w) != p)
                    return false;

            } else {

                if (used.contains(p))
                    return false;

                map.put(w, p);
                used.add(p);
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String[] words = {"abc", "deq", "mee", "aqq", "dkd", "ccc"};
        String pattern = "abb";

        System.out.println("Matching words:");

        for (String word : words) {

            if (match(word, pattern)) {
                System.out.println(word);
            }
        }
    }
}
Output
Matching words:
mee
aqq
