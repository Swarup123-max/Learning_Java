package InterfacesEx;
// Class Dog implements the Animal interface
class Dog implements Animal {
    // Providing implementation for eat() method
    @Override
    public void eat() {
        System.out.println("Dog eats bones.");
    }

    // Providing implementation for sleep() method
    @Override
    public void sleep() {
        System.out.println("Dog sleeps in its kennel.");
    }
}

