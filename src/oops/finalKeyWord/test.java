package finalKeyWord;

public class test{
    public static void main(String[] args) {
        // Creating object of final class
        FinalClass obj = new FinalClass(50);
        obj.displayValues();

        // Demonstrating final reference behavior
        final StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Initial value: " + sb);

        // Modifying the internal state of the object is allowed
        sb.append(" World");
        System.out.println("Modified value: " + sb);

        // Trying to reassign the final reference results in an error
        // sb = new StringBuilder("New"); // ERROR - Cannot reassign final reference

        // Demonstrating final parameter
        AnotherClass another = new AnotherClass();
        another.calculate(25);
    }
}

