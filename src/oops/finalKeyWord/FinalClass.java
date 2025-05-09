package finalKeyWord;

// Final Class - Cannot be extended
final class FinalClass {
    // Final Variable - Value cannot be changed
    final int MAX_VALUE = 100;

    // Blank Final Variable - Assigned in constructor
    final int minValue;

    // Static Final Variable - Constant value shared across instances
    static final double PI = 3.14159;

    // Constructor to initialize blank final variable
    FinalClass(int minValue) {
        this.minValue = minValue; // Blank final variable can be assigned only once
    }

    // Final Method - Cannot be overridden
    public final void displayValues() {
        System.out.println("Max Value: " + MAX_VALUE);
        System.out.println("Min Value: " + minValue);
        System.out.println("PI Value: " + PI);
    }
}

class AnotherClass {
    // Final method parameter - Cannot be modified inside the method
    public void calculate(final int num) {
        // num = num + 10; // ERROR - Cannot modify final parameter
        System.out.println("Final parameter: " + num);
    }
}
