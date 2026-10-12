
public class StreamAnalyticsEngine {

    public static void main(String[] args) {
        int[] stream = {10, 20, 30, 40, 50};

        int count = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        System.out.println("Processing Data Stream:");

        for (int value : stream) {
            System.out.println("Received: " + value);

            count++;
            sum += value;

            if (value < min) {
                min = value;
            }

            if (value > max) {
                max = value;
            }
        }

        double average = (double) sum / count;

        System.out.println("Total Elements: " + count);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}



Processing Data Stream:
Received: 10
Received: 20
Received: 30
Received: 40
Received: 50
Total Elements: 5
Sum: 150
Average: 30.0
Minimum: 10
Maximum: 50
