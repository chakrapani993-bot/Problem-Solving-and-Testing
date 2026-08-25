class Main {
    public static void main(String[] args) {

        String text = "AABAACAADAABAABA";
        String pattern = "AABA";

        int n = text.length();
        int m = pattern.length();

        System.out.println("Pattern found at indexes:");

        for (int i = 0; i <= n - m; i++) {

            int j;

            for (j = 0; j < m; j++) {

                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }

            if (j == m) {
                System.out.println(i);
            }
        }
    }
}
Output
Pattern found at indexes:
0
9
12
