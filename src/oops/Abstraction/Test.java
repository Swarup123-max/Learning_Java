package Abstraction;

// Abstract class
abstract class Animal {
    public abstract void sayHello(); // Abstract method

    public void sleep()// normal method
    {
        System.out.println("zzz...");
    }
}

// Subclass Dog extending Animal
class Dog extends Animal {
    @Override
    public void sayHello() {
        System.out.println("woof! woof!");
    }
}

// Main class
public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();

        // ✅ Calling the methods
        dog.sayHello(); // Should print "woof! woof!"
        dog.sleep(); // Should print "zzz..."

    }
}
