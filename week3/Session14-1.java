import java.util.*;

public class Main {
    public static void main(String[] args) {

        Integer[] arr = {3, 30, 34, 5, 9};

        Arrays.sort(arr, (a, b) -> (b + "" + a).compareTo(a + "" + b));

        for (int num : arr) {
            System.out.print(num);
        }
    }
}

Output
9534330
