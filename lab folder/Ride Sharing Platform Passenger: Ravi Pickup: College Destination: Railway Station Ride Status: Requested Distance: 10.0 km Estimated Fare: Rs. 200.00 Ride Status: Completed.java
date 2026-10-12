
public class RideSharingPlatform {

    static double calculateFare(double distance) {
        double baseFare = 50;
        double ratePerKm = 15;

        return baseFare + (distance * ratePerKm);
    }

    public static void main(String[] args) {
        String passenger = "Ravi";
        String pickup = "College";
        String destination = "Railway Station";
        double distance = 10;

        System.out.println("Ride Sharing Platform");
        System.out.println("Passenger: " + passenger);
        System.out.println("Pickup: " + pickup);
        System.out.println("Destination: " + destination);

        if (distance <= 0) {
            System.out.println("Invalid Distance");
            return;
        }

        System.out.println("Ride Status: Requested");

        double fare = calculateFare(distance);

        System.out.printf("Distance: %.1f km%n", distance);
        System.out.printf("Estimated Fare: Rs. %.2f%n", fare);

        System.out.println("Ride Status: Completed");
    }
}


Ride Sharing Platform
Passenger: Ravi
Pickup: College
Destination: Railway Station
Ride Status: Requested
Distance: 10.0 km
Estimated Fare: Rs. 200.00
Ride Status: Completed
