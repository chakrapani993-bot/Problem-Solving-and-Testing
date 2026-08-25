class Main {
    public static void main(String[] args) {

        String s = "AAABBB";

        int deletions = 0;

        for (int i = 1; i < s.length(); i++) {

            if (s.charAt(i) == s.charAt(i - 1)) {
                deletions++;
            }
        }

        System.out.println("Minimum deletions = " + deletions);
    }
}
Output
Minimum deletions = 4
