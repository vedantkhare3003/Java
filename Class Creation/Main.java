// Defining a class
class Car {
    // Fields (variables)
    String brand;
    int speed;

    // Constructor
    Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Method to display details
    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        // Creating an object of Car
        Car myCar = new Car("Toyota", 120);

        // Calling a method
        myCar.displayInfo();
    }
}
