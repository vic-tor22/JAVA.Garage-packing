import java.util.ArrayList;
import java.util.List;

// Class representing a vehicle
class Vehicle {
    private String licensePlate;

    // Constructor to initialize the vehicle with a license plate
    public Vehicle(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    // Getter method to retrieve the license plate of the vehicle
    public String getLicensePlate() {
        return licensePlate;
    }
}

// Class representing a parking lot
class ParkingLot {
    private int capacity;
    private List<Vehicle> parkedVehicles;

    // Constructor to initialize the parking lot with a given capacity
    public ParkingLot(int capacity) {
        this.capacity = capacity;
        this.parkedVehicles = new ArrayList<>(); // Initialize list to store parked vehicles
    }

    // Method to park a vehicle in the parking lot
    public boolean parkVehicle(Vehicle vehicle) {
        // Check if the parking lot has available space
        if (parkedVehicles.size() < capacity) {
            parkedVehicles.add(vehicle); // Park the vehicle
            return true; // Return true indicating successful parking
        } else {
            System.out.println("Parking lot is full."); // Display message if parking lot is full
            return false; // Return false indicating unsuccessful parking
        }
    }

    // Method to print the list of parked vehicles
    public void printParkedVehicles() {
        System.out.println("Parked Vehicles:");
        for (Vehicle vehicle : parkedVehicles) {
            System.out.println(vehicle.getLicensePlate()); // Print the license plate of each parked vehicle
        }
    }
}

// Main class to demonstrate the usage of Vehicle and ParkingLot classes
public class Garage {
    public static void main(String[] args) {
        // Create a parking lot with capacity of 5
        ParkingLot parkingLot = new ParkingLot(5);

        // Create some vehicles
        Vehicle car1 = new Vehicle("KDA234Q");
        Vehicle car2 = new Vehicle("GKC365A");
        Vehicle car3 = new Vehicle("KCU221W");
        Vehicle car4 = new Vehicle("KAZ978D");
        Vehicle car5 = new Vehicle("KDD22F");
        Vehicle car6 = new Vehicle("28CG123D"); // This vehicle will not be parked because parking lot is full

        // Park vehicles in the parking lot
        parkingLot.parkVehicle(car1);
        parkingLot.parkVehicle(car2);
        parkingLot.parkVehicle(car3);
        parkingLot.parkVehicle(car4);
        parkingLot.parkVehicle(car5);
        parkingLot.parkVehicle(car6); // Trying to park the 6th vehicle

        // Print the list of parked vehicles
        parkingLot.printParkedVehicles();
    }
}

