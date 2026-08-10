import java.util.*;

class Solution {
    public String reformatDate(String date) {

        String[] arr = date.split(" ");

        HashMap<String, String> map = new HashMap<>();

        map.put("Jan", "01");
        map.put("Feb", "02");
        map.put("Mar", "03");
        map.put("Apr", "04");
        map.put("May", "05");
        map.put("Jun", "06");
        map.put("Jul", "07");
        map.put("Aug", "08");
        map.put("Sep", "09");
        map.put("Oct", "10");
        map.put("Nov", "11");
        map.put("Dec", "12");

        String day = arr[0].substring(0, arr[0].length() - 2);

        if (day.length() == 1) {
            day = "0" + day;
        }

        return arr[2] + "-" + map.get(arr[1]) + "-" + day;
    }
}

output:"2052-10-20"
