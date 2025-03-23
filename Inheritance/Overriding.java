// Parent Class
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

// Child Class
class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car is starting with a key...");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Vehicle myCar = new Car();  // Upcasting
        myCar.start();  // Calls the overridden method in Car
    }
}
