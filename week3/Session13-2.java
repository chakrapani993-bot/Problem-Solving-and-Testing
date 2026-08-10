import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);
        list.add(30);

        list.stream()
            .filter(n -> n % 2 == 0)
            .forEach(System.out::println);
    }
}
Output
10
20
30
