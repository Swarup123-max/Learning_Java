package InterfacesEx;

public class test {
    public static void main(String[] args) {
        // Create Dog object and call methods
        Animal dog = new Dog();
        dog.eat();   // Output: Dog eats bones.
        dog.sleep(); // Output: Dog sleeps in its kennel.
       
System.out.println(Dog.a);
        // Create Cat object and call methods
        Animal cat = new Cat();
        cat.eat();   // Output: Cat eats fish.
        cat.sleep(); // Output: Cat sleeps on the couch.
        Animal.sleeping();
        cat.running();
        
    }

}
