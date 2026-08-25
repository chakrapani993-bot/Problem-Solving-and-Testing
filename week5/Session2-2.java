class Main {
    public static void main(String[] args) {

        int[] arr = {5, -3, 5};

        int total = 0;

        int maxSum = arr[0];
        int currentMax = arr[0];

        int minSum = arr[0];
        int currentMin = arr[0];

        for (int i = 0; i < arr.length; i++) {

            total += arr[i];

            if (i > 0) {
                currentMax = Math.max(arr[i], currentMax + arr[i]);
                maxSum = Math.max(maxSum, currentMax);

                currentMin = Math.min(arr[i], currentMin + arr[i]);
                minSum = Math.min(minSum, currentMin);
            }
        }

        int circularSum = total - minSum;

        int answer;

        if (maxSum < 0)
            answer = maxSum;
        else
            answer = Math.max(maxSum, circularSum);

        System.out.println("Maximum Circular Subarray Sum = " + answer);
    }
}
Output
Maximum Circular Subarray Sum = 10
