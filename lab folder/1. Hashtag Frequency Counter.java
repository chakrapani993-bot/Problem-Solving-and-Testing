
import java.util.*;
import java.util.regex.*;

public class HashtagFrequencyCounter {
    public static void main(String[] args) {
        String text = "Java is trending! #Java #Coding #Java #Programming #Coding";

        Pattern pattern = Pattern.compile("#\\w+");
        Matcher matcher = pattern.matcher(text);

        Map<String, Integer> frequency = new LinkedHashMap<>();

        while (matcher.find()) {
            String hashtag = matcher.group().toLowerCase();
            frequency.put(hashtag,
                    frequency.getOrDefault(hashtag, 0) + 1);
        }

        System.out.println("Hashtag Frequency:");

        for (Map.Entry<String, Integer> entry : frequency.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

Hashtag Frequency:
#java : 2
#coding : 2
#programming : 1
```
