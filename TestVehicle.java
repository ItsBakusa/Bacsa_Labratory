import java.util.Scanner;

// Base Class: Vehicle
class Vehicle {
    private String brand;
    private int speed;
    private String fuelType;

    // Constructor
    public Vehicle(String brand, int speed, String fuelType) {
        this.brand = brand;
        this.speed = speed;
        this.fuelType = fuelType;
    }

    // Encapsulation: Getter methods
    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    public String getFuelType() {
        return fuelType;
    }

    // Polymorphism: Method Overriding
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Derived class: Car
class Car extends Vehicle {
    private int numDoors;

    // Constructor
    public Car(String brand, int speed, String fuelType, int numDoors) {
        super(brand, speed, fuelType);
        this.numDoors = numDoors;
    }

    // Overriding displayInfo method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numDoors);
    }
}

// Another derived class: Motorcycle
class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    // Constructor
    public Motorcycle(String brand, int speed, String fuelType, boolean hasSidecar) {
        super(brand, speed, fuelType);
        this.hasSidecar = hasSidecar;
    }

    // Overriding displayInfo method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
    }
}

// Main class
public class TestVehicle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Car
        System.out.println("Enter Car details:");
        System.out.print("Brand: ");
        String carBrand = scanner.nextLine();
        System.out.print("Speed (km/h): ");
        int carSpeed = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Fuel Type: ");
        String carFuel = scanner.nextLine();
        System.out.print("Number of Doors: ");
        int numDoors = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        Car car = new Car(carBrand, carSpeed, carFuel, numDoors);

        // Input for Motorcycle
        System.out.println("\nEnter Motorcycle details:");
        System.out.print("Brand: ");
        String motoBrand = scanner.nextLine();
        System.out.print("Speed (km/h): ");
        int motoSpeed = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Fuel Type: ");
        String motoFuel = scanner.nextLine();
        System.out.print("Has Sidecar (true/false): ");
        boolean hasSidecar = scanner.nextBoolean();

        Motorcycle motorcycle = new Motorcycle(motoBrand, motoSpeed, motoFuel, hasSidecar);

        // Display information
        System.out.println("\nCar Details:");
        car.displayInfo();
        
        System.out.println("\nMotorcycle Details:");
        motorcycle.displayInfo();

        scanner.close();
    }
}
