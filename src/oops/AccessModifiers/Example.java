package AccessModifiers;

// Parent class
class Animal {
    // Public variable - accessible from anywhere
    public String name = "Lion";

    // Private variable - accessible only within this class
    private int age = 5;

    // Protected variable - accessible within package and subclasses
    protected String sound = "Roar";

    // Default variable - accessible only within the same package
    String type = "Wild Animal";

    // Public method - accessible from anywhere
    public void displayName() {
        System.out.println("Animal Name: " + name);
    }

    // Private method - accessible only within this class
    private void displayAge() {
        System.out.println("Animal Age: " + age);
    }

    // Protected method - accessible within package and subclasses
    protected void displaySound() {
        System.out.println("Animal Sound: " + sound);
    }

    // Default method - accessible only within the same package
    void displayType() {
        System.out.println("Animal Type: " + type);
    }

    // Method to demonstrate calling private method
    public void showAge() {
        displayAge();  // Calling private method
    }
}

// Subclass in the same package
class Dog extends Animal {
    // Method to demonstrate access to protected and public methods
    void showDetails() {
        System.out.println("Dog Name: " + name);  // Public - accessible
        System.out.println("Dog Sound: " + sound); // Protected - accessible
        System.out.println("Dog Type: " + type);  // Default - accessible
        // System.out.println("Dog Age: " + age);  // Private - NOT accessible

        displayName();   // Public method - accessible
        displaySound();  // Protected method - accessible
        displayType();   // Default method - accessible
        // displayAge();  // Private method - NOT accessible
    }
}

// Main class to test access modifiers
public class Example {
    public static void main(String[] args) {
        // Create an object of Animal
        Animal animal = new Animal();
        animal.displayName();   // Public method - accessible
        animal.displayType();   // Default method - accessible
        animal.showAge();       // Indirectly accessing private method

        // Create an object of Dog
        Dog dog = new Dog();
        dog.showDetails();  // Demonstrate access within subclass
    }
}
