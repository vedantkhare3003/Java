// Defining a class
class Car {
    // Instance variables (state)
    String brand;
    int speed;

    // Constructor (used to initialize objects)
    Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Method (behavior)
    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

// Main class to create objects
public class Main {
    public static void main(String[] args) {
        // Creating objects of Car class
        Car car1 = new Car("Toyota", 120);
        Car car2 = new Car("BMW", 150);

        // Calling method on objects
        car1.displayInfo();
        car2.displayInfo();
    }
}
