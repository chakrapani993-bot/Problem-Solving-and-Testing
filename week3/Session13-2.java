import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("ram");
        list.add("sita");
        list.add("hari");

        list.stream()
            .map(name -> name.toUpperCase())
            .forEach(System.out::println);
    }
}

Output
RAM
SITA
HARI
