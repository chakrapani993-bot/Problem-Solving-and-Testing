import java.util.*;

public class Solution {

    static <T> void printArray(T[] array) {

        for (T element : array) {

            System.out.println(element);
        }
    }

    public static void main(String[] args) {

        Integer[] numbers = {1, 2, 3};

        String[] words = {"Hello", "Java", "Generics"};

        printArray(numbers);

        printArray(words);
    }
}


Output
1
2
3
Hello
Java
Generics
