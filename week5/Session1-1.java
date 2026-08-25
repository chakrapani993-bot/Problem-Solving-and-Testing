import java.util.*;

class Main {
    public static void main(String[] args) {

        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int maxSum = arr[0];

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;

            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                maxSum = Math.max(maxSum, sum);
            }
        }

        System.out.println("Maximum Subarray Sum = " + maxSum);
    }
}
Output
Maximum Subarray Sum = 6
