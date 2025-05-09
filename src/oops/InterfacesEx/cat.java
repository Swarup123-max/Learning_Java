package InterfacesEx;

// Class Cat implements the Animal interface
class Cat implements Animal {
    // Providing implementation for eat() method
   
    public void eat() {
        System.out.println("Cat eats fish.");
    }

    // Providing implementation for sleep() method
    public  void sleep() {
        System.out.println("Cat sleeps on the couch.");
    }
}