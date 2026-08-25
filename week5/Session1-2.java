class Main {
    public static void main(String[] args) {

        int[] s = {1, 2, 1, 3, 2};
        int day = 3;
        int month = 2;

        int count = 0;

        for (int i = 0; i <= s.length - month; i++) {

            int sum = 0;

            for (int j = i; j < i + month; j++) {
                sum += s[j];
            }

            if (sum == day) {
                count++;
            }
        }

        System.out.println("Number of ways = " + count);
    }
}
Output
Number of ways = 2
