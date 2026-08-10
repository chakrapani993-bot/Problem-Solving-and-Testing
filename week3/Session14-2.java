import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(30);
        list.add(10);
        list.add(20);

        Collections.sort(list, (a, b) -> a - b);

        System.out.println(list);
    }
}

Output
[10, 20, 30]
