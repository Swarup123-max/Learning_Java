package AccessModifiers.zoo;

public class Dog extends Animal {

    public Dog(String name) {
            super(Sound, name);
    }
public void wagTail(){
    System.out.println(getName() +" is waging its tails");
}
    
}