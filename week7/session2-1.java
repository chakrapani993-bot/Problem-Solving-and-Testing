import java.util.*;

class UndergroundSystem {

    class CheckIn {
        String station;
        int time;

        CheckIn(String station, int time) {
            this.station = station;
            this.time = time;
        }
    }

    class Route {
        int totalTime;
        int count;

        Route(int totalTime, int count) {
            this.totalTime = totalTime;
            this.count = count;
        }
    }

    Map<Integer, CheckIn> checkIns = new HashMap<>();
    Map<String, Route> routes = new HashMap<>();

    public UndergroundSystem() {
    }

    public void checkIn(int id, String stationName, int t) {

        checkIns.put(id, new CheckIn(stationName, t));
    }

    public void checkOut(int id, String stationName, int t) {

        CheckIn c = checkIns.get(id);

        int travelTime = t - c.time;

        String route = c.station + "#" + stationName;

        if (!routes.containsKey(route)) {

            routes.put(route, new Route(travelTime, 1));

        } else {

            Route r = routes.get(route);

            r.totalTime += travelTime;
            r.count++;
        }

        checkIns.remove(id);
    }

    public double getAverageTime(String startStation,
                                 String endStation) {

        String route = startStation + "#" + endStation;

        Route r = routes.get(route);

        return (double) r.totalTime / r.count;
    }
}


Input
["UndergroundSystem",
 "checkIn",
 "checkIn",
 "checkOut",
 "checkOut",
 "getAverageTime"]

[[],
 [45,"Leyton",3],
 [32,"Paradise",8],
 [45,"Waterloo",15],
 [32,"Cambridge",22],
 ["Paradise","Cambridge"]]

Output
[null, null, null, null, null, 14.0]
