package Abstraction;

// Abstract class
abstract class Vehicle {
    // Abstract method (doesn't have a body)
    abstract void start();
int n =10;
    // Regular method
    void stop() {
        System.out.println("Vehicle is stopping...");
    }
}

// Subclass inheriting from Vehicle
class Car extends Vehicle {
    // Implementing the abstract method
    @Override
    void start() {
        System.out.println("Car is starting with a key...");
    }
}

// Another subclass inheriting from Vehicle
class Bike extends Vehicle {
    // Implementing the abstract method
    @Override
    void start() {
        System.out.println("Bike is starting with a kick...");
    }
}

// Main class
public class q1 {
    public static void main(String[] args) {
        //you can take the reference of abstract class but cannot make an object of abstract class
        
        // Create Car object
        Vehicle myCar = new Car();
        myCar.start();  // Calls Car's start method
        myCar.stop();   // Calls Vehicle's stop method

        // Create Bike object
        Vehicle myBike = new Bike();
        myBike.start(); // Calls Bike's start method
        myBike.stop();  // Calls Vehicle's stop method
    }
}
