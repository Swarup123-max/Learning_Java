package PolymorphysmEx;

// Parent class
class Animal {
    // Method to be overridden
    void makeSound() {
        System.out.println("Animal makes a sound...");
    }
}

// Subclass 1
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks...");
    }
}

// Subclass 2
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows...");
    }
}

// Demonstrating Method Overloading
class Calculator {
    // Add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Add two double values
    double add(double a, double b) {
        return a + b;
    }
}

// Main class
public class q1 {
    public static void main(String[] args) {
        // Runtime Polymorphism (Method Overriding)
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myAnimal.makeSound();  // Calls Animal's makeSound()
        myDog.makeSound();     // Calls Dog's makeSound()
        myCat.makeSound();     // Calls Cat's makeSound()

        // Compile-time Polymorphism (Method Overloading)
        Calculator calc = new Calculator();
        System.out.println("Sum of 5 and 10: " + calc.add(5, 10));
        System.out.println("Sum of 3, 7, and 2: " + calc.add(3, 7, 2));
        System.out.println("Sum of 4.5 and 3.2: " + calc.add(4.5, 3.2));
    }
}
