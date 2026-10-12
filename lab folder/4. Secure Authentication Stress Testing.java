
public class AuthenticationStressTesting {

    static final String USERNAME = "admin";
    static final String PASSWORD = "Java@123";

    static boolean authenticate(String username, String password) {
        return USERNAME.equals(username)
                && PASSWORD.equals(password);
    }

    public static void main(String[] args) {
        int totalTests = 10000;
        int successful = 0;
        int failed = 0;

        long startTime = System.nanoTime();

        for (int i = 0; i < totalTests; i++) {
            boolean result;

            if (i % 2 == 0) {
                result = authenticate("admin", "Java@123");
            } else {
                result = authenticate("admin", "wrongPassword");
            }

            if (result) {
                successful++;
            } else {
                failed++;
            }
        }

        long endTime = System.nanoTime();

        double timeMs = (endTime - startTime) / 1_000_000.0;

        System.out.println("Total Login Attempts: " + totalTests);
        System.out.println("Successful Logins: " + successful);
        System.out.println("Failed Logins: " + failed);
        System.out.printf("Execution Time: %.3f ms%n", timeMs);
    }
}


Total Login Attempts: 10000
Successful Logins: 5000
Failed Logins: 5000
Execution Time: 2.500 ms
